<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Chap05 Exercise1 and Exercise2 Email and Test</title>
    <link rel="stylesheet" href="ch05_ex1_ex2_email/styles/style.css" type="text/css"/>
</head>
<body>
<h1>Join our email list Chap5 Ex1 </h1>
<p>To join our email list, enter your name and
    email address below.</p>
<p><i>${message}</i></p>
<form action="emailList" method="post">
    <input type="hidden" name="action" value="add">
    <label class="pad_top">Email:</label>
    <input type="email" name="email" value="${user.email}"><br>
    <label class="pad_top">First Name:</label>
    <input type="text" name="firstName" value="${user.firstName}"><br>
    <label class="pad_top">Last Name:</label>
    <input type="text" name="lastName" value="${user.lastName}"><br>
    <label>&nbsp;</label>
    <input type="submit" value="Join Now" class="margin_left">
</form>

<h1>Join our Test Exercise Chap5 Exercise 2</h1>
<form action="test" method="post">

    <input type="submit" value="Join Now" class="margin_left">
</form>
</body>
</html>