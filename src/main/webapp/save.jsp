<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>添加账户信息表单</h1>
    <form name="userForm" action="${pageContext.request.contextPath}/user/save" method="post">
        id:<input type="text" name="id"><br>
        名称:<input type="text" name="name"><br>
        年龄:<input type="text" name="age"><br>
        <input type="submit" value="保存"><br>
    </form>
</body>
</html>
