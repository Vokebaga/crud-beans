<%-- 
    Document   : read
    Created on : 14 февр. 2024 г., 23:27:29
    Author     : aset_
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Notes List</title>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
    <h1>Notes List</h1>
    <table border="1">
        <tr>
            <th>Title</th>
            <th>Text</th>
            <th>Date</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${notes}" var="note">
            <tr>
                <td>${note.title}</td>
                <td>${note.text}</td>
                <td>${note.date}</td>
                <td><a href="${pageContext.request.contextPath}/note/edit/${note.id}">Edit</a></td>
                <td><a href="${pageContext.request.contextPath}/note/delete/${note.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="${pageContext.request.contextPath}/note/add">Add Note</a>
</body>
</html>

