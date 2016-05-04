<%--
  Index Page.
  User: Bill Lv <billcc.lv@hotmail.com>
  Date: 2014/12/17
  Time: 19:27
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="robots" content="Disallow">
    <meta name="author" content="lvchao, billcc.lv@hotmail.com">
    <meta name="copyright" content="http://renyuxian.mobi/">
    <title>人鱼线运营后台管理系统</title>
    <c:set value="${pageContext.request.contextPath}" var="contextPath"/>
    <link rel="shortcut icon" type="image/png" href="${contextPath}/assets/images/favicon.png">
    <link rel="stylesheet" href="${contextPath}/libs/semantic-ui/dist/semantic.min.css">
</head>
<body ng-app="main">
<div ng-controller="mainController" data-ng-init="init()">
    <div class="ui tiered menu">
        <div class="menu">
            <a class="item" href='#/photos' ng-click="selectMainMenu('photos')"
               ng-class="{active: model.mainMenu.selection == 'photos'}">
                <i class="photo icon"></i> 图片运营
            </a>
            <a class="item" href='#/tags' ng-click="selectMainMenu('tags')"
               ng-class="{active: model.mainMenu.selection == 'tags'}">
                <i class="tags icon"></i> 标签运营
            </a>
            <a class="item" href='#/content' ng-click="selectMainMenu('content')"
               ng-class="{active: model.mainMenu.selection == 'content'}">
                <i class="file icon"></i> 内容运营
            </a>
            <a class="item" href='#/users' ng-click="selectMainMenu('users')"
               ng-class="{active: model.mainMenu.selection == 'users'}">
                <i class="users icon"></i> 用户运营
            </a>
            <a class="item" href='#/accounts' ng-click="selectMainMenu('accounts')"
               ng-class="{active: model.mainMenu.selection == 'accounts'}">
                <i class="wechat icon"></i> 官方账号运营
            </a>
            <a class="item" href='#/words' ng-click="selectMainMenu('words')"
               ng-class="{active: model.mainMenu.selection == 'words'}">
                <i class="rain icon"></i> 敏感词过滤
            </a>

            <div class="right menu">
                <div class="item">
                    <div class="ui icon input">
                        <input type="text" placeholder="搜索...">
                        <i class="search link icon"></i>
                    </div>
                </div>
                <a class="ui item" href="javascript:void(0)" id="logout">
                    登出
                </a>
            </div>
        </div>
        <div data-ng-view></div>
    </div>
</div>

<script type="text/javascript" src="${contextPath}/libs/jquery/dist/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/libs/angular/angular.min.js"></script>
<script type="text/javascript" src="${contextPath}/libs/angular-resource/angular-resource.min.js"></script>
<script type="text/javascript" src="${contextPath}/libs/angular-route/angular-route.min.js"></script>
<script type="text/javascript" src="${contextPath}/app/main/app.js"></script>
<script type="text/javascript" src="${contextPath}/app/main/config.js"></script>
<script type="text/javascript" src="${contextPath}/app/main/controllers.js"></script>
<script type="text/javascript" src="${contextPath}/app/main/services.js"></script>
<script>
    mainApp.value('contextPath', "${contextPath}");

    $(function () {
        $('#logout').on("click", function () {
            $.ajax({
                type: 'POST',
                url: "${contextPath}/logout",
                data: {
                    "${_csrf.parameterName}": "${_csrf.token}"
                },
                dataType: 'json',
                async: false,
                complete: function () {
                    window.location.href = "${contextPath}/";
                }
            });
        });
    });
</script>
</body>
</html>
