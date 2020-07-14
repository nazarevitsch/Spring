<%--
  Created by IntelliJ IDEA.
  User: nazar
  Date: 15.06.2020
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Project</title>
</head>
<body>
<button onclick="saveJWT()">Click</button>
<button onclick="showJWT()">C</button>
<script>
    function saveJWT() {
        document.cookie = "JWT=1234567890"
    }
    function showJWT() {
        console.log(document.cookie);
    }
</script>
</body>
</html>