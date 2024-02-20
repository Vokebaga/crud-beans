<%-- 
    Document   : edit
    Created on : 14 февр. 2024 г., 23:27:16
    Author     : aset_
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Note</title>
</head>
<body>
    <h1>Edit Note</h1>
    <form action="${pageContext.request.contextPath}/note/edit" method="post">
        <label>Title:</label>
        <input type="text" name="title" value="${note.title}"><br>
        <label>Text:</label>
        <textarea name="text" rows="4" cols="50">${note.text}</textarea><br>
        <input type="hidden" name="index" value="${param.index}">
        <input type="submit" value="Save">
    </form>
</body>
</html>
