<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>View All Cookie</title>
    <link rel="stylesheet" href="/ch07_ex1_ex2_download/styles/main.css" type="text/css"/>
</head>
<body>

<h1>Cookies</h1>

<p>Here's a table with all of the cookies that this 
browser is sending to the current server.</p>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
  <tr>
    <th>Name</th>
    <th>Value</th>
  </tr>
  <c:forEach var="c" items="${cookie}">      
  <tr>
    <td>${c.value.name}</td>
    <td>${c.value.value}</td>
  </tr>
  </c:forEach>  
</table>

<p><a href="download?action=viewAlbums">View list of albums</a></p>

<p><a href="download?action=deleteCookies">Delete all persistent cookies</a></p>

</body>
</html>