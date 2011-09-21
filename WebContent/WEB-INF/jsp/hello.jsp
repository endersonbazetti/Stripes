<%@include file="/WEB-INF/jsp/common/taglibs.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Hello, Stripes!</title>
</head>

<body>
	<h3>Hello, Stripes!</h3>
	<p>Date and time: <br>
	Report erratum this copy is (P1.0 printing, October 2008) Prepared
	exclusively for Trieu Nguyen Download at Boykma.Com HE L L O, ST R I P E
	S! 30 <b> <fmt:formatDate type="both" dateStyle="full" value="${actionBean.date}" /> </b>
	</p>
	
	<p> <stripes:link beanclass="action.HelloActionBean" event="currentDate"> Show the current date and time
		<stripes:param name="password" value="1234" />
		</stripes:link>
	 | <stripes:link beanclass="action.HelloActionBean" event="randomDate"> Show a random date and time </stripes:link></p>
</body>
</html>