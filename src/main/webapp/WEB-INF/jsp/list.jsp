<%@ page import="com.echean.pojo.Lianjia" %><%--
  Created by IntelliJ IDEA.
  User: 98382
  Date: 2018/7/25
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String app_path = request.getContextPath();
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<%--css--%>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<head>
    <title>Lianjialist</title>
</head>
<body>
<div class="container">
    <%--标题--%>
    <div class="row">
        <div class=".col-md-12">
            <h1>LJ</h1>
        </div>
    </div>
    <%--按钮--%>
    <div class="row">
        <%--<div class="col-md-4"></div>--%>
        <%--<div class="col-md-4"></div>--%>
        <div class="col-md-2 col-md-offset-10">
            <button type="button" class="btn btn-primary">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>新增
            </button>
            <button type="button" class="btn btn-danger">
                <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>删除
            </button>
        </div>
    </div>
    <%--数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <tr >
                    <h4>实景图模式</h4>
                </tr>
                <c:forEach items="${pageinfo.list}" var="lianjia">
                    <tr>
                        <%--标题--%>
                            <div class="col-md-4">
                                <div class="row">
                                    <th>${lianjia.hourseStatus}</th>
                                </div>

                            </div>
                                <%----%>
                            <div class="col-md-4">
                                <div class="row">
                                    <th>${lianjia.title}</th>
                                </div>
                                <div class="row">
                                    <th>${lianjia.room}</th>
                                </div>
                                <div class="row">
                                    <th>${lianjia.community}</th>
                                </div>
                                <div class="row">
                                    <th>${lianjia.area} <th>
                                </div>

                            </div>
                                <%----%>
                            <div class="col-md-4">
                                <th>${lianjia.rent}</th>
                            </div>
                                <%----%>
                            <div class="col-md-4">
                                <th>${lianjia.community}</th>
                            </div>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <%--分页--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li>
                        <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li>
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</div>

<%--js--%>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
