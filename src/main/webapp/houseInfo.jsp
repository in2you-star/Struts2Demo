<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2021/3/25
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
ognl 房屋标题:<s:property value="house.title"/>
<br/>
街道:
<s:property value="house.street.streetname"/>
<hr/>
<s:property value="#request.myhouse"/>
<br/>
<s:property value="#request['myhouse']"/>
<br/>
<s:property value="#session.city"/>
<br/>
<s:property value="#session.houses.title"/>
<br/>
<s:property value="#session.houses.street.streetname"/>
<br/>
<s:property value="#application.address"/>
<br/><hr/>
<s:property value="#attr.myhouse"/>
<br/>
<s:property value="#attr.city"/>
<br/>
<s:property value="#attr.address"/>
<br/>
<hr/>
<s:set name="myname" value="'zhangsan'" scope="request"></s:set>
<s:property value="#request.myname"/>

<s:debug></s:debug>
</body>
</html>
