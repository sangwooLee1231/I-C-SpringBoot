<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br>
<a href="controller.jsp">프론터 컨트롤러(디스패처서블릿)</a>

<br>
<a href="login.jsp">login 페이지로</a>
<hr color = red>

<a href="game.jsp">Game form</a>
<hr>

<a href="City">city</a>
<hr>
<a href="City.jsp">City2</a>

<a href="number.jsp">더하기</a>
<a href="life.jsp">서블릿 생명주기 확인</a>
<a href="login2.jsp">서블릿 한글처리</a>
<hr>

<a href="hello-servlet">Hello Servlet</a>
<a href="hello-servlet2">Hello Servlet2</a>
<!-- get요청 -->
<a href="controller">Controller호출</a>
<hr>
<form  action="controller" method="post">
    id입력: <input name="user" value="root"><br>
    <button type="submit">서버로 id전송</button>
</form>
<hr>
<form  action="controller" method="get">
    id입력: <input name="user" value="root"><br>
    <button type="submit">서버로 id전송</button>
</form>
<hr>
<form  action="member">
    id입력: <input name="id" value="root"><br>
    pw입력: <input name="pw" value="1234"><br>
    name입력: <input name="name" value="park"><br>
    tel입력: <input name="tel" value="011"><br>
    <button type="submit">서버로 전송</button>
</form>
</body>
</html>