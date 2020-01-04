package com.mashensoft.bus.userControl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mashensoft.bus.model.User;
import com.mashensoft.bus.service.UserService;
import com.mashensoft.bus.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.net.URL;
import java.util.List;
import java.util.Scanner;

@RestController
public class WeiXinUtil {
    @Autowired
    UserService userService;

    @RequestMapping("/config")
    public String WeiXinConfig(String echostr) {
        System.out.println("---------");
        System.out.println(echostr);
        return echostr;
    }

    private JSONObject getWeiXinToken(String code) throws Exception {
        String str = "https://api.weixin.qq.com/sns/oauth2/access_token?appid" +
                "=wx8ab51aa00c0248e8&secret=6c0494e0a44390bf8f2db8e9082d0730" +
                "&code=" + code + "&grant_type=authorization_code";
//        System.out.println(str);
        URL url = new URL(str);
        Scanner s = new Scanner(url.openStream());
        StringBuffer sb = new StringBuffer();
        while (s.hasNext()) {
            sb.append(s.nextLine());
        }

        JSONObject jo = JSON.parseObject(sb.toString());
        return jo;
    }

    @RequestMapping("/getUserInfo")
    public JSONObject getUserInfoOuter(String code) throws Exception {
        JSONObject jo = this.getWeiXinToken(code);
        String access_token = (String) jo.get("access_token");
        String openid = (String) jo.get("openid");
        System.out.println(".....");
        return this.getUserInfo(openid, access_token);
    }

    /**
     * 获取用户信息
     *
     * @param openId
     * @return
     */
    private JSONObject getUserInfo(String openId, String accessToken) throws Exception {
        JSONObject obj = null;
        String str = "https://api.weixin.qq" +
                ".com/sns/userinfo?access_token=" + accessToken + "&openid=" + openId + "&lang" +
                "=zh_CN";
        URL url = new URL(str);
        Scanner s = new Scanner(url.openStream());
        StringBuffer sb = new StringBuffer();
        while (s.hasNext()) {
            sb.append(s.nextLine());
        }
        String tokenId = getTokenId(openId);

        JSONObject jo = JSON.parseObject(sb.toString());
        jo.put("tokenId", tokenId);
        return jo;
    }

    /**
     * 获取用户id,
     */
    public String getTokenId(String openid) {
        //判断用户是否存在，
        List<User> userList = userService.getUserByOpenId(openid);
        String result = null;
        if (userList.size() == 0) {
            //没有用户
            //生成用户
            User userObject = new User();
            //TODO   userObject.setOpenId(openId)
            userObject.setOpenid(openid);
            userObject.setUptownId(1);
            userService.addUser(userObject);
            List<User> u = userService.getUserByOpenId(openid);
            Integer userId = 0;
            int uptownId = 0;
            for (int j = 0; j < u.size(); j++) {
                userId = u.get(j).getUserId();
            }
                result = JwtHelper.sign(userId, 60 * 1000 * 60);

            //获取到用户id

        } else {
            //存在用户
//            User u =  userService.getUserByOpenId(openid);
            List<User> u = userService.getUserByOpenId(openid);
            Integer userId = 0;
            int uptownId = 0;
            for (int j = 0; j < u.size(); j++) {
                userId = u.get(j).getUserId();
            }
            result = JwtHelper.sign(userId,60*60*100);

        }


        return result;
    }


    //不存在


    //生成用户
    //获取到用户id

    //存在，读出来


    //使用jwt，把用户id编码 ，返回


}
