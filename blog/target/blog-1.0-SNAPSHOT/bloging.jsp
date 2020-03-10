<%--
  Created by IntelliJ IDEA.
  User: 86173
  Date: 2020/3/10
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="baidu-site-verification" content="CtYt4injW1" />
    <meta name="360-site-verification" content="a75dcb147688915b4cc7cfaa71e996a2" />
    <meta name="keywords" content="个人博客" />
    <meta name="keywords" content="博客搭建" />
    <meta name="keywords" content="博客网站" />
    <link rel="shortcut icon" href="images/logo.png">
    <meta charset="utf-8">
    <meta charset="gb2312">
    <meta charset="gbk">

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
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</head>
<body>
<style>
    #searchform{
        margin-top: 2px;
    }
    #p{
        height:40px;width:40px;display:inline-block;

    }
    #w{color: white}
    select{
        width:90px;height: 34px;
    }
    .btn{
        padding: 7px 5px;
        font-size: 13px;
    }
</style>
    <%
    System.out.println(session.getAttribute("blogger"));
%>
<body>
<div id="myModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
                <div class="modal-body" style="text-align: center;padding:0px;">
                </div>
    </div><!-- /.modal-dialog -->
</div>
<div class="topnav">
    <!-- Button trigger modal -->
    <div class="row">
        <div class="col-md-6"></div>
        <div class="col-md-3">
            <form action="/e/search/index.php" method="post" name="searchform" id="searchform">
                <input name="keyboard" id="keyboard" class="input_text" value="请输入关键字" style="color: rgb(153, 153, 153);width: 250px" onfocus="if(value=='请输入关键字'){this.style.color='#000';value=''}" onblur="if(value==''){this.style.color='#999';value='请输入关键字'}" type="text">
                <input name="show" value="title" type="hidden">
                <input name="tempid" value="1" type="hidden">
                <input name="tbname" value="news" type="hidden">
                <input name="Submit" class="input_submit" value="搜索" type="submit">
            </form>
        </div>
        <div class="col-md-2" id="photo">
            <img id="p" class="img-circle" src="${sessionScope.blogger.image}">
            <span id="w" style="color: white">${sessionScope.blogger.blogname}</span>
        </div>
    </div>
