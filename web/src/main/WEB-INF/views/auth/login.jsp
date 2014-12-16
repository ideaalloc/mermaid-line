<%--
  Login Page.
  User: Bill Lv <billcc.lv@hotmail.com>
  Date: 2014/12/7
  Time: 17:32
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>人鱼线后台管理系统</title>
    <link rel="stylesheet" href="libs/semantic-ui/dist/semantic.min.css"/>
</head>
<body>
<form action="/login" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    <div class="ui error warning form segment">
        <div class="field">
            <label>用户名</label>
            <input name="username" placeholder="用户名" type="text">
        </div>
        <div class="field">
            <label>密码</label>
            <input name="password" type="password">
        </div>
        <button type="submit" class="ui submit button">登录</button>

        <c:if test="${param.error != null}">
            <div class="ui error message">
                <div class="header">错误操作</div>
                <p>用户名或密码输入不正确</p>
            </div>
        </c:if>

        <c:if test="${param.logout != null}">
            <div class="ui warning message">
                <div class="header">警告</div>
                <p>您已登出</p>
            </div>
        </c:if>
    </div>
</form>

</body>
</html>
