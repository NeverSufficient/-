<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.OutputStreamWriter"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.BufferedWriter"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta charset="utf-8" />
	<title>学生主界面</title>
	<meta charset="UTF-8">
	<meta name="description" content="overview &amp; stats" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
	<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
	<link rel="stylesheet" href="assets/font-awesome/4.5.0/css/font-awesome.min.css" />
	<link rel="stylesheet" href="assets/css/fonts.googleapis.com.css" />
	<link rel="stylesheet" href="assets/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />
	<link rel="stylesheet" href="assets/css/ace-skins.min.css" />
	<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
	<script src="assets/js/ace-extra.min.js"></script>
</head>
<body class="no-skin">
	<div id="navbar" class="navbar navbar-default          ace-save-state">
		<div class="navbar-container ace-save-state" id="navbar-container">
			<button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
				<span class="sr-only">Toggle sidebar</span> <span class="icon-bar"></span>
				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<div class="navbar-header pull-left">
				<a href="login.jsp" class="navbar-brand"> <small> <i class="fa fa-graduation-cap"></i> 选课管理系统 &nbsp;
					</small>
				</a>
			</div>
		</div>
	</div>
			<ul class="nav nav-list">
				<li class=""><a href="studentPassword.jsp"> <i class="menu-icon fa fa-user"></i> <span class="menu-text">
							修改密码</span> 
					</a> <b class="arrow"></b>
				<li class=""><a href="queryCourse.jsp"> <i class="menu-icon fa fa-table"></i> <span class="menu-text">
							查看课程</span>
					</a> <b class="arrow"></b>
				<li class=""><a href="queryAllCourseServlet"> <i class="menu-icon fa fa-database"></i> <span class="menu-text">
						    选课</span>
				</a> <b class="arrow"></b>
				<li class=""><a href="studentQuerySelectServlet"> <i class="menu-icon fa fa-info"></i> <span
							class="menu-text">
							选课情况/退课</span>
					</a> <b class="arrow"></b>
				</li>
				<li class=""><a href="studentScoreServlet"> <i class="menu-icon fa fa-pencil"></i> <span class="menu-text">
							查看成绩 </span>
					</a> <b class="arrow"></b>
			</ul>
</body>
</html>