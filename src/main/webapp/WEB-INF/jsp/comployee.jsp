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
                <li class="breadcrumb-item active">员工管理</li>
            </ul>
        </div>
    </div>
    <section class="charts comployeeData">
        <div class="card">
            <div class="card-header">
                <h4>员工信息管理</h4>
            </div>
            <div class="card-body">
                <c:if test="${resultVO.success}">
                    <div class="d-flex flex-row-reverse">
                        <div class="p-2">
                            <button type="submit" class="btn btn-primary"
                                onclick="window.location.href='/comployee/page/create'">添加员工</button>
                        </div>
                    </div>
                    <table class="table table-hover">
                        <thead class="thead-dark">
                        <tr>
                            <th scope="col">编号</th>
                            <th scope="col">姓名</th>
                            <th scope="col">性别</th>
                            <th scope="col">年龄</th>
                            <th scope="col">所在部门</th>
                            <th scope="col">现任职务</th>
                            <th scope="col">家庭地址</th>
                            <th scope="col">联系方式</th>
                            <th scope="col">状态</th>
                            <th scope="col">操作</th>
                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach items="${resultVO.data.pageItems}" var="comployee">
                            <tr>
                                <th scope="row">${comployee.comployeeNo}</th>
                                <td>${comployee.comployeeName}</td>
                                <td>${comployee.sex}</td>
                                <td>${comployee.age}</td>
                                <td>${comployee.dept}</td>
                                <td>${comployee.profession}</td>
                                <td>${comployee.address}</td>
                                <td>${comployee.phone}</td>
                                <td>${comployee.comployeeStatus}</td>
                                <td>
                                    <button type="button" class="btn btn-success" data-toggle="modal"
                                            data-target="#exampleModal"
                                            onclick="location.href='/comployee/page/modify/${comployee.comployeeNo}'">修改
                                    </button>
                                    <button type="button" class="btn btn-success"
                                            onclick="deleteItem('${comployee.comployeeNo}')">删除</button>
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
                    size: ${resultVO.data.showDataNum}
                };
                console.log(data.page + "---" + data.size)
                location.href = "/comployee/list?page=" + data.page + "&size=" + data.size;
            }

        });


    });
    function deleteItem(index) {
        if (confirm("是否确定删除员工("+index+")")) {
            $.ajax({
                url: '/comployee/'+index+'/delete',
                type: 'DELETE',
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