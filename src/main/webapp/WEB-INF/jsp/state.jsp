<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%@include file="common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Home</title>
    <%@include file="common/css.jsp" %>
</head>
<body>

<%@include file="common/navbar.jsp" %>
<div class="page">
    <!-- navbar-->
    <%@include file="common/header.jsp" %>
    <!-- Counts Section -->
    <!-- Breadcrumb-->
    <div class="breadcrumb-holder">
        <div class="container-fluid">
            <ul class="breadcrumb">
                <li class="breadcrumb-item"><a href="/">Home</a></li>
                <li class="breadcrumb-item"><a href="/comployee/">员工管理</a></li>
                <li class="breadcrumb-item active">
                    <c:if test="${operation=='update'}">
                        信息修改
                    </c:if>
                    <c:if test="${operation=='delete'}">
                        删除信息
                    </c:if>
                    <c:if test="${operation=='create'}">
                        新增信息
                    </c:if>
                </li>
            </ul>
        </div>
    </div>
    <section class="charts comployeeData">
        <div class="card">
            <div class="card-header">
                <h4>处理结果</h4>
            </div>
            <div class="card-body d-flex align-items-center flex-column"
                 style="height: 68vh;background-image:url('<%= request.getContextPath()%>/resource/img/background/background-1.png');
                         background-repeat:no-repeat;background-size:400px;background-position:center;">
                <div class="row">
                    <div class="container">
                        <c:if test="${resultVO.success}">
                            <c:if test="${operation=='update'}">
                                <h1 class="display-4">修改 ${range}（${resultVO.data.dataId}）成功</h1>
                            </c:if>
                            <c:if test="${operation=='delete'}">
                                <h1 class="display-4">删除 ${range}（${resultVO.data.dataId}）成功</h1>
                            </c:if>
                            <c:if test="${operation=='create'}">
                                <h1 class="display-4">新增 ${range}（${resultVO.data.dataId}）成功</h1>
                            </c:if>
                        </c:if>
                        <c:if test="${!resultVO.success}">
                            <h1 class="display-4">${resultVO.msg}</h1>
                        </c:if>

                        <c:if test="${operation=='update'}">
                            <p class="lead">你可选择返回“修改”页面，也可选择跳转到“信息列表”页面</p>
                        </c:if>
                        <c:if test="${operation=='delete'|| operation=='create'}">
                            <p class="lead">你可选择跳转到首页面，也可选择跳转到“信息列表”页面</p>
                        </c:if>
                    </div>
                </div>

                <div class="mt-auto p-2">

                    <button type="button" class="btn btn-secondary"
                            <c:if test="${operation=='update'}">
                                onclick="location.href='/${range}/page/modify/${resultVO.data.dataId}'"> << 返回
                            </c:if>
                            <c:if test="${operation=='delete'|| operation=='create'}">
                                onclick="location.href='/'"> << 首页
                            </c:if>
                    </button>
                    <button type="submit" class="btn btn-primary "
                            onclick="location.href='/${range}/'">信息列表 >>
                    </button>
                </div>

            </div>
        </div>
    </section>

    <%@include file="common/footer.jsp" %>
</div>

<%@include file="common/script.jsp" %>

<script src="<%= request.getContextPath()%>/resource/js/charts-custom.js"></script>

</body>
</html>