</div>
<div id="wrapper">
    <header>
        <div class="headtop"></div>
        <div class="contenttop">
            <div class="logo f_l">谈同个人博客♠★♠一个前端设计的热血青年</div>
            <div class="blank"></div>
            <nav>
                <div  class="navigation">
                    <ul class="menu">
                        <li><a href="index.jsp">网站首页</a></li>
                        <li><a href="#">关于我</a>
                            <ul>
                                <li><a href="about.jsp">个人简介</a></li>
                                <li><a href="listpic.jsp">个人相册</a></li>
                            </ul>
                        </li>
                        <li><a href="#">我的日记</a>
                            <ul>
                                <li><a href="newslistpic.jsp">个人日记</a></li>
                                <li><a href="newslistpic.jsp">学习笔记</a></li>
                            </ul>
                        </li>
                        <li><a href="404.html">技术文章</a> </li>
                        <li><a href="message.jsp">给我留言</a> </li>
                    </ul>
                </div>
            </nav>
            <SCRIPT type=text/javascript>
                // Navigation Menu
                $(function() {
                    $(".menu ul").css({display: "none"}); // Opera Fix
                    $(".menu li").hover(function(){
                        $(this).find('ul:first').css({visibility: "visible",display: "none"}).slideDown("normal");
                    },function(){
                        $(this).find('ul:first').css({visibility: "hidden"});
                    });
                });
            </SCRIPT>
        </div>
    </header>
    <div class="container">
        <div class="con_content">
            <div class="about_box">
                <h2 class="nh1"><span>您现在的位置是：<a href="/" target="_blank">网站首页</a>>><a href="#" target="_blank">写博客</a></span><b>写博客</b></h2>
                <div class="f_box">
                    <p class="a_title">博&emsp;&emsp;客</p>
                    <p class="p_title"></p>
                    <!--  <p class="box_p"><span>发布时间：2017-07-07 15:12:42</span><span>作者：唐孝文</span><span>来源：稽查支队</span><span>点击：111056</span></p>-->
                    <!-- 可用于内容模板 -->
                </div>
                <div id="blog">
                    <form action="/blogingServlet" method="post" enctype="multipart/form-data" >
                        <div class="btn-group" role="group" aria-label="...">
                            <button type="submit" class="btn btn-primary">&emsp;提&emsp;交&emsp;</button>
                            <button type="reset" class="btn btn-info">&emsp;重&emsp;写&emsp;</button>
                            <select type="button" class="btn btn-default" name="type">
                                <option selected>个人日记</option>
                                <option>学习日记</option>
                            </select>
                            <select type="button" class="btn btn-default" id="size" >
                                <option selected>14</option>
                                <option>18</option>
                                <option>20</option>
                                <option>24</option>
                            </select>
                            <select type="button" class="btn btn-default" id="font" name="font">
                                <option selected>宋体</option>
                                <option>楷体</option>
                                <option>黑体</option>
                                <option>仿宋</option>
                                <option >Times&ensp;New&ensp;Roman</option>
                            </select>
                            <button style="position:relative;" class="btn btn-success" id="btn" name="btn">
                                上传图片
                                <input  id="upfile" style="opacity:0;width:100%;height:100%;position:absolute;top:0;left:0" type="file" name="upfile" οnchange="fileUpload();"/>
                            </button>
                            <button type="button" class="btn btn-info" id="look">&emsp;查&emsp;看&emsp;</button>
                        </div>
                        <div id="imgs" class="row" style="padding:2px;margin: 2px 1px;border: 1px solid darkgray" hidden>
                        </div>
                        <div class="input-group">
                            <span class="input-group-addon" id="basic-addon1" >标&emsp;&ensp;题</span>
                            <input type="text" class="form-control" placeholder="请输入标题，最大长度不能超过10" aria-describedby="basic-addon1"maxlength="10" name="title">
                        </div>
                        <textarea class="form-control" rows="10" id="content" name="context"></textarea>
                    </form>
<%--                    以上为写blog表单--%>
                    <script type="text/javascript">
                        $(function () {
                            
                        $("#size").click(function () {
                            $("#content").css("font-size",$("#size option:selected").text()+"px")
                        });
                        $("#font").click(function () {
                            $("#content").css("font-family",$("#font option:selected").text())
                        })
                        $("#upfile").change(function () {
                            var files = this.files; // 获取文件的数量
                            for(var i=0;i<files.length;i++){
                                readers(files[i])
                            }
                        })
                        $("#look").click(function () {
                            $("#imgs").toggle()
                        })


                    })
                        function readers(fil){
                            var reader = new FileReader();  // 异步读取存储在用户计算机上的文件
                            reader.readAsDataURL(fil); // 开始读取指定的Blob对象或File对象中的内容
                            reader.onload = function(){
                                $("#imgs").append("<div class='col-md-2'>"+
                                "<a  onclick='look(this)' class='thumbnail'  type='button'  data-toggle='modal' data-target='#myModal' style='margin: 2px'>"+
                                    "<img src='"+reader.result+"'></a></div>");  // 添加图片到指定容器中
                            };
                        }
                        function look(ob) {
                            $(".modal-body").empty().append("<img src='"+ob.firstChild.src+"' style='display: inline-block'>");
                        }


                    </script>
                    
                </div>
                    
            </div>
        </div>
        <div class="blank"></div>
    </div>
