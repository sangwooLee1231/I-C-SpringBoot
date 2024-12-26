<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2024-12-20
  Time: 오후 4:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game Form</title>

</head>
<body>

<h1>Game Form</h1>
<br>
<h2>자바 스크립트로 GET요청</h2>

<form action="game">
    gameName: <input name="name" value="smileGame"><br>
    gameType: <input name= "type" value="multi role"><br>
    <button>자바 스크립트로 GET요청</button>
</form>

<hr color="blue">

<form action="player" method = "post">
    Player Name: <input name = "name" value="king" required><br>
    Player Score:<input name = "Score" value = "300" required><br>
    <button>폼으로 POST요청</button>

</form>
</body>
</html>
