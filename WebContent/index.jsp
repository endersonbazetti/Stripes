<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>

Welcome to Stripes
<hr>

<div class="Login_OutterBox" style="display:none;">
	<div class="Login_UsernameBox">Username: <input type="text" class="Login_UsernameInput" /></div>
	<div class="Login_PasswordBox">Password: <input type="password" class="Login_PasswordInput" /></div>
	<div class="Login_ButtonBox"><input type="button" value="login" class="Login_Button"/></div>
</div>

<br>

<stripes:link beanclass="action.ContactListActionBean">Contact List</stripes:link>

</body>
</html>