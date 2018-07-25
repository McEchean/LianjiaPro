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
<html>
<%--css--%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
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
        <div class="col-md-4"></div>
        <div class="col-md-4"></div>
        <div class="col-md-4 col-md-offset-4">
            <button type="button" class="btn btn-primary">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true">新增</span>
            </button>
            <button type="button" class="btn btn-danger">
                <span class="glyphicon glyphicon-trash" aria-hidden="true">删除</span>
            </button>
        </div>
    </div>
    <%--数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-striped">
                <tr>
                    <th>标题</th>
                    <th>小区</th>
                    <th>规格</th>
                    <th>大小</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td>1</td>
                    <td>1</td>
                    <td>1</td>
                </tr>
            </table>
        </div>
    </div>
    <%--分页--%>
    <div class="row"></div>
</div>

<%--js--%>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
