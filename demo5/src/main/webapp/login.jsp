<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--action은 서버에서 받을 주소--%>
<%--method는 생략하면 get방식으로 설정됨.--%>
<%--서버에서는 action에서 적은 주소와 method의 방법에 따라 처리할 수 있는 함수를 호출 --%>
<form  action="login">
  id입력: <input name="id" value="root"><br>
  pw입력: <input name="pw" value="1234"><br>
  <button type="submit">서버로 전송</button>
</form>
</body>
</html>

