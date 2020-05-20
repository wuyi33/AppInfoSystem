package com.jbit.service;

import com.jbit.entity.DevUser;
import com.jbit.mapper.DevUserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class DevUserService {

    @Resource
    private DevUserMapper devUserMapper;

    /**
     * 用户登录
     * @param devcode
     * @param pwd
     * @return
     */
    public DevUser queryLogin(String devcode,String pwd){
        DevUser devUser = new DevUser();
        devUser.setDevcode(devcode);
        devUser.setDevpassword(pwd);
        return devUserMapper.selectOne(devUser);
    }
}
