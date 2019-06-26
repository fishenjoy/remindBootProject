package com.zzy.pojo;


import java.io.Serializable;

public class UserEntity implements  Serializable{

    private static final long serialVersionUID = 1L;
    private String userName;
    private Long userId;

    @Override
    public String toString() {
        return "UserEntity{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
