<%--
  Created by IntelliJ IDEA.
  User: tranvantrong
  Date: 14/02/2022
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--Không cần khai báo action bởi vì chúng ta sẽ sử dụng lại URL cũ.--%>
<form method="post">
    Code Student : <input type="text" name="codeStudent"> <br>
    Name Student : <input type="text" name="nameStudent"> <br>
    Birthday : <input type="date" name="birthday"> <br>
    Email : <input type="text" name="email"> <br>
    Point: <input type="number" name="point"><br>
    <button type="submit">Create Student</button>
</form>

</body>
</html>
