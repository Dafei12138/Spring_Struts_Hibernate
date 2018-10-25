<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="struts" %>
<html>
<head>
    <struts:head theme="xhtml"/>
</head>
<body>
    <a href="<struts:url action="initAddBook"/> ">添加书籍</a>
    <a href="<struts:url action="listBook"/> ">书籍列表</a>
    <a href="<struts:url action="clearBook"/> ">清空书籍</a>

    <p>${title}</p>
</body>
</html>