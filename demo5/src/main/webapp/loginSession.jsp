<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    if (session.getAttribute("loginId") != null) {
        out.println("로그인 중..");
        out.println("<a href='logout.do'>로그아웃</a>");
    } else {
%>
<form action="sessionSet.jsp">
    id입력: <input name="id" value="root"> <br>
    pw입력: <input name="pw" value="1234"> <br>
    <button type="submit"> 서버로 전송</button>
</form>
<%
    } //java else
%>
</body>
</html>