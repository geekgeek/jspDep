<%-- 
    http://localhost:8080/WebApplication1/formSend1.jsp?textbox1=stuff1
    http://localhost:8080/WebApplication1/formSend1.jsp?textbox1=stuff3&textbox2=stuff4
    Document   : formSend1
    Created on : 20.okt.2016, 01:20:23
    Author     : guest0
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="package1.creatorJavaScript.JSclassCreator" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Javascript generated</h1>
        
        <% 
            String txtb1 = request.getParameter("textbox1");
            String txtb2 = request.getParameter("textbox2");

            
        JSclassCreator rec1 = new JSclassCreator(txtb1,txtb2);
       String txtb3 = rec1.outputJSEncapsulated();
       
       String numberOfLines = rec1.countLines();
       

        %>
        
        <h2>Lines : <%=numberOfLines %></h2>  
        <%= txtb3 %>

        
    </body>
</html>
