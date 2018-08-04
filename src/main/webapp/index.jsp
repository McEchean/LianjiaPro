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
        </div>
        <div class="col-md-2 col-md-offset-10">
            <a class="btn btn-default" href="#" role="button" id="login_btn">
                <span class="glyphicon glyphicon-log-in" aria-hidden="true"></span> 登录
            </a>
            <a class="btn btn-default" href="#" role="button" id="register_btn">
                <span class="glyphicon glyphicon-registration-mark" aria-hidden="true"></span> 注册
            </a>
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
<!-- Modaldetail -->
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
                <button type="button" class="btn btn-default" data-dismiss="modal">好</button>
                <%--<button type="button" class="btn btn-primary" data-dismiss="modal">好</button>--%>
            </div>
        </div>
    </div>
</div>

<!-- Modallogin -->
<div class="modal fade" id="ModalLogin" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="ModalLabelLogin">登录</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="LoginUsername" class="col-sm-2 control-label">用户名</label>
                        <div class="col-sm-10">
                            <input name="username" type="text" class="form-control" id="LoginUsername" placeholder="Email@Email.com">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="LoginPassword" class="col-sm-2 control-label">密码</label>
                        <div class="col-sm-10">
                            <input name="password" type="password" class="form-control" id="LoginPassword" placeholder="Password">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox"> 记住用户名
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-10 col-sm-2">
                            <button type="submit" class="btn btn-default" id="login">登录</button>
                            <%--<button class="btn btn-default" data-dismiss="modal">取消</button>--%>
                        </div>
                    </div>
                </form>
            </div>
            <%--<div class="modal-footer">--%>
                <%--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--%>
                <%--<button type="button" class="btn btn-primary">Save changes</button>--%>
            <%--</div>--%>
        </div>
    </div>
</div>

