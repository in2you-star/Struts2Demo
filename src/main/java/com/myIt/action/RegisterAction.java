package com.myIt.action;

import com.myIt.pojo.User;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
    private User user;
    private String regMessage;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRegMessage() {
        return regMessage;
    }

    public void setRegMessage(String regMessage) {
        this.regMessage = regMessage;
    }

    public String register(){
        String res = SUCCESS;
        if (user.getUsername().equals("admin")){
            this.setRegMessage("注册失败，用户名已被注册");
            res = INPUT;
        }else {
            this.setRegMessage("注册成功");
            res = SUCCESS;
        }
        return res;
    }
    public String login(){
        String res = SUCCESS;
        System.out.println("*************");
        if (user.getUsername().equals("admin")){
            this.setRegMessage("登录成功");
            res = "loginSuccess";
        }else {
            this.setRegMessage("用户名或密码有误");
            res = INPUT;
        }
        return res;
    }
}
