<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Result</title>
    </head>
    <body>
        
        <!--Display number of occurrences from bean-->
        Word Count: <jsp:getProperty name = "bean" property="count"/>
        <br>
        <br>
        
        <!--Form to return to start-->
        <form action="index.html" method="post">
            <input type="Submit" value="New Search">
        </form>
    </body>
</html>
