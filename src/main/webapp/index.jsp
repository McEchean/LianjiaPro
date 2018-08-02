<%--
  Created by IntelliJ IDEA.
  User: 98382
  Date: 2018/7/28
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String app_path = request.getContextPath();
    request.setAttribute("app_path", app_path);%>
<html>
<head>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<div class="container">
    <%--标题--%>
    <div class="row">
        <div class="page-header">
            <h1>LIANJIA</h1>
        </div>
    </div>

    <%--按钮--%>
    <div class="row">
        <div class="dropdown">
            <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                排序
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                <li id="l1"><a href="#">由低到高</a></li>
                <li id="l2"><a href="#">由高到低</a></li>
                <li id="l3"><a href="#">综合排序</a></li>
                <%--<li role="separator" class="divider"></li>--%>
                <%--<li><a href="#">Separated link</a></li>--%>
            </ul>
        </div>
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
            <table class="table table-striped" id="tableinfo">
                <thead>
                <tr>
                    <h4>实景图模式</h4>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>
    <%--分页--%>
    <div class="row">
        <div class="col-md-6 col-md-offset-6" id="page_info_nav">
        </div>
    </div>
</div>
<!-- Modal -->
<div class="modal fade bs-example-modal-lg" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel"></h4>
            </div>
            <div class="modal-body">
                <div class="row" id="modal_body_row1"></div>
                <div class="row" id="modal_body_row2"></div>
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>


<%--js--%>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%--使用ajax需要加入jQuery的引入--%>
<script type="text/javascript">
    $(function () {
        to_page(1);
    });

    function to_page(pn) {
        $.ajax({
                url: "${app_path}/LianjiaMore.do",
                data: "pn=" + pn,
                type: "GET",
                success: function (result) {
                    // console.log(result)
                    //    具体信息的填充
                    Build_Lianjia_table(result);
                    //    分页信息的填充
                    Build_pageinfo(result);
                }
            }
        );

    }
    function order() {
        $("#li1").click(function () {
            $.ajax({
                url:"${app_path}/lianjia/1/lianjiaorder.do",
                type:"GET",
                success:function (result) {
                    Build_Lianjia_table(result);
                }
            })
        })
    }


    function Build_Lianjia_table(result) {
        $("#tableinfo tbody").empty();
        var Lianjias = result.extend.pageinfo.list;
        // var images = result.extend.image;
        // $.each(images,function (index,item) {
        //     $.each(item,function (key, val) {
        //         alert(key);
        //         $(val).each(function () {
        //             console.log(this);
        //         });
        //     });
        // });

        $.each(Lianjias, function (index, item) {
            var titleDiv = $("<div></div>").append(item.title).addClass("col-lg-6");
            var roomDiv = $("<div></div>").append(item.room).addClass("col-lg-2");
            var rentDiv = $("<div></div>").append(item.rent + "元/月").addClass("col-lg-2");
            var detailBtnDiv = $("<div></div>")
                    .append($("<button></button>")
                    .attr("type", "button")
                    .attr("data-toggle", "modal")
                    .attr("data-target", "#myModal")
                    .addClass("btn btn-default")
                    .append("详情"))
                    .addClass("col-lg-2");
            detailBtnDiv.click(function () {
                detail_info(item.id);
            });
            $("<tr></tr>").append(titleDiv).append(roomDiv).append(rentDiv).append(detailBtnDiv).appendTo("#tableinfo tbody");
        });
        function detail_info(id) {
            $("#modal_body_row1").empty();
            $("#modal_body_row2").empty();
            $.ajax({
                url:"${app_path}/details.do",
                type:"GET",
                data:"id=" + id,
                success:function (result) {
                    var lianjia = result.extend.lianjia;
                    var image = result.extend.image;
                    $.each(image, function (key, val) {
                        $("<p></p>").append($("<a></a>").attr("href", val).append(key)).addClass("col-md-9 col-md-offset-3").appendTo("#modal_body_row1");
                    });
                    var div = $("<div></div>");
                    div.append(lianjia.addrs)
                        .append("<span>/<span>")
                        .append(lianjia.floor)
                        .append("<span>/<span>")
                        .append(lianjia.heading)
                        .append("<span>/<span>")
                        .append(lianjia.area).appendTo("#modal_body_row2");
                    $(lianjia.title).appendTo("#myModalLabel");
                    var div2 = $("<div></div>").append(lianjia.around);
                    // $.each(lianjia.around, function (index, item) {
                    //     div2.append(item).append("<span>,</span>");
                    // })
                    div2.appendTo("#modal_body_row2");
                }
            });

        }
    }

    function Build_pageinfo(result) {
        $("#page_info_nav").empty();
        var nav = $("<nav></nav>").attr("aria-label", "Page navigation");
        var ul = $("<ul></ul>").addClass("pagination");
        var pageinfo = result.extend.pageinfo;
        var firstPage = $("<li></li>").append($("<a></a>").attr("href", "#").append($("<span></span>")).append("首页"));
        var previousPage = $("<li></li>").append($("<a></a>").attr("href", "#").append($("<span></span>")).append("&laquo;"));
        if (!pageinfo.hasPreviousPage) {
            firstPage.addClass("disabled");
            previousPage.addClass("disabled");
        } else {
            firstPage.click(function () {
                to_page(1)
            });
            previousPage.click(function () {
                to_page(pageinfo.prePage)
            });
        }

        var nextPage = $("<li></li>").append($("<a></a>").attr("href", "#").append($("<span></span>")).append("&raquo;"));
        var lastPage = $("<li></li>").append($("<a></a>").attr("href", "#").append($("<span></span>")).append("末页"));
        if (!pageinfo.hasNextPage) {
            nextPage.addClass("disabled");
            lastPage.addClass("disabled");
        } else {
            nextPage.click(function () {
                to_page(pageinfo.nextPage)
            });
            lastPage.click(function () {
                to_page(pageinfo.pages)
            });
        }
        ul.append(firstPage).append(previousPage);
        $.each(pageinfo.navigatepageNums, function (index, item) {
            var pageView = $("<li></li>").append($("<a></a>").attr("href", "#").append(item));
            ul.append(pageView);
            pageView.click(function () {
                to_page(item);
            })
            if (item == pageinfo.pageNum) {
                pageView.addClass("active");
            }
        });
        ul.append(nextPage).append(lastPage);
        nav.append(ul).appendTo("#page_info_nav");
    }
</script>
<%--<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"--%>
<%--integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"--%>
<%--crossorigin="anonymous"></script>--%>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"--%>
<%--integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"--%>
<%--crossorigin="anonymous"></script>--%>
<%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"--%>
<%--integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"--%>
<%--crossorigin="anonymous"></script>--%>

</body>
</html>
