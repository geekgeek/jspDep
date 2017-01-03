<%-- 
    http://localhost:8080/WebApplication1/formSend1.jsp?textbox1=stuff1
    http://localhost:8080/WebApplication1/formSend1.jsp?textbox1=stuff3&textbox2=stuff4
    Document   : formSend1
    Created on : 20.okt.2016, 01:20:23
    Author     : guest0
--%>

<%@ page import="package1.creatorJavaAdvanced.*" %>
        
    <% 
        String className1 = request.getParameter("textbox1"); 
        String variables1 = request.getParameter("textbox2"); 
        String dependencies1 = request.getParameter("textbox3"); 
        
        String arrName1 = request.getParameter("textbox4"); //arr name
        String arrType1 = request.getParameter("textbox5"); //arr type
        
        ModuleClassExPlusImp rec1 = new ModuleClassExPlusImp(dependencies1, className1, variables1, arrName1, arrType1);
        
        String getCode = rec1.mainGrabOutputVal();
       
    %>
        

        <%= getCode %>
        

        
