
<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>


<!DOCTYPE html>
<html>
    <head>
        <script
  src="https://code.jquery.com/jquery-1.12.4.min.js"
  integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
  crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            .textboxes
            {
                width: 100%;
            }
         </style>
    </head>
    <body>
        <h1>Java Class Generator</h1>
        <form name="form1" action="formSend4_ADVANCED.jsp" method="POST">
            arrType<input type="text" name="textbox5" id="jtextbox5" class="textboxes"><br>
            arrName<input type="text" name="textbox4" id="jtextbox4" class="textboxes"><br>
            dependencies:<input type="text" name="textbox3" id="jtextbox3" class="textboxes"><br>
            className:<input type="text" name="textbox1" id="jtextbox1" class="textboxes"><br>
            variables:<input type="text" name="textbox2" id="jtextbox2" class="textboxes"><br>
            <input type="submit">
        </form>
        <input type="button" value="getJava" id="getJava1">
        <div id="addStuff1"></div>
        
        <h1>Javascript Class Generator</h1>
        <form name="form1" action="formSend3.jsp" method="POST">
            className:<input type="text" name="textbox1" id="textbox1" class="textboxes"><br>
            variables:<input type="text" name="textbox2" id="textbox2" class="textboxes"><br>
            <input type="submit">
        </form>
        
        <input type="button" id="jscriptgen" value="getJavaScript">
        <div id="addStuff2"></div>
        <script>

            //############################################################
            //############################################################
            //############################################################
            //EVENTS:
            //button click 1
            $('#getJava1').click(function(){
                //Some code
                runAjaxGetJava();
            });
            
            //button click 2
            $('#jscriptgen').click(function(){
                //Some code
                runAjaxGetJavascript();
            });

            //############################################################
            //############################################################
            //############################################################
            //FUNCTIONS:
            jQuery.ajaxSetup({
            timeout: 2000, // Abort all Ajax requests after 2 seconds
            cache: false // Defeat browser cache by adding a timestamp to the URL
            });
            
            var theIpAdress ="http://178.62.79.14:8080/";
            
            function runAjaxGetJava()
            {
                var textb1 = $("#jtextbox1").val();
                var textb2 = $("#jtextbox2").val();
                var textb3 = $("#jtextbox3").val();
                
                var textb4 = $("#jtextbox4").val(); //arr name
                var textb5 = $("#jtextbox5").val(); //arr type
                
                $.ajax
                ({
                    type:"POST",
                    url:theIpAdress + "formSend4_ADVANCED.jsp?textbox1="+textb1+"&textbox2="+textb2+"&textbox3="+textb3+"&textbox4="+textb4+"&textbox5="+textb5,
                    success: function(data)
                    {
                        $("#addStuff1").html(data);
                    }
                });   
            }
            
            function runAjaxGetJavascript()
            {
                var textb1 = $("#textbox1").val();
                var textb2 = $("#textbox2").val();
                
                $.ajax
                ({
                        type:"POST",
                        url:theIpAdress + "formSend3.jsp?textbox1="+textb1+"&textbox2="+textb2,
                        success: function(data)
                        {
                            $("#addStuff2").html(data);
                        }
                });    
            }
            
          
        </script>
  
        
    </body>
</html>
