<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
   <c:forEach var="user" items="${userList}">
     用户名 ${user.userName}--- 登录名:${user.loginName}---性别${user.sex} <br/>
   </c:forEach>
</body>
</html>
