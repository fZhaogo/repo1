<%--
  Created by IntelliJ IDEA.
  User: 86173
  Date: 2020/3/10
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="baidu-site-verification" content="CtYt4injW1" />
    <meta name="360-site-verification" content="a75dcb147688915b4cc7cfaa71e996a2" />
    <link rel="shortcut icon" href="images/logo.png">
    <meta charset="utf-8">
    <meta charset="gb2312">
    <title>个人博客♠★♠一个前端设计的热血青年</title>
    <meta name="keywords" content="谈同个人博客♠★♠一个前端设计的热血青年" />
    <meta name="description" content="谈同个人博客♠★♠一个前端设计的热血青年" />
    <link href="css/base.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="js/modernizr.js"></script>
    <![endif]-->
    <script type="text/javascript" src="js/jquery.js"></script>
    <script src="js/shang.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>

</head>

<style>
    #feedAvi{position: absolute !important;z-index: -9999;left: -1000px;opacity: 0 !important;}
    #login{
        background:url(images/bg.jpg) repeat;
        padding: 20px 50px;
    }
    #myModal{margin-top: 100px}
    .container{height: 600px}
    h5{height: 20px;text-align: left;margin:0px 80px;}
</style>
<body class="modal-open" style="padding-right: 16px">
<div id="myModal" class="modal fade in" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" style="display: block; padding-right: 16px;">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <form id="login" action="#" method="post" style="text-align: center">
                <div class="modal-header" style="text-align: left;padding-bottom: 0px">
                    <h4 class="modal-title" id="myModalLabel">登录页面</h4>
                </div>        
                <h3 style="color: red;margin-top:-10px;height:25px;margin: 0px 0px;">${msg}</h3>
                <div class="modal-body">
                    <h5 id="msg"></h5>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">用 户 名</span>
                        <input type="text" class="form-control" placeholder="请输入用户名" aria-describedby="basic-addon1" id="blogname" name="blogname">
                    </div>
                    <p></p>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon2">密  码</span>
                        <input type="password" class="form-control" placeholder="请输入密码" aria-describedby="basic-addon2" id="password" name="password">
                    </div>
                    <p></p>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon3">验 证 码</span>
                        <input type="text" class="form-control" placeholder="请输入验证码" aria-describedby="basic-addon3" id="vcode" name="vcode">
                    </div>       
                    <h5 id="tip"></h5>
                    <a href="javascript:refreshCode()">
                        <img src="/vcode" id="img" title="看不清楚刷新" style="margin-left: 100px"></a>
                </div>
                <div class="modal-footer">
                    <a type="button" class="btn btn-warning" data-dismiss="modal" href="/login.jsp">返回</a>

                    <button type="reset" class="btn btn-danger">重置</button>
                    <button type="button" class="btn btn-primary" id="commit">登录</button>
                </div>
            </form>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>
<script type="text/javascript">
    function refreshCode() {
        $("#img").attr("src","/vcode?date="+new Date())
    }
    $(function () {
        $("#commit").click(function () {
            $.post("/loginServlet",{blogname:$("#blogname").val(),password:$("#password").val(),vcode:$("#vcode").val()},function (resp){
                if (resp.res==0){
                    $("#tip").text("验证码错误");
                    $("#tip").css("color","red");
                } else if(resp.res==1){
                    location.href="index.jsp";
                }
                else{
                    $("#msg").text("用户名或密码错误").css("color","red");
                }
            },"json")
        });
        $(":text,:password").focus(function () {
            $("#tip").empty();
            $("#msg").empty();
        })
    })
</script>
<%--以上为登录框内容--%>
<div id="wrapper">
    <header>
        <div class="headtop"></div>
        <div class="contenttop">
            <div class="logo f_l">个人博客♠★♠一个前端设计的热血青年</div>
        </div>
    </header>
    <div class="container">

    </div>
</div>

    <footer>
        <div class="footer">
            <div class="f_l">
                <p>All Rights Reserved 版权所有：<a href="http://www.tthcclove.cn">谈同个人博客</a> 备案号：陕ICP备17018883号</p>
            </div>
            <div class="f_r textr">
                <p>QQ：157956315</p>
            </div>
        </div>
    </footer>
</div>

</body>
<script>
    function loadCssCode(code){
        var style = document.createElement('style');
        style.type = 'text/css';
        style.rel = 'stylesheet';
        //for Chrome Firefox Opera Safari
        style.appendChild(document.createTextNode(code));
        //for IE
        //style.styleSheet.cssText = code;
        var head = document.getElementsByTagName('head')[0];
        head.appendChild(style);
    }

    //去除畅言广告
    loadCssCode('#feedAvi{position: absolute !important;z-index: -9999;left: -1000px;opacity: 0 !important;}');

</script>
</html>

