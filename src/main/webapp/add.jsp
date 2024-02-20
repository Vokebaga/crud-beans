<%-- 
    Document   : add
    Created on : 14 февр. 2024 г., 23:26:39
    Author     : aset_
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Note</title>
</head>
<body>
    <h1>Add Note</h1>
    <form action="${pageContext.request.contextPath}/note/add" method="post">
        <label>Title:</label>
        <input type="text" name="title"><br>
        <label>Text:</label>
        <textarea name="text" rows="4" cols="50"></textarea><br>
        <input type="submit" value="Add">
    </form>
</body>
</html>

