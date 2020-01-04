package com.mashensoft.bus.userControl;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.mashensoft.bus.service.CodeService;
import com.mashensoft.bus.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Random;

@RestController
public class CodeController {
    @Autowired
    CodeService codeService;

    @RequestMapping(value = "/SendMessage",method = RequestMethod.POST)
    public void sendMessage(@PathVariable@RequestBody Map<String,String> map){
        //todo 获取解码后的userId
        String uId =map.get("userId");
        Integer userId = JwtHelper.unsign(uId, Integer.class);

        //todo 获取phone
        String userPhone = map.get("userPhone");

        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4Fq3Ayj1nEnGc639mbKu", "9sby31LV6vKDOhOnOr5E53eI2x4f8M");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", userPhone);
        request.putQueryParameter("SignName", "仿巴士软件");
        request.putQueryParameter("TemplateCode", "SMS_181202458");

        //todo 生成随机数验证码
        Random random = new Random();
        int code= random.nextInt(10000);
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");

        //todo 放入数据库
        codeService.addVerificationCode(code,userPhone,userId);
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (
                ClientException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "/SendCode",method = RequestMethod.POST)
    public int sendCode(@PathVariable@RequestBody Map<String,String> map){
        //todo 获取解码后的userId
        String uId =map.get("userId");
        Integer userId = JwtHelper.unsign(uId, Integer.class);

        //todo 获取phone
        String userPhone = map.get("userPhone");
        int codeValue = Integer.parseInt(map.get("codeValue"));
        int result = codeService.addVerificationCode(codeValue,userPhone,userId);
        System.out.println(result);
        return result;
    }
}
