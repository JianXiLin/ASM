<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Home</title>
    <%@include file="common/css.jsp" %>
    <link rel="stylesheet" href="<%= request.getContextPath()%>/resource/css/comployee.css">
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
                <li class="breadcrumb-item active">资产查询</li>
            </ul>
        </div>
    </div>
    <section class="charts comployeeData">
        <div class="card">
            <div class="card-header">
                <h4>查询资产信息</h4>
            </div>

            <div class="card-body">
                <form id="searchForm" style="width: 95%;margin: auto;height: 100%;" class="row"
                      action="/assets/list">
                    <input id="pageInput" type="hidden" name="page" value="">
                    <input id="sizeInput" type="hidden" name="size" value="">
                    <div class="col-md-11">
                        <div class="row">

                            <div class="form-group row col-md-4">
                                <label for="inputZcId" class="col-form-label col-form-label-sm">编号:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control form-control-sm col-sm-10"
                                           id="inputZcId" placeholder="eg:KLV-40V380A@_5"
                                           name="zcId" value="${conditions.zcId}">
                                </div>
                            </div>
                            <div class="form-group row col-md-4">
                                <label for="inputZcNo" class="col-form-label col-form-label-sm">型号:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control form-control-sm col-sm-10"
                                           id="inputZcNo" placeholder="eg:KLV-40V380A"
                                           name="zcNo" value="${conditions.zcNo}">
                                </div>
                            </div>
                            <div class="form-group row col-md-4">
                                <label for="inputZcFactory" class="col-form-label col-form-label-sm">厂商:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control form-control-sm col-sm-10"
                                           id="inputZcFactory" placeholder="eg:索尼"
                                           name="zcFactory" value="${conditions.zcFactory}">
                                </div>
                            </div>

                        </div>
                        <div class="row">
                            <div class="form-group row col-md-4">
                                <label for="inputZcName" class="col-form-label col-form-label-sm">名称:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control form-control-sm col-sm-10"
                                           id="inputZcName" placeholder="eg:索尼液晶电视"
                                           name="zcName" value="${conditions.zcName}">
                                </div>
                            </div>
                            <div class="form-group row col-md-3">
                                <label for="inputZcBuyer" class="col-form-label col-form-label-sm">购买人:</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control form-control-sm col-sm-10"
                                           id="inputZcBuyer" placeholder="eg：John"
                                           name="zcBuyer" value="${conditions.zcBuyer}">
                                </div>
                            </div>
                            <div class="form-group row col-md-3">
                                <label for="inputZcType" class="col-form-label col-form-label-sm">类型:</label>
                                <div class="col-sm-9">
                                    <select id="inputZcType" class="form-control form-control-sm "
                                            name="zcType">
                                        <option ${conditions.zcType==""?'selected':''}></option>
                                        <option ${conditions.zcType=="数码配件"?'selected':''}>数码配件</option>
                                        <option ${conditions.zcType=="数码产品"?'selected':''}>数码产品</option>
                                        <option ${conditions.zcType=="笔记本"?'selected':''}>笔记本</option>
                                        <option ${conditions.zcType=="电脑软件"?'selected':''}>电脑软件</option>
                                        <option ${conditions.zcType=="服务器"?'selected':''}>服务器</option>
                                        <option ${conditions.zcType=="拓展配件"?'selected':''}>拓展配件</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group row col-md-2">
                                <label for="inputZcStatus" class="col-form-label col-form-label-sm">状态:</label>
                                <div class="col-sm-9">
                                    <select id="inputZcStatus" class="form-control form-control-sm "
                                            name="zcStatus">
                                        <option ${conditions.zcStatus==""?'selected':''}></option>
                                        <option ${conditions.zcStatus=="正常"?'selected':''}>正常</option>
                                        <option ${conditions.zcStatus=="借出"?'selected':''}>借出</option>
                                        <option ${conditions.zcStatus=="维修"?'selected':''}>维修</option>
                                        <option ${conditions.zcStatus=="报废"?'selected':''}>报废</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-1">
                        <div class="d-flex bd-highlight mb-3" style="height:100%">
                            <button type="submit" class="btn btn-primary btn-sm align-self-end">查询</button>
                        </div>
                    </div>
                </form>

                <c:if test="${resultVO.success}">
                    <div class="d-flex flex-row-reverse">
                        <div class="p-2">

                        </div>
                    </div>
                    <table class="table table-hover">
                        <thead class="thead-dark">
                        <tr>
                            <th scope="col">资产编码</th>
                            <th scope="col">资产型号</th>
                            <th scope="col">资产名称</th>
                            <th scope="col">单价</th>
                            <th scope="col">生产厂商</th>
                            <th scope="col">生成日期</th>
                            <th scope="col">入库时间</th>
                            <th scope="col">购买人</th>
                            <th scope="col">资产类型</th>
                            <th scope="col">状态</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="zcInfo" items="${resultVO.data.pageItems}">
                            <tr>
                                <th scope="row">${zcInfo.zcId}</th>
                                <td>${zcInfo.zcNo}</td>
                                <td>${zcInfo.zcName}</td>
                                <td>${zcInfo.zcPrice}</td>
                                <td>${zcInfo.zcFactory}</td>
                                <td>${zcInfo.zcProducetime}</td>
                                <td>${zcInfo.zcBuytime}</td>
                                <td>${zcInfo.zcBuyer}</td>
                                <td>${zcInfo.zcType}</td>
                                <td>${zcInfo.zcStatus}</td>
                            </tr>
                        </c:forEach>


                        </tbody>
                    </table>
                    <!--分页按钮-->
                    <div class="m-style M-box1 pageBtns"></div>

                </c:if>
                <c:if test="${!resultVO.success}">
                    ${resultVO.msg}
                </c:if>
            </div>
        </div>
    </section>

    <%@include file="common/footer.jsp" %>
</div>

<%@include file="common/script.jsp" %>

<script src="<%= request.getContextPath()%>/resource/js/charts-custom.js"></script>
<script>
    $(function () {
        $('.M-box1').pagination({
            //总数
            totalData:${resultVO.data.totalNum},
            //每页显示的条数
            showData: ${resultVO.data.showDataNum},
            // 是否开启首页和末页
            coping: true,
            //总页数为0或1时隐藏分页控件
            // isHide:true,
            // 当前第几页
            current:${resultVO.data.pageNo},
            callback: function (api) {
                var data = {
                    page: api.getCurrent(),
                    size: 5
                };
                console.log(data.page + "---" + data.size)
                $("#pageInput").val(data.page);
                $("#sizeInput").val(data.size);
                $("#searchForm").submit();
            }
        });
    });

</script>
</body>
</html>