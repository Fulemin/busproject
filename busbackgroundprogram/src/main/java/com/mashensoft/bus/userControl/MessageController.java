package com.mashensoft.bus.userControl;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class MessageController {

    @RequestMapping(value = "/SendMessage/{phone}",method = RequestMethod.GET)
    public void SendMessage(@PathVariable String phone){
        System.out.println(phone);
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4Fq3Ayj1nEnGc639mbKu", "9sby31LV6vKDOhOnOr5E53eI2x4f8M");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "仿巴士软件");
        request.putQueryParameter("TemplateCode", "SMS_181202458");

        //todo 生成随机数验证码
        Random random = new Random();
        int code= random.nextInt(10000);

        System.out.println(code);
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");
        System.out.println("55555555555555555555555");
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


}