<!-- Modalregister -->
<div class="modal fade" id="ModalRegister" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="ModalLabelRegister">注册</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="inputUsername4" class="col-sm-2 control-label">用户名</label>
                        <div class="col-sm-8">
                            <input name="username" type="text" class="form-control" id="inputUsername4" placeholder="Username">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword4" class="col-sm-2 control-label">密码</label>
                        <div class="col-sm-8">
                            <input name="password" type="password" class="form-control" id="inputPassword4" placeholder="Password">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail4" class="col-sm-2 control-label">邮箱</label>
                        <div class="col-sm-5">
                            <input name="email" type="email" class="form-control" id="inputEmail4" placeholder="Example@example.com">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPhone" class="col-sm-2 control-label">手机</label>
                        <div class="col-sm-5">
                            <input name="telephone" type="text" class="form-control" id="inputPhone" placeholder="130xxxxxxxx">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputName" class="col-sm-2 control-label">昵称</label>
                        <div class="col-sm-5">
                            <input name="name" type="text" class="form-control" id="inputName" placeholder="昵称">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="InputSex1" class="col-sm-2 control-label">性别</label>
                        <label class="col-sm-offset-1 radio-inline">
                            <input type="radio" name="sex" id="InputSex1" value="1"> 男
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="sex" id="InputSex2" value="2"> 女
                        </label>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-10 col-sm-2">
                            <button type="submit" class="btn btn-default" id="register">注册</button>
                        </div>
                    </div>
                </form>
            </div>
            </div>
            <%--<div class="modal-footer">--%>
                <%--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--%>
                <%--<button type="button" class="btn btn-primary">Save changes</button>--%>
            <%--</div>--%>
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
        to_page(1,1);
    });

    function to_page(pn,type) {
        $.ajax({
                url: "${app_path}/LianjiaMore.do",
                data: "pn=" + pn +"&type="+type,
                type: "GET",
                success: function (result) {
                    // console.log(result)
                    //    具体信息的填充
                    Build_Lianjia_table(result,type);
                    //    分页信息的填充
                    Build_pageinfo(result,type);
                    //显示排序信息
                    Build_orderinfo(result,type);

                    Build_orderinfo;
                }
            }
        );

    }
    function Build_orderinfo() {
        var ul = $("<ul></ul>").addClass("dropdown-menu").attr("aria-labelledby", "dropdownMenu1");
        var li1 = $("<li></li>").append($("<a></a>").attr("href","#").append("由低到高"));
        var li2 = $("<li></li>").append($("<a></a>").attr("href","#").append("由高到低"));
        var li3 = $("<li></li>").append($("<a></a>").attr("href","#").append("综合排序"));
        ul.append(li1).append(li2).append(li3).appendTo(".dropdown");
        li1.click(function () {
            to_page(1,1);
        })
        li2.click(function () {
            to_page(1,2);
        })
        li3.click(function () {
            to_page(1,3);
        })
    }


    function Build_Lianjia_table(result,type) {
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

    function Build_pageinfo(result,type) {
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
                to_page(1,type)
            });
            previousPage.click(function () {
                to_page(pageinfo.prePage,type)
            });
        }

        var nextPage = $("<li></li>").append($("<a></a>").attr("href", "#").append($("<span></span>")).append("&raquo;"));
        var lastPage = $("<li></li>").append($("<a></a>").attr("href", "#").append($("<span></span>")).append("末页"));
        if (!pageinfo.hasNextPage) {
            nextPage.addClass("disabled");
            lastPage.addClass("disabled");
        } else {
            nextPage.click(function () {
                to_page(pageinfo.nextPage,type)
            });
            lastPage.click(function () {
                to_page(pageinfo.pages,type)
            });
        }
        ul.append(firstPage).append(previousPage);
        $.each(pageinfo.navigatepageNums, function (index, item) {
            var pageView = $("<li></li>").append($("<a></a>").attr("href", "#").append(item));
            ul.append(pageView);
            pageView.click(function () {
                to_page(item,type);
            })
            if (item == pageinfo.pageNum) {
                pageView.addClass("active");
            }
        });
        ul.append(nextPage).append(lastPage);
        nav.append(ul).appendTo("#page_info_nav");
    }

    function vailued_login_formdata() {
        var usernameVal = $("#LoginUsername").val();
        var regusername = /^[0-9a-zA-Z_\-]{6,16}$/;
        if (!regusername.test(usernameVal)) {
            show_status("#LoginUsername","faild","用户名可以是包含数字字母下划线的6到16位组成");
            return false;
        }else {
            show_status("#LoginUsername","success","");
        }

        var passwordVal = $("#LoginPassword").val();
        var regpassword = /^[0-9a-zA-Z_\-\[\]]{6,16}$/;
        if (!regpassword.test(passwordVal)) {
            show_status("#LoginPassword","faild","密码由数字字母下划线的6到16位组成");
            return false;
        }else {
            show_status("#LoginPassword","success","");
        }
        return true;
    }

    $("#login").click(function () {
        //数据校验
        alert(vailued_login_formdata());
        if (!vailued_login_formdata()) {
            return false;
        }
        $.ajax({
            url:"${app_path}/user/login.do",
            data:$("#ModalLogin form").serialize(),
            type:"GET",
            success:function (result) {
                if(result.msg=="false") {

                }
            }
        })
    })
    function vailued_register_formdata() {
        var usernameVal = $("#inputUsername4").val();
        var regusername = /^[0-9a-zA-Z_\-]{6,16}$/;
        if (!regusername.test(usernameVal)) {
            show_status("#inputUsername4","faild","用户名可以是包含数字字母下划线的6到16位组成");
            return false;
        }else {
            show_status("#inputUsername4","success","");
        }

        var passwordVal = $("#inputPassword4").val();
        var regpassword = /^[0-9a-zA-Z_\-\[\]]{6,16}$/;
        if (!regpassword.test(passwordVal)) {
            show_status("#inputPassword4","faild","密码由数字字母下划线的6到16位组成");
            return false;
        }else {
            show_status("#inputPassword4","success","");
        }

        var emailVal = $("#inputEmail4").val();
        var regemail = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
        if (!regemail.test(emailVal)) {
            show_status("#inputEmail4","faild","邮箱格式不正确");
            return false;
        }else {
            show_status("#inputEmail4","success","");
        }
        var phoneVal = $("#inputPhone").val();
        var regphone = /^1(3|4|5|7|8)\d{9}$/;
        if (!regphone.test(phoneVal)) {
            show_status("#inputPhone","faild","请填写正确手机号");
            return false;
        }else {
            show_status("#inputPhone","success","");
        }

        var nameVal = $("#inputName").val();
        var regname = /^[0-9a-zA-Z_\-\[\]\u4e00-\u9fff]{1,10}$/;
        if (!regname.test(nameVal)) {
            show_status("#inputName","faild","昵称为1到10位");
            return false;
        }else {
            show_status("#inputName","success","");
        }
        return true;
    }
    function show_status(ele, status, msg) {
        $(ele).parent().removeClass("has-success has-error");
        $(ele).next("span").text("");
        if (status == "success") {
            $(ele).parent().addClass("has-success");
            $(ele).next("span").append(msg);
        }else if (status == "faild") {
            $(ele).parent().addClass("has-error");
            $(ele).next("span").append(msg);
        }
    }

    $("#register").click(function () {
        //数据校验
        if (!vailued_register_formdata()) {
            return false;
        }
        var first = $("#ModalRegister form").attr("ajax");
        if(first != "success"){
            return false;
        }

        $.ajax({
            url:"${app_path}/user/register.do",
            data:$("#ModalRegister form").serialize(),
            type:"POST",
            success:function (result) {
                if(result.msg=="false") {
                    alert("添加失败！")
                }else {
                    alert("添加成功！")
                    $('#ModalRegister').modal('hide');
                }
            }
        })
    })

    //到数据库验证是否可用
    $("#inputUsername4").change(function () {
        var regusername = /^[0-9a-zA-Z_\-]{6,16}$/;
        var modelForm = $("#ModalRegister form");
        vailued_data("#inputUsername4","用户名可以是包含数字字母下划线的6到16位组成",regusername,modelForm);
        var first = modelForm.attr("ajax");
        $.ajax({
            url:"${app_path}/user/usernameCheck.do",
            data:"username=" + $(this).val(),
            type:"POST",
            success:function (result) {
                if(result.status == 200 && first == "success") {
                    show_status("#inputUsername4","success","用户名可用");
                }else if (result.status == 100 && first == "success") {
                    show_status("#inputUsername4","faild","用户名不可用");
                    modelForm.attr("ajax","error");
                }
            }
        })

    })

    $("#inputPhone").change(function () {
        var regphone = /^1(3|4|5|7|8)\d{9}$/;
        var modelForm = $("#ModalRegister form");
        vailued_data("#inputPhone","请填写正确手机号",regphone,modelForm);
        var first = modelForm.attr("ajax");
        $.ajax({
            url:"${app_path}/user/phoneCheck.do",
            data:"phone=" + $(this).val(),
            type:"POST",
            success:function (result) {
                $(this).next("span").text("");
                if(result.status == 200 && first == "success") {
                    show_status("#inputPhone","success","手机号可用");
                }else if (result.status == 100 && first == "success") {
                    show_status("#inputPhone","faild","此手机号已注册");
                    modelForm.attr("ajax","error");
                }
            }
        })

    })

    $("#inputEmail4").change(function () {
        var regemail = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
        var modelForm = $("#ModalRegister form");
        vailued_data("#inputEmail4","邮箱格式不正确",regemail,modelForm);
        var first = modelForm.attr("ajax");
        $.ajax({
            url:"${app_path}/user/emailCheck.do",
            data:"email=" + $(this).val(),
            type:"POST",
            success:function (result) {
                if(result.status == 200 && first == "success") {
                    show_status("#inputEmail4","success","邮箱可用");
                }else if (result.status == 100 && first == "success") {
                    show_status("#inputEmail4","faild","邮箱已注册");
                    modelForm.attr("ajax","error");
                }
            }
        })

    })
    function vailued_data(ele,msg,reg,modelForm) {
        var val = $(ele).val();
        var reg = reg;
        if (!reg.test(val)) {
            show_status(ele,"faild",msg);
            modelForm.attr("ajax","error");
        }else {
            show_status(ele,"success","");
            modelForm.attr("ajax","success");
        }
    }
    $("#login_btn").click(function () {
        $("#ModalLogin form")[0].reset();
        $("#ModalLogin").modal({
            backdrop:"static"
        });
    })

    $("#register_btn").click(function () {
        $("#ModalRegister form")[0].reset();
        // $("#ModalRegister span").text("");
        $("#ModalRegister").modal({
            backdrop:"static"
        });
    })

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
