package com.example.sevice.impl;

import com.example.dao.RoleDao;
import com.example.dao.UserInfoDao;
import com.example.model.SysRole;
import com.example.model.UserInfo;
import com.example.model.UserVo;
import com.example.sevice.UserInfoService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;

    @Resource
    private RoleDao roleDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }

    @Override
    public void register(UserVo userInfo) {
        UserInfo user = new UserInfo();
        String password = new SimpleHash("MD5",userInfo.getPassword(),userInfo.getName(),2).toHex();
        String salt = UUID.randomUUID().toString().replace("-","");
        user.setName(userInfo.getName());
        user.setPassword(password);
        user.setSalt(salt);
        user.setState((byte) 0);
        userInfoDao.save(user);


        UserInfo byUsername = userInfoDao.findByUsername(userInfo.getUsername());

        String roles = userInfo.getRoles();
        SysRole sysRole = roleDao.findById(Integer.parseInt(roles)).get();
        if( null != sysRole ){
            byUsername.getRoleList().add(sysRole);
            userInfoDao.save(byUsername);
        }
    }
}