package com.mashensoft.bus.service;

public interface CodeService {
    public int selectVerificationCode(int code,String userPhone,int userId);
    public int addVerificationCode(int code,String userPhone,int userId);
}
