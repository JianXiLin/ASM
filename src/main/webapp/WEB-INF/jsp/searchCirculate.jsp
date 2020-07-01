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
                <li class="breadcrumb-item"><a href="/index">Home</a></li>
                <li class="breadcrumb-item active">借还信息查询</li>
            </ul>
        </div>
    </div>
    <section class="charts comployeeData">
        <div class="card">
            <div class="card-header">
                <h4>查询借还信息</h4>
            </div>

            <div class="card-body">
                <form id="searchForm" style="width: 95%;margin: auto;height: 100%;" class="row"
                      action="/circulates/list">
                    <input id="pageInput" type="hidden" name="page" value="">
                    <input id="sizeInput" type="hidden" name="size" value="">
                    <div class="col-md-11">
                        <div class="row">

                            <div class="form-group row col-md-6">
                                <label for="inputZcId" class="col-form-label col-form-label-sm">资产编号:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control form-control-sm col-sm-4"
                                           id="inputZcId" placeholder="eg:KLV-40V380A@_5"
                                           name="zcId" value="${conditions.zcId}">
                                </div>
                            </div>
                            <div class="form-group row col-md-5">
                                <label for="inputComployeeNo" class="col-form-label col-form-label-sm">员工编号:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control form-control-sm col-sm-4"
                                           id="inputComployeeNo" placeholder="eg:0001"
                                           name="comployeeNo" value="${conditions.comployeeNo}">
                                </div>
                            </div>
                            <div class="col-md-1">
                                <div class="d-flex bd-highlight mb-3" style="height:100%">
                                    <button type="submit" class="btn btn-primary btn-sm align-self-end">查询</button>
                                </div>
                            </div>
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
                            <th scope="col">借用流水号</th>
                            <th scope="col">资产编号</th>
                            <th scope="col">员工编号</th>
                            <th scope="col">借用时间</th>
                            <th scope="col">应还时间</th>
                            <th scope="col">归还时间</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="zcInout" items="${resultVO.data.pageItems}">
                            <tr>

                                <td>${zcInout.inoutNo}</td>
                                <td>${zcInout.zcId}</td>
                                <td>${zcInout.comployeeNo}</td>
                                <td>${zcInout.outTime}</td>
                                <td>${zcInout.shouldTime}</td>
                                <td>${zcInout.backTime}</td>

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