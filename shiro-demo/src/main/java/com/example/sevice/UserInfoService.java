package com.example.sevice;

import com.example.model.UserInfo;
import com.example.model.UserVo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);

    /**
     * 注册用户信息
     * @param userInfo
     */
    void register(UserVo userInfo);
}