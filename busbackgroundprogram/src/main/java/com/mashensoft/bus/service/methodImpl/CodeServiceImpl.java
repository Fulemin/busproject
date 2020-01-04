package com.mashensoft.bus.service.methodImpl;

import com.mashensoft.bus.mapper.CodeMapper;
import com.mashensoft.bus.model.Code;
import com.mashensoft.bus.model.CodeExample;
import com.mashensoft.bus.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeServiceImpl implements CodeService {
    @Autowired
    CodeMapper codeMapper;


    @Override
    public int selectVerificationCode(int code, String userPhone, int userId) {
        CodeExample codeExample = new CodeExample();
        codeExample.createCriteria().andCodeValueEqualTo(code).andUserIdEqualTo(userId).andUserPhoneEqualTo(userPhone);
        List list = codeMapper.selectByExample(codeExample);
        if(list.size() == 0){
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public int addVerificationCode(int code, String userPhone, int userId) {
        Code codeExample = new Code();
        codeExample.setCodeValue(code);
        codeExample.setUserId(userId);
        codeExample.setUserPhone(userPhone);
        return codeMapper.insert(codeExample);
    }
}
