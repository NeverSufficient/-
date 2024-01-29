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
	<title>学生查询课程界面</title>
	<meta charset="UTF-8">
	<meta name="description" content="overview &amp; stats" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
	<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
	<link rel="stylesheet" href="assets/font-awesome/4.5.0/css/font-awesome.min.css" />
	<link rel="stylesheet" href="assets/css/fonts.googleapis.com.css" />
	<link rel="stylesheet" href="assets/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />
	<link rel="stylesheet" href="assets/css/ace-skins.min.css" />
	<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
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
	<div class="main-container">
		<div class="main-content">
			<div class="row">
				<div class="col-sm-10 col-sm-offset-1">
					<div class="login-container">
						<div class="center">
						</div>
						<div class="space-6"></div>
						<div class="position-relative">
							<div id="login-box" class="login-box visible widget-box no-border">
								<div class="widget-body">
									<div class="widget-main">
										<h4 class="header blue bigger">
											请输入课程名（支持模糊查询）
										</h4>
										<div class="space-6"></div>
										<form action="queryCourseServlet" method="POST">
											<fieldset>
												<label class="block clearfix">
													<span class="block input-icon input-icon-right">
													<input type="text" class="form-control" placeholder="请输入要查询的课程名"
															id="login-id" name="cname" />
													</span>
												</label>
												<div class="space"></div>
												<div class="clearfix">
													<button type="submit"
														class="width-35 pull-right btn btn-sm btn-primary"
														id="login-btn">
														<span class="bigger-110">查询</span>
													</button>
													<button type="reset"
														class="width-35 pull-left btn btn-sm btn-primary"
														id="login-btn">
														<span class="bigger-110">重置</span>
													</button>
												</div>
												<div class="space-4"></div>
											</fieldset>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>