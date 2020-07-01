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
                <li class="breadcrumb-item active">借还信息管理</li>
            </ul>
        </div>
    </div>
    <section class="charts comployeeData">
        <div class="card">
            <div class="card-header">
                <h4>借还信息管理</h4>
            </div>
            <div class="card-body">
                <c:if test="${resultVO.success}">
                    <div class="d-flex flex-row-reverse">
                        <div class="p-2">
                            <button type="submit" class="btn btn-primary"
                                    onclick="window.location.href='/circulates/page/create'">借出登记</button>
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
                            <th scope="col">操作</th>
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
                                <td>
                                    <button type="button" class="btn btn-success" data-toggle="modal"
                                            data-target="#exampleModal"
                                            onclick="location.href='/circulates/page/modify/${zcInout.inoutNo}'">修改
                                    </button>
                                    <button type="button" class="btn btn-success"
                                            onclick="returnItem('${zcInout.inoutNo}')">归还</button>
                                </td>
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
                location.href = "/circulates/?page=" + data.page + "&size=" + data.size;
            }

        });


    });
    function returnItem(index) {
        if (confirm("是否确定归还该资产("+index+")")) {
            $.ajax({
                url: '/circulates/return/'+index,
                type: 'PUT',
                data: {},
                success:function(data){
                    console.log(data)
                    window.location.reload();
                },
                error:function (err) {
                    console.log(err);
                    alert(err.message);
                }
            });
        }

    }
</script>
</body>
</html>