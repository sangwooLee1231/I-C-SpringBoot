<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>해당 페이지는 광고를 포함하고 있습니다.</h1>
<%
    Cookie[] cookies = new Cookie[4];
    cookies[0] = new Cookie("adTracker", "user12345");
    cookies[1] = new Cookie("adCompany", "shinsegae");
    cookies[2] = new Cookie("Count", "5");
    cookies[3] = new Cookie("pay", "ok");
    for (int i = 0; i < cookies.length; i++) {
        cookies[i].setMaxAge(60 * 10);
        response.addCookie(cookies[i]);
    }


%>
<h1>광고 페이지를 클릭하셨습니다!</h1>
</body>
</html>
