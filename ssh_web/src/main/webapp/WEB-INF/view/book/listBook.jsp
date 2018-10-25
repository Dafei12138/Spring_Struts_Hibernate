<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="struts" %>

<%--<title><struts:property value="title" escapeXml="false"/> </title>--%>

<table>
    <tr>
        <th>书名</th>
        <th>作者</th>
        <th>出版日期</th>
    </tr>
    <struts:iterator value="bookList" var="book">
        <tr>
            <td>${ book.name }</td>
            <td>${ book.author }</td>
            <td>${ book.publishDate }</td>
        </tr>
    </struts:iterator>
</table>