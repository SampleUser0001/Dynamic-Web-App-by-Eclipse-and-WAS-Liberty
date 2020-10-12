<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="sample.test01.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- JavaBean生成 --%>
<jsp:useBean id="sessionObject_JavaBean01" class="sample.test01.JavaBean01"
    scope="session" />


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Simple Web Application</title>
</head>
<body>
<h1>Simple Web Application</h1>
<br>
Data01: <jsp:getProperty name="sessionObject_JavaBean01" property="strData01" />
<br>

</body>
</html>