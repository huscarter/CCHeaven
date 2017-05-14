<%--
  Created by IntelliJ IDEA.
  User: weiwhite
  Date: 5/6/17
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Index</title>

    <!-- Bootstrap -->
    <link href="extra/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="extra/jquery/jquery-3.2.1.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="extra/bootstrap/js/bootstrap.min.js"></script>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <!--<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>-->
    <!--<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>-->
    <![endif]-->
</head>
<body>
    <div id="top_bar" style="position: fixed;top:0px;left:0px;width:100%;height:50px;background:#DDDDDD;">
        <img />logo<input type="text"/> <button title="search">search</button><a href="" >login</a><a href=""> register</a>
    </div>

    <div id="activity_show" style="background: #e3e3e3;width:100%;height:230px;">

    </div>

    <div id="navigation_bar" style="background: #222222;width:100%;height: 50px;">
        <a href="">首页</a><a href="">写真</a><a href="">视频</a><a href="">漫展</a><a href="">比赛</a><a href="">活动发布</a><a href="">讨论区</a>
    </div>

    <div id="main" style="background: #555555;width:100%;">
        <!-- 第一行，活动轮播和推荐区 -->
        <div>
            <span style="height: 300px;width: 65%;background: #8a6d3b">
                <div></div>
                <div></div>
                <div></div>
            </span>
            <span style="height: 300px;width: 35%; background: #222222;">
                <div><span></span><span></span></div>
                <div><span></span><span></span></div>
            </span>
        </div>

        <!-- 写真内容区 -->

        <!-- 视频内容区 -->

        <!-- 漫展内容区 -->

    </div>

    <div id="foot" style="background: #eeeeee;width:100%;height: 180px;">
        @copyright www.whh.com
    </div>
</body>

</html>
