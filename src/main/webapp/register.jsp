<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2021/3/24
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="userregister.action" name="frmReg" method="post">
    <table border="1">
        <tr>
            <td>
                用户名:
            </td>
            <td>
                <input type="text" name="user.username" id="username" value="" />
            </td>
        </tr>
        <tr>
            <td>
                密码:
            </td>
            <td>
                <input type="password" name="user.password" id="password" value="" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" maxlength="btnReg" value="注册" />
            </td>
        </tr>
    </table>
</form>
${requestScope.regerror}
</body>
</html>
