  1
  2
  3  <%@page import="java.io.*"%>
  4
  5 <h1>hello</h1>
  6 <%
  7  //File creation
  8  String strPath = "webapps/ROOT/example.txt";
  9  File strFile = new File(strPath);
 10  boolean fileCreated = strFile.createNewFile();
 11  //File appending
 12  Writer objWriter = new BufferedWriter(new FileWriter(strFile));
 13  objWriter.write("This is a test");
 14  objWriter.flush();
 15  objWriter.close();
 16 %>
~
~
~
~
~
~
