<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--웹프로그램은 출력틀이 html이어야 함 --%>
<%-- 웹프로그램의 출력용 틀로 j2ee프로젝트에서는 jsp를 사용하고 있음. --%>
<%-- 템플릿(틀) 엔진 : jsp ---- 더욱 간단한 ThymeLeaf(타임리프)가 있음 --%>


<%
    // 스크립트릿(Scriptelet) 끄적끄적 쓰는 조그만한 프로그램, 조각 프로그램
    // jsp -- servlet으로 전환
    // init() 초기화 -- service() -- doGet, doPost, doPut요청 다 사용한 후에는 destroy()로 종료
    // service()메서드 안으로 다 구현되어서 들어감.
    // 여기서 만들어지는 변수는 지역변수 이기 때문에 "반드시" 초기화해주어야함!
    // 1. 브라우저에 있는 쿠키 목록을 가지고 오자. Cookie[]
    // 2. 배열에서 하나씩 꺼내어 조건에 맞는 것만 쓰자.
    //      키(이름), 값의 쌍으로 되어있음
    Cookie[] cookies= request.getCookies();
    for(Cookie cookie : cookies) {
     //   PrintWriter out = response.getWriter(); // 자동으로 선언되어 만들어져 있기 때문에 선언할 필요 없음(내장객체임)
        if(!cookie.getName().equals("JSESSIONID"))
            out.println(cookie.getName() + " " + cookie.getValue() + "<br>");
    }
%>
</body>
</html>
