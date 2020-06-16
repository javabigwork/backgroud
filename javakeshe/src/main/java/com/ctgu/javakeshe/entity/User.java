package com.ctgu.javakeshe.entity;

import java.util.Date;

public class User {
    private String openId;
    private String nickName;
    private Date lastLoginTime;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "openId='" + openId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                '}';
    }
}
