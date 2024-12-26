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

    <p style = "background:yellow; font-weight : bold">추가할 아이템을 입력하세요. </p>
    <p>단, 동일한 물건을 장바구니에 넣을 수 없음.</p>
    <p>(영문입력 가능, 띄어쓰기 없음)</p>
    <p href="viewCart.jsp">장바구니 보기</p>
    <form action = addCart.jsp>
    <input type = "text" name = "item">
    <button>장바구니 추가</button>
    </form>

</head>
<body>

</body>
</html>
