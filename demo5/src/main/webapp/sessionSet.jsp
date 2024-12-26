<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<%
  //로그인 되었다 치고 세션에(서버의 램에)
  //값을 저장해보자.(id, username, vo등)
  //session.setAttribute("loginId", "apple");
  //세션의 값은 모든 타입 다 됨. 들어갈 때 Object으로 자동형변환되어서 들어감.
  String id = request.getParameter("id"); //input name=id
  String pw = request.getParameter("pw"); //input name=pw
  //id=root, pw=1234이면 로그인성공했습니다라고 출력,
  //세션을 loginId로 설정해주세요.
  if (id.equals("root") && pw.equals("1234")){
    out.println("로그인 성공했습니다.!!");
    session.setAttribute("loginId", id); //loginId = apple
  }

%>
<a href="sessionGet.jsp">로그인 성공후 페이지로</a>
</body>
</html>