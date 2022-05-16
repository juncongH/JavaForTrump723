<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: hjc
  Date: 2022/5/16
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>编号</td>
        <td>名称</td>
        <td>数量</td>
        <td>作者</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${list}">
        <tr>
            <td>${book.id}</td>
            <td>${book.bookname}</td>
            <td>${book.booknum}</td>
            <td>${book.author}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
