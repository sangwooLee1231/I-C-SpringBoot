<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2024-12-23
  Time: 오후 5:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String item = request.getParameter("item");
    Cookie cookie = new Cookie("item"+item,item);
    if(cookie.getValue() != null) {
        response.addCookie(cookie);
        out.println("<p>아이템 " + item +"이 장바구니에 추가되었습니다.</p>");
        out.println("<hr color = red>");
    }
    else {
        out.println("항목을 입력하시오");
    }


%>

<a href="viewCart.jsp">장바구니 보기</a>

</body>
</html>
