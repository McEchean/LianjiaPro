<%--
  Created by IntelliJ IDEA.
  User: 98382
  Date: 2018/7/28
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String app_path = request.getContextPath();%>
<html>
<head>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>Title</title>
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
                <tr>
                    <h4>实景图模式</h4>
                </tr>
            </table>
        </div>
    </div>
    <%--分页--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
        </div>
    </div>
</div>

<script type="text/javascript">
    $(function () {
        $.ajax({
                url: "${app_path}/Lianjias.do",
                data: "pn=1",
                type: "get",
                success: function (result) {
                    console.log(result)
                }
            }
        );
    })
</script>
<%--js--%>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

</body>
</html>
