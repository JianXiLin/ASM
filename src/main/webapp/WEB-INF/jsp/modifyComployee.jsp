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
                <li class="breadcrumb-item"><a href="/asset/">资产管理</a></li>
                <li class="breadcrumb-item active">信息修改</li>
            </ul>
        </div>
    </div>
    <section class="charts comployeeData">
        <div class="card">
            <div class="card-header">
                <h4>资产信息修改</h4>
            </div>
            <div class="card-body">
                <c:if test="${resultVO.success}">
                    <form class="needs-validation col-8 offset-2"
                          <c:if test="${resultVO.data!=null}">
                              action="/comployee/${resultVO.data.comployeeNo}/update"
                          </c:if>
                          <c:if test="${resultVO.data==null}">
                                action="/comployee/create"
                          </c:if>
                          method="POST"
                          novalidate>
                        <c:if test="${resultVO.data!=null}">
                            <input type="hidden" name="_method" value="PUT">
                        </c:if>
                        <div class="form-row">
                            <div class="col-md-6 mb-3">
                                <label for="numberValidation">编号</label>
                                <input type="text" class="form-control"
                                       id="numberValidation" placeholder="numbering"
                                       value="${resultVO.data!=null?resultVO.data.comployeeNo:''}"
                                       name="comployeeNo" ${resultVO.data!=null?'disabled':''} required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    Please provide a valid state.
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="nameValidation">姓名</label>
                                <input type="text" class="form-control" id="nameValidation"
                                       placeholder="name" value="${resultVO.data!=null?resultVO.data.comployeeName:''}"
                                       name="comployeeName" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    Please provide a valid state.
                                </div>
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="col-md-3 mb-3">
                                <!-- <label for="validationCustom04">State</label>
                                <input type="text" class="form-control" id="validationCustom04" placeholder="State" required> -->

                                <label for="genderInput">性别</label>
                                <select id="genderInput" class="form-control" name="sex">
                                    <option <c:out value="${resultVO.data!=null&&resultVO.data.sex=='男'?'selected':''}"/> >男</option>
                                    <option <c:out value="${resultVO.data!=null&&resultVO.data.sex=='女'?'selected':''}"/> >女</option>
                                </select>
                            </div>
                            <div class="col-md-3 mb-3">
                                <label for="ageValidation">年龄</label>
                                <input type="text" class="form-control"
                                       pattern="^-?[1-9]\d*$" id="ageValidation"
                                       placeholder="age"
                                       value="${resultVO.data!=null?resultVO.data.age:''}"
                                       name="age" required>
                                <div class="invalid-feedback">
                                    年龄只能是整数
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="departmentInput">部门</label>
                                <select id="departmentInput" class="form-control" name="dept">
                                    <option ${resultVO.data!=null&&resultVO.data.dept == '保安部'?'selected':''} >保安部</option>
                                    <option ${resultVO.data!=null&&resultVO.data.dept == '科技组'?'selected':''} >科技组</option>
                                    <option ${resultVO.data!=null&&resultVO.data.dept == '人力资源部'?'selected':''} >人力资源部</option>
                                    <option ${resultVO.data!=null&&resultVO.data.dept == '设备管理部'?'selected':''} >设备管理部</option>
                                    <option ${resultVO.data!=null&&resultVO.data.dept == '外贸部'?'selected':''} >外贸部</option>
                                    <option ${resultVO.data!=null&&resultVO.data.dept == '总务处'?'selected':''} >总务处</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col-md-3 mb-3">
                                <label for="jobValidation">现任职务</label>

                                <input type="text" class="form-control" id="jobValidation"
                                       placeholder="job"
                                       value="${resultVO.data!=null?resultVO.data.profession:''}" name="profession" required>
                                <div class="invalid-feedback">
                                    Please provide a valid zip.
                                </div>
                            </div>
                            <div class="col-md-3 mb-3">
                                <label for="inputState">员工状态</label>
                                <select id="inputState" class="form-control" name="comployeeStatus">
                                    <option  <c:out value="${resultVO.data!=null&&resultVO.data.comployeeStatus=='在职'?'selected':''}"/>
                                            >在职
                                    </option>
                                    <option <c:out value="${resultVO.data!=null&&resultVO.data.comployeeStatus=='休假'?'selected':''}"/>
                                            >休假
                                    </option>
                                    <option <c:out value="${resultVO.data!=null&&resultVO.data.comployeeStatus=='离职'?'selected':''}"/>
                                            >离职
                                    </option>
                                </select>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="contactValidation">联系方式</label>
                                <input type="text" class="form-control"
                                       id="contactValidation" placeholder="contact detail"
                                       value="${resultVO.data!=null?resultVO.data.phone:''}"
                                       name="phone" required>
                                <div class="valid-feedback">
                                    Looks good!
                                </div>
                                <div class="invalid-feedback">
                                    Please provide a valid zip.
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <label for="addressalidation">地址</label>
                            <input type="text" class="form-control" id="addressalidation"
                                   placeholder="address" value="${resultVO.data!=null?resultVO.data.address:''}"
                                   name="address" required>
                            <div class="valid-feedback">
                                Looks good!
                            </div>
                            <div class="invalid-feedback">
                                Please provide a valid zip.
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary"
                                    onclick="location.href='/comployee/'">
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

<script src="<%= request.getContextPath()%>/resource/js/charts-custom.js"></script>
<script>
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
                    }else{
                        submitBtn.disabled=true;
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    });
</script>
</body>
</html>