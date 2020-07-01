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
                <li class="breadcrumb-item"><a href="/circulates/">借还信息管理</a></li>
                <li class="breadcrumb-item active">借出登记</li>
            </ul>
        </div>
    </div>
    <section class="charts comployeeData">
        <div class="card">
            <div class="card-header">
                <h4>资产借出登记</h4>
            </div>
            <div class="card-body">
                <c:if test="${resultVO.success}">
                    <form class="needs-validation col-8 offset-2"
                            <c:if test="${resultVO.data!=null}">
                                action="/circulates/"
                            </c:if>
                            <c:if test="${resultVO.data==null}">
                                action="/circulates/"
                            </c:if>
                          method="POST"
                          novalidate>
                        <c:if test="${resultVO.data!=null}">
                            <input type="hidden" name="_method" value="PUT">
                        </c:if>
                        <div class="form-row">
                            <div class="col-md-6 mb-3">
                                <label for="inoutNo">借用流水号</label>
                                <input type="text" class="form-control"
                                       id="inoutNo" placeholder="eg:1"
                                       value="${resultVO.data!=null?resultVO.data.inoutNo:''}"
                                       name="inoutNo" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写借用流水号
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="zcId">资产编号</label>
                                <input type="text" class="form-control" id="zcId"
                                       placeholder="eg:C2KS@_1"
                                       value="${resultVO.data!=null?resultVO.data.zcId:''}"
                                       name="zcId" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写资产编号
                                </div>
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="col-md-6 mb-3">
                                <label for="comployeeNo">员工编号</label>
                                <input type="text" class="form-control"
                                       id="comployeeNo" placeholder="eg:0001"
                                       value="${resultVO.data!=null?resultVO.data.comployeeNo:''}"
                                       name="comployeeNo" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写员工编号
                                </div>
                            </div>

                            <div class="col-md-3 mb-3">
                                <label for="outTime">借用时间</label>
                                <input type="text" class="form-control"
                                       id="outTime" placeholder="eg:2008-08-14"
                                       value="${resultVO.data!=null?resultVO.data.outTime:''}"
                                       name="outTime" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请输入借用时间
                                </div>
                            </div>

                            <div class="col-md-3 mb-3">
                                <label for="shouldTime">应还时间</label>
                                <input type="text" class="form-control"
                                       id="shouldTime" placeholder="eg:2008-08-14"
                                       value="${resultVO.data!=null?resultVO.data.shouldTime:''}"
                                       name="shouldTime" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写应还时间
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col-md-6 mb-3">
                                <label for="backTime">归还时间</label>
                                <input type="text" class="form-control"
                                       id="backTime" placeholder="eg:2019-12-01"
                                       value="${resultVO.data!=null?resultVO.data.backTime:''}"
                                       name="backTime" >
                            </div>

                        </div>

                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary"
                                    onclick="location.href='/circulates'">
                                返回
                            </button>
                            <button id="submitBtn" type="submit" class="btn btn-primary">
                                <c:if test="${resultVO.data!=null}">
                                    保存
                                </c:if>
                                <c:if test="${resultVO.data==null}">
                                    添加
                                </c:if>
                            </button>
                        </div><!-- end_Modal_footer -->
                    </form>
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

<script type="text/javascript">

    $(function () {

        window.addEventListener('load', function () {
            // Fetch all the forms we want to apply custom Bootstrap validation styles to
            var forms = document.getElementsByClassName('needs-validation');

            var submitBtn = document.getElementById('submitBtn');
            // Loop over them and prevent submission
            var validation = Array.prototype.filter.call(forms, function (form) {
                form.addEventListener('submit', function (event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    } else {
                        submitBtn.disabled = true;
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    });
</script>
<script src="<%= request.getContextPath()%>/resource/js/charts-custom.js"></script>
</body>
</html>
