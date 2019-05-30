package com.example.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * UserInfo的扩展类，用户接受UserInfo不能接收的数据
 */
public class UserVo implements Serializable {

    private Integer uid;
    private String username;//帐号
    private String name;//名称（昵称或者真实姓名，不同系统不同定义）
    private String password; //密码;
    private String salt;//加密密码的盐
    private byte state;//用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.
    private String roles;// 一个用户具有多个角色

    public UserVo(Integer uid, String username, String name, String password, String salt, byte state, String roles) {
        this.uid = uid;
        this.username = username;
        this.name = name;
        this.password = password;
        this.salt = salt;
        this.state = state;
        this.roles = roles;
    }

    public UserVo() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
