<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="second?id=나는한글이란다아이디가&pw=1234">get 요청</a>
<form  action="second" method = "post">
  id입력: <input name="id" value="나는한글이란다아이디가"><br>
  pw입력: <input name="pw" value="1234"><br>
  <button>post 요청</button>
</form>
</body>
</html>

