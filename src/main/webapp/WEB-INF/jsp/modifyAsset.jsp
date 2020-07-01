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
                <li class="breadcrumb-item"><a href="/assets/">资产管理</a></li>
                <li class="breadcrumb-item active">信息修改</li>
            </ul>
        </div>
    </div>
    <section class="charts comployeeData">
        <div class="card">
            <div class="card-header">
                <h4>员工信息修改</h4>
            </div>
            <div class="card-body">
                <c:if test="${resultVO.success}">
                    <form class="needs-validation col-8 offset-2"
                            <c:if test="${resultVO.data!=null}">
                                action="/assets/${resultVO.data.zcId}"
                            </c:if>
                            <c:if test="${resultVO.data==null}">
                                action="/assets/"
                            </c:if>
                          method="POST"
                          novalidate>
                        <c:if test="${resultVO.data!=null}">
                            <input type="hidden" name="_method" value="PUT">
                        </c:if>
                        <div class="form-row">
                            <div class="col-md-6 mb-3">
                                <label for="zcId">编号</label>
                                <input type="text" class="form-control"
                                       id="zcId" placeholder="eg:C2KS@_4"
                                       value="${resultVO.data!=null?resultVO.data.zcId:''}"
                                       name="zcId" ${resultVO.data!=null?'disabled':''} required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写编码
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="zcNo">型号</label>
                                <input type="text" class="form-control" id="zcNo"
                                       placeholder="eg:C2KS"
                                       value="${resultVO.data!=null?resultVO.data.zcNo:''}"
                                       name="zcNo" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写型号
                                </div>
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="col-md-6 mb-3">
                                <label for="zcName">名称</label>
                                <input type="text" class="form-control"
                                       id="zcName" placeholder="eg:山特UPS电源"
                                       value="${resultVO.data!=null?resultVO.data.zcName:''}"
                                       name="zcName" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写名称
                                </div>
                            </div>

                            <div class="col-md-3 mb-3">
                                <label for="zcPrice">单价</label>
                                <input type="text" class="form-control"
                                       id="zcPrice" placeholder="eg:99.99"
                                       value="${resultVO.data!=null?resultVO.data.zcPrice:''}"
                                       name="zcPrice" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请输入单价
                                </div>
                            </div>

                            <div class="col-md-3 mb-3">
                                <label for="zcFactory">生产厂商</label>
                                <input type="text" class="form-control"
                                       id="zcFactory" placeholder="eg:索尼"
                                       value="${resultVO.data!=null?resultVO.data.zcFactory:''}"
                                       name="zcFactory" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写生产厂商.
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col-md-6 mb-3">
                                <label for="zcProducetime">生产日期</label>
                                <input type="text" class="form-control"
                                       id="zcProducetime" placeholder="eg:2019-12-01"
                                       value="${resultVO.data!=null?resultVO.data.zcProducetime:''}"
                                       name="zcProducetime" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写生产日期.
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="zcBuytime">入库时间</label>
                                <input type="text" class="form-control"
                                       id="zcBuytime" placeholder="eg:2020-01-01"
                                       value="${resultVO.data!=null?resultVO.data.zcBuytime:''}"
                                       name="zcBuytime" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写入库时间
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col-md-6 mb-3">
                                <label for="zcBuyer">购买人</label>
                                <input type="text" class="form-control"
                                       id="zcBuyer" placeholder="eg:Sonic"
                                       value="${resultVO.data!=null?resultVO.data.zcBuyer:''}"
                                       name="zcBuyer" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写购买人
                                </div>
                            </div>

                            <div class="col-md-3 mb-3">
                                <label for="zcType">资产类型</label>
                                <input type="text" class="form-control"
                                       id="zcType" placeholder="eg:数码配件"
                                       value="${resultVO.data!=null?resultVO.data.zcType:''}"
                                       name="zcType" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写资产类型
                                </div>
                            </div>

                            <div class="col-md-3 mb-3">
                                <label for="zcStatus">状态</label>
                                <input type="text" class="form-control"
                                       id="zcStatus" placeholder="eg:正常"
                                       value="${resultVO.data!=null?resultVO.data.zcStatus:''}"
                                       name="zcStatus" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    请填写资产状态
                                </div>
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col-md-12 mb-3">
                                <label for="contactValidation">备注</label>
                                <textarea class="form-control" rows="3"
                                          name="zcBzxx">
                                        ${resultVO.data!=null?resultVO.data.zcBzxx:''}
                                </textarea>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary"
                                    onclick="location.href='/assets'">
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
