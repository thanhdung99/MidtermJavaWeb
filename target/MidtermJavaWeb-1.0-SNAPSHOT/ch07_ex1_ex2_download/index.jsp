<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Chap07 Exercise 1 and Exercise 2 Music Store</title>
    <link rel="stylesheet" href="/ch07_ex1_ex2_download/styles/main.css" type="text/css"/>
</head>
<body>

<h1>List of albums</h1>

<p>User Email: ${cookie.userEmail.value}</p>

<p>
<a href="/ch07_ex1_ex2_download/download?action=checkUser&amp;productCode=8601">
    86 (the band) - True Life Songs and Pictures
</a><br>

<a href="/ch07_ex1_ex2_download/download?action=checkUser&amp;productCode=pf01">
    Paddlefoot - The First CD
</a><br>

<a href="/ch07_ex1_ex2_download/download?action=checkUser&amp;productCode=pf02">
    Paddlefoot - The Second CD
</a><br>

<a href="/ch07_ex1_ex2_download/download?action=checkUser&amp;productCode=jr01">
    Joe Rut - Genuine Wood Grained Finish
</a>
</p>

</body>
</html>