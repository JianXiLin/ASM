<%--
  Created by IntelliJ IDEA.
  User: 泽青
  Date: 2020/4/17
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp" %>
<html>
<head>
    <title> 登录</title>
    <link href="<%=request.getContextPath()%>/resource/css/login.css" rel="stylesheet" type="text/css" media="all" />
    <link href="//fonts.googleapis.com/css?family=Cormorant+SC:300,400,500,600,700" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
    <style>
        body{
            text-align: center;
            background: #CCCCCC url(<%=request.getContextPath()%>/resource/img/background/login.png) no-repeat fixed;
            background-size: cover;
        }
    </style>

</head>
<body>
<div class="padding-all">
    <div class="header">
        <h1>登录—固定资产管理系统</h1>
    </div>

    <div class="design-w3l">
        <div class="mail-form-agile">
            <form action="/user/login" method="POST">
                <input type="text" name="username" placeholder="账号" required=""/>
                <input type="password"  name="pwd" class="padding" placeholder="密码" required=""/>
                <input type="submit" value="登录">
                <input type="reset" value="重置">

            </form>
        </div>
        <div class="clear"> </div>
    </div>

    <div class="footer">
        <p>© 2020  固定资产管理系统. 版权所有 | 设计者：web项目实训11小组</p>
    </div>
</div>
</body>
</html>
