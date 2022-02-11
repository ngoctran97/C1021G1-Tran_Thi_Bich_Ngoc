<%--
  Created by IntelliJ IDEA.
  User: tranvantrong
  Date: 11/02/2022
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit product</title>
</head>
<body>
<h1>Edit product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${requestScope["product"].getName()}"></td>
            </tr>
            <tr>product
                <td><input type="text" name="price" id="price" value="${requestScope["product"].getEmail()}"></td>
            </tr>
            <tr>
                <td>Mô tả: </td>
                <td><input type="text" name="moTa" id="moTa" value="${requestScope["product"].getAddress()}"></td>
            </tr>
            <tr>
                <td>Nhà sản xuất: </td>
                <td><input type="text" name="nhaSX" id="nhaSX" value="${requestScope["product"].getAddress()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update "></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
