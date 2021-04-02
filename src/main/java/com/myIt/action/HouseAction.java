package com.myIt.action;

import com.myIt.pojo.House;
import com.myIt.pojo.Street;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class HouseAction extends ActionSupport {
    private House house;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String execute() throws Exception {
        Street s1=new Street(10, "天河街");
        house=new House(100,"两房一厅",s1);

        //request,session,accplication
        ActionContext context=ActionContext.getContext();

        Map request=(Map)context.get("request");
        request.put("myhouse", "我的房屋信息");
        Map  session=context.getSession();
        session.put("city", "广州");
        session.put("houses", house);
        Map application=context.getApplication();
        application.put("address", "中山大道");

        return SUCCESS;
    }
}
