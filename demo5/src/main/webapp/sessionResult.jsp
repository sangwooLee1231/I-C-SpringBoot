<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    if (session.getAttribute("check") != null) { // 세션 설정 O
        out.println("<h1>현재 체크상태는 ok입니다.</h1>");
    } else { //세션 설정 X
        out.println("check <input type='checkbox'>");
    }
%>





</body>
</html>