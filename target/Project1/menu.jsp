<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Todays Menu</title>
</head>
<body>
	<h4>Select your meal plan for today!</h4>
	<s:if test="hasActionErrors()">
		<div class="errors">
			<s:actionerror />
		</div>
	</s:if>
	<br>
	<s:form action="mymealplan">
		<s:select label="Breakfast" list="breakfast.menu" name="menuReport.breakfast" headerKey="-1" headerValue="Select Breakfast"/>
		<s:select label="Lunch" list="lunch.menu" name="menuReport.lunch" headerKey="-1" headerValue="Select Lunch" />
		<s:select label="Dinner" name="menuReport.dinner" headerKey="-1" headerValue="Select Dinner" list="dinner.menu" />
		<s:select label="Dessert" name="menuReport.dessert" headerKey="-1" headerValue="Select Dessert" list="dessert.menu"/>
		<s:submit />
	</s:form>
</body>
</html>