<
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录界面</title>
</head>
<body>
<h1>登录</h1>
<s:actionmessage/>
<s:form action="loginPerson" method="post" namespace="/" theme="simple">
    <table width="600px">
        <tr>
            <th>名字</th>
            <td><s:textfield name="name"/></td>
            <td><font color="red"><s:fielderror fieldName="name"/></font></td>
        </tr>
        <tr>
            <th>密码</th>
            <td><s:textfield name="password"/></td>
            <td><font color="red"><s:fielderror fieldName="password"/></font></td>
        </tr>
        <tr>
            <th colspan="2">
                <input type="submit" value="保存"/>
            </th>
        </tr>
    </table>
</s:form>
</body>
</html>