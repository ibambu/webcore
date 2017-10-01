<%-- 
    Document   : index
    Created on : 2017-3-21, 22:18:19
    Author     : luotao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
    <head>
        <title>商城管理中心</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--jquery-->
        <script src="jquery/jquery-3.2.0.min.js"></script>
        <!--bootstrap-->
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <!--bootstap table-->
        <link rel="stylesheet" href="bootstrap/css/bootstrap-table.min.css">
        <script src="bootstrap/js/bootstrap-table.min.js"></script>
        <script src="bootstrap/js/bootstrap-table-zh-CN.min.js"></script>
        <!--treeview-->
        <link rel="stylesheet" href="bootstrap/css/bootstrap-treeview.min.css"> 
        <script src="bootstrap/js/bootstrap-treeview.js"></script> 
        <!--menu-->
        <script src="js/menu.js"></script>
        <style>
            /* Remove the navbar's default margin-bottom and rounded borders */ 
            .navbar {
                margin-bottom: 0;
                border-radius: 0;
            }
            .left-zero{
                padding-left: 0;
            }
            .right-zero{
                padding-right: 0;
            }
            .left-sm{
                padding-left: 1px;
            }
            .right-sm{
                padding-right: 1px;
            }
            /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
            .row.content {height: 100%}

            /* Set gray background color and 100% height */
            .sidenav {
                padding: 4px;
                background-color: #f1f1f1;
                height: 100%;
                overflow-y:auto;
            }
            .treeview{
                text-align: left
            }
            /* Set black background color, white text and some padding */

            /* On small screens, set height to 'auto' for sidenav and grid */
            @media screen and (max-width: 767px) {
                .sidenav {
                    height: auto;
                    padding: 15px;
                }
                .row.content {height:auto;} 
            }
        </style>
    </head>
    <body>
        <!--页面头部-->
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                    <a class="navbar-brand" href="#"><font style=" font-weight: 900; color: #0078ae">bamboo</font></a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li><a href="#">首页</a></li>
                        <li class="active"><a href="#">关于我们</a></li>
                        <li><a href="javascript:getMenuData()">项目</a></li>
                        <li><a href="#">联系我们</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <!--页面主体-->
        <div class="container-fluid text-center">    
            <div class="row content">
                <!--左侧菜单-->
                <div class="col-sm-2 sidenav right-zero" id="menuTree">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="搜索菜单">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button">
                                <span class="glyphicon glyphicon-search"></span>
                            </button>
                        </span>
                    </div>
                    <div id="tree">

                    </div>
                </div>
                <!--中间内容-->
                <div class="col-sm-10 text-left left-zero" id="contentBody"> 
                    qqqqqqq
                </div>
                <!--右侧广告位-->
                <!--页面底部-->
                <div class="container-fluid" id="footer">
                    <p>
                        版权 copy right @2017 http://www.luoma.com 罗码科技有限公司
                    </p>
                </div>
            </div>
        </div>
        <script>
            $("#menuTree").css("height", screen.height * 0.85);//自适应高度
            $("#contentBody").css("height", screen.height * 0.8);//自适应高度
            $('#tree').treeview({
                expandIcon: 'glyphicon glyphicon-chevron-right',
                collapseIcon: 'glyphicon glyphicon-chevron-down',
                nodeIcon: 'glyphicon glyphicon-user',
                enableLinks: true,
                showBorder: false,
                backColor: "#f1f1f1",
                onhoverColor: "white",
                showTags: true,
                highlightSelected: true,
                selectedColor: "#eee8cd",
                data: getMenuData()
            });
        </script>
    </body>
</html>

