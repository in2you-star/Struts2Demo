package com.myIt.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class IndexAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("登录成功");
        ActionContext context=ActionContext.getContext();
        Map<String, Object> session=context.getSession();
        session.put("loginInfo", "登录成功");
        return SUCCESS;
    }
}
