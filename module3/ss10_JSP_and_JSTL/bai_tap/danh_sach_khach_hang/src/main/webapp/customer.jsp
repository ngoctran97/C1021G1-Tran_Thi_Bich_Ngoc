<%--
  Created by IntelliJ IDEA.
  User: tranvantrong
  Date: 07/02/2022
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh Sách Khách Hàng</h1>
<table border="1">
    <tr>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa Chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="customer" items="${list}">
    <tr>
        <td><c:out value="${customer.name}"></c:out></td>
        <td><c:out value="${customer.birthday}"></c:out></td>
        <td><c:out value="${customer.address}"></c:out></td>

        <td><img src="${customer.photo}" alt="photo" width="100px"></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