</div>
<!-- container代码 结束 -->
<!--<div class="comment">-->
<!--    <div id="SOHUCS"></div>-->
<!--<script type="text/javascript">-->
<!--(function(){-->
<!--var appid = 'cytk2a7nr';-->
<!--var conf = '3437d86f4a4e9bf3aad1ef65fc2740b5';-->
<!--var width = window.innerWidth || document.documentElement.clientWidth;-->
<!--if (width < 960) {-->
<!--window.document.write('<script id="changyan_mobile_js" charset="utf-8" type="text/javascript" src="http://changyan.sohu.com/upload/mobile/wap-js/changyan_mobile.js?client_id=' + appid + '&conf=' + conf + '"><\/script>'); } else { var loadJs=function(d,a){var c=document.getElementsByTagName("head")[0]||document.head||document.documentElement;var b=document.createElement("script");b.setAttribute("type","text/javascript");b.setAttribute("charset","UTF-8");b.setAttribute("src",d);if(typeof a==="function"){if(window.attachEvent){b.onreadystatechange=function(){var e=b.readyState;if(e==="loaded"||e==="complete"){b.onreadystatechange=null;a()}}}else{b.onload=a}}c.appendChild(b)};loadJs("http://changyan.sohu.com/upload/changyan.js",function(){window.changyan.api.config({appid:appid,conf:conf})}); } })(); </script>-->

<!--&lt;!&ndash;PC版&ndash;&gt;-->
<!--<div id="SOHUCS" sid="" ></div>-->
<!--<script charset="utf-8" type="text/javascript" src="https://changyan.sohu.com/upload/changyan.js" ></script>-->
<!--<script type="text/javascript">-->
<!--window.changyan.api.config({-->
<!--appid: 'cytk2a7nr',-->
<!--conf: '3437d86f4a4e9bf3aad1ef65fc2740b5'-->
<!--});-->
<!--</script>-->

<!--&lt;!&ndash;PC和WAP自适应版&ndash;&gt;-->
<!--<div id="SOHUCS" sid="请将此处替换为配置SourceID的语句" ></div>-->
<!--<script type="text/javascript">-->
<!--(function(){-->
<!--var appid = 'cytk2a7nr';-->
<!--var conf = 'prod_53c868f5f3ac56a10e72d038ac860764';-->
<!--var width = window.innerWidth || document.documentElement.clientWidth;-->
<!--if (width < 960) {-->
<!--window.document.write('<script id="changyan_mobile_js" charset="utf-8" type="text/javascript" src="https://changyan.sohu.com/upload/mobile/wap-js/changyan_mobile.js?client_id=' + appid + '&conf=' + conf + '"><\/script>'); } else { var loadJs=function(d,a){var c=document.getElementsByTagName("head")[0]||document.head||document.documentElement;var b=document.createElement("script");b.setAttribute("type","text/javascript");b.setAttribute("charset","UTF-8");b.setAttribute("src",d);if(typeof a==="function"){if(window.attachEvent){b.onreadystatechange=function(){var e=b.readyState;if(e==="loaded"||e==="complete"){b.onreadystatechange=null;a()}}}else{b.onload=a}}c.appendChild(b)};loadJs("https://changyan.sohu.com/upload/changyan.js",function(){window.changyan.api.config({appid:appid,conf:conf})}); } })(); </script>-->
<!--</div>-->
<!--  <footer>-->
<!--    <div class="footer">-->
<!--      <div class="f_l">-->
<!--        <p>All Rights Reserved 版权所有：<a href="http://www.tthcclove.cn">谈同个人博客</a> 备案号：陕ICP备17018883号</p>-->
<!--      </div>-->
<!--      <div class="f_r textr">-->
<!--        <p>QQ：157956315</p>-->
<!--      </div>-->
<!--    </div>-->
<!--  </footer>-->
<!--</div>-->
<!--&lt;!&ndash;百度推送代码&ndash;&gt;-->
<!--<script>-->
<!--(function(){-->
<!--    var bp = document.createElement('script');-->
<!--    var curProtocol = window.location.protocol.split(':')[0];-->
<!--    if (curProtocol === 'https') {-->
<!--        bp.src = 'https://zz.bdstatic.com/linksubmit/push.js';-->
<!--    }-->
<!--    else {-->
<!--        bp.src = 'http://push.zhanzhang.baidu.com/push.js';-->
<!--    }-->
<!--    var s = document.getElementsByTagName("script")[0];-->
<!--    s.parentNode.insertBefore(bp, s);-->
<!--})();-->
<!--</script>-->
</body>
</html>



