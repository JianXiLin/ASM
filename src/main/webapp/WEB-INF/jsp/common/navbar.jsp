<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Side Navbar -->
<nav class="side-navbar">
    <div class="side-navbar-wrapper">
        <!-- Sidebar Header    -->
        <div class="sidenav-header d-flex align-items-center justify-content-center">
            <!-- User Info-->
            <div class="sidenav-header-inner text-center"><img src="<%= request.getContextPath()%>/resource/img/avatar-7.jpg" alt="person" class="img-fluid rounded-circle">
                <h2 class="h5">Nathan Andrews</h2><span>Web Developer</span>
            </div>
            <!-- Small Brand information, appears on minimized sidebar-->
            <div class="sidenav-header-logo"><a href="/" class="brand-small text-center"> <strong>B</strong><strong class="text-primary">D</strong></a></div>
        </div>
        <!-- Sidebar Navigation Menus-->
        <div class="main-menu">
            <h5 class="sidenav-heading">Main</h5>
            <ul id="side-main-menu" class="side-menu list-unstyled">
                <li><a href="/"> <i class="icon-home"></i>Home                             </a></li>
            </ul>
        </div>
        <div class="admin-menu">
            <h5 class="sidenav-heading">资产信息</h5>
            <ul id="side-admin-menu_1" class="side-menu list-unstyled">
                <li> <a href="/assets/"> <i class="icon-screen"> </i>管理</a></li>
                <li> <a href="/assets/list"> <i class="icon-flask"> </i>查询
                    </a></li>
            </ul>
        </div>
        <div class="admin-menu">
            <h5 class="sidenav-heading">借还信息</h5>
            <ul id="side-admin-menu_2" class="side-menu list-unstyled">
                <li> <a href="/circulates/"> <i class="icon-screen"> </i>管理</a></li>
                <li> <a href="/circulates/list"> <i class="icon-flask"> </i>查询
                    </a></li>
            </ul>
        </div>
        <div class="admin-menu">
            <h5 class="sidenav-heading">员工信息</h5>
            <ul id="side-admin-menu" class="side-menu list-unstyled">
                <li> <a href="/comployee/list"> <i class="icon-screen"> </i>员工管理</a></li>
            </ul>
        </div>
    </div>
</nav>