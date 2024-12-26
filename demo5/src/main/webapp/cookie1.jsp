<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 쿠키는 서버에서 클라이언트인 브라우저로 보내는 문자 정보 --%>
<%-- response객체를 활용하고, 자바의 객체, 자바가 필요함 --%>
<%
    // 자바가 들어가는 부분
    // 1. 쿠키 객체 만들기(키, 값의 쌍으로 만든다.)
    Cookie cookie = new Cookie("name", "hong");

    // 2. 쿠키의 유효기간 + 도메인별 설정 등을 설정함.
     cookie.setMaxAge(1000); // 쿠키의 유효기간 설정
    // coockie.setMaxAge(0) 으로 전송하면 쿠키가 삭제됨.
    // 3. 쿠키를 브라우저로 전송
    // HttpServletResponse response = new HttpServletResponse();
    // 하나의 요청당 request, response객체가 tomcat의 servlet Engine에 의해서 만들어짐
    response.addCookie(cookie);

%>
</body>
</html>
