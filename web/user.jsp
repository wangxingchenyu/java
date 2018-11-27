<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wangzhilei
  Date: 2018/11/27
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <title>第一个java_web</title>
</head>
<body>
<div id="main" class="container">
    <table class="table table-bordered">
        <tr>
            <th>ID</th>
            <th>业务</th>
            <th>第一联系人</th>
        </tr>

        <c:forEach items="${requestScope.users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.yewu}</td>
                <td>${user.diyiname}</td>
            </tr>
        </c:forEach>
    </table>


</div>
</body>
</html>


