
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
</style>
    <%
    System.out.println(session.getAttribute("blogger"));
%>
<body>
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
                        <li><a href="index.html">网站首页</a></li>
                        <li><a href="#">关于我</a>
                            <ul>
                                <li><a href="about.jsp">个人简介</a></li>
                                <li><a href="listpic.jsp">个人相册</a></li>
                            </ul>
                        </li>
                        <li><a href="#">我的日记</a>
                            <ul>
                                <li><a href="personslistpic.jsp">个人日记</a></li>
                                <li><a href="learnslistpic.jsp">学习笔记</a></li>
                            </ul>
                        </li>
                        <li><a href="#">技术文章</a> </li>
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
                <h2 class="nh1"><span>您现在的位置是：<a href="/" target="_blank">网站首页</a>>><a href="#" target="_blank">个人简历浏览</a></span><b>个人简介</b></h2>
                <div class="f_box">
                    <p class="a_title">个人简介</p>
                    <p class="p_title"></p>
                    <!--  <p class="box_p"><span>发布时间：2017-07-07 15:12:42</span><span>作者：唐孝文</span><span>来源：稽查支队</span><span>点击：111056</span></p>-->
                    <!-- 可用于内容模板 -->
                </div>
                <ul class="about_content">
                    <p> 人生就是一个得与失的过程，而我却是一个幸运者，得到的永远比失去的多。生活的压力迫使我放弃了轻松的前台接待，放弃了体面的编辑，换来虽有些蓬头垢面的工作，但是我仍然很享受那些熬得只剩下黑眼圈的日子，因为我在学习使用Photoshop、Flash、Dreamweaver、ASP、PHP、JSP...中激发了兴趣，然后越走越远....</p>
                    <p><img src="images/me.jpeg" width="30%"></p>
                    <p>“既然你选择不了，那你就改变好了”。 </p>
                </ul>
                <!--    <div class="nextinfos">-->
                <!--      <p>上一篇：<a href="/">区中医医院开展志愿服务活动</a></p>-->
                <!--      <p>下一篇：<a href="/">广安区批准“单独两孩”500例</a></p>-->
                <!--    </div>&ndash;&gt;-->
                <!-- 可用于内容模板 -->

                <!-- container代码 结束 -->
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


