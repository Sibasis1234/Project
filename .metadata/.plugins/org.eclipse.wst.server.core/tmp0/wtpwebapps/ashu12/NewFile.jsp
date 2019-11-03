<%--  ashutosh das program for clalculating how many times a page hits --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- Ashutosh das putting if else if it hits one time it will print welcome to ashu profile is its hits count is more than one it will print welcome back to ashu life --%>
<%
Integer hitsCount =(Integer)application.getAttribute("hitcounter");
if(hitsCount == null || hitsCount == 0){
	out.println("welcome to ashu profile");
	hitsCount = 1;
}else{
	out.println("welcome back to ashu profile!");
	hitsCount += 1;
}
application.setAttribute("hitCounter",hitsCount);
%>
<p>total number of vistis: <%= hitsCount%>>
</body>
</html>