<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
              <li class="breadcrumb-item active"></li>
          </ul>
      </div>
  </div>
  <section class="charts">
      <div class="container-fluid">
          <!-- Page Header-->
          <header>
              <h1 class="h3 display">Charts </h1>
          </header>
          <div class="row">
              <div class="col-lg-6">
                  <div class="card line-chart-example">
                      <div class="card-header d-flex align-items-center">
                          <h4>Line Chart Example</h4>
                      </div>
                      <div class="card-body">
                          <canvas id="lineChartExample"></canvas>
                      </div>
                  </div>
              </div>
              <div class="col-lg-6">
                  <div class="card bar-chart-example">
                      <div class="card-header d-flex align-items-center">
                          <h4>Bar Chart Example</h4>
                      </div>
                      <div class="card-body">
                          <canvas id="barChartExample"></canvas>
                      </div>
                  </div>
              </div>
              <div class="col-lg-6">
                  <div class="card pie-chart-example">
                      <div class="card-header d-flex align-items-center">
                          <h4>Pie Chart Example</h4>
                      </div>
                      <div class="card-body">
                          <div class="chart-container">
                              <canvas id="pieChartExample"></canvas>
                          </div>
                      </div>
                  </div>
              </div>
              <div class="col-lg-6">
                  <div class="card polar-chart-example">
                      <div class="card-header d-flex align-items-center">
                          <h4>Ploar Chart Example</h4>
                      </div>
                      <div class="card-body">
                          <div class="chart-container">
                              <canvas id="polarChartExample"></canvas>
                          </div>
                      </div>
                  </div>
              </div>
              <div class="col-lg-12">
                  <div class="card radar-chart-example">
                      <div class="card-header d-flex align-items-center">
                          <h4>Radar Chart Example</h4>
                      </div>
                      <div class="card-body">
                          <div class="chart-container">
                              <canvas id="radarChartExample"></canvas>
                          </div>
                      </div>
                  </div>
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