<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your Meal Today</title>
</head>
<body>
	<h4>Your meal plan for today</h4>
	<s:property value="menuReport.breakfast" />
	<br>
	<s:property value="menuReport.lunch" />
	<br>
	<s:property value="menuReport.dinner" />
	<br>
	<s:property value="menuReport.dessert" />
	<br>
</body>
</html>