<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2024-12-23
  Time: 오전 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>쿠키 정보 가지고 오기</h1>
    <%
        Cookie[] cookies = request.getCookies();

        for(Cookie cookie : cookies)
        {
            if(cookie != null && !cookie.getName().equals("JSESSIONID"))
                out.println("쿠키 이름: " + cookie.getName() + "  쿠키 값: "+cookie.getValue() + "<br>");
            if(cookie.getName().equals("adTracker")) {
                out.println("광고를 클릭하셨군요.!!");
                out.println("고객님의 정보는 " + cookie.getValue() + "님입니다.<br>");
            }
        }


    %>
</body>
</html>
