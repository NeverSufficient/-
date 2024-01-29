<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.OutputStreamWriter"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.BufferedWriter"%>
<%@page import="java.io.File"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta charset="utf-8" />
	<title>教师查询选课情况成功界面</title>
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
	<div class="row">
		<div class="col-xs-12">
				<div>
					<table id="dynamic-table" class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
								<th class="center">学号</th>
								<th class="center">姓名</th>
								<th class="center">性别</th>
								<th class="center">班级</th>
								<th class="center">课程</th>
								<th class="center">评分</th>
							</tr>
						</thead>
							<tbody>
							<c:forEach items="${allCourse}" var="course">
							 <tr>
								<td class="center">${course.sno}</td>
								<td class="center">${course.sname}</td>
								<td class="center">${course.ssex}</td>
								<td class="center">${course.sclass}</td>
								<td class="center">${course.cname}</td>
								<td class="center">
									<form class="no-padding" action="teacherScore.jsp" method="post"
										accept-charset="UTF-8">
										<button class="btn btn-xs btn-info"  role="button"
											data-toggle="modal" value="${course.sno}" name="sno">
											评分
										</button>
									</form>
								</td>
							 </tr>
						    </c:forEach>
						</tbody>
					</table>
					 <a href="teacher.jsp" class="navbar-brand"> <small>返回教师主界面 &nbsp;</small></a>
				</div>
			</div>
		</div>	
</body>
</html>