<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wangzhilei
  Date: 2018/11/27
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <style>
        #one {
            width: 1200px;
            height: 300px;
            background: #c00;
        }
    </style>
</head>
<body>
<%

    int[] arr = new int[3];
    arr[0] = 0;
    arr[1] = 1;
    arr[2] = 2;
    request.setAttribute("list", arr);
    request.setAttribute("username", "alex");
    request.setAttribute("age", 10);

%>

<c:out value="${requestScope.username}"></c:out>


</body>
</html>
