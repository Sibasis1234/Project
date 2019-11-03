<%-- 
    Document   : login
    Created on : Oct 29, 2019, 2:31:09 PM
    Author     : Sibasis Devta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <style>
        td{
            padding: 10px;
        }
        div{
            width: 50%;
            border: 1px solid black;
            border-radius: 10px;
            background-color: sky blue;
        }
    </style>
    <body>
         <center><h1><u>Login Here</u></h1></center>
    <center>    
    <div>
            <table>
                <tr>
                    <td>User Name</td>
                    <td><input type="text" class="form-control" name="User Name" placeholder="User Name"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" class="form-control" name="Password" placeholder="Password"></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input class="btn-success" type="submit"  value="Submit" ></td>
                    
                </tr>
                <tr>
                    <td colspan="4" style="text-align: center"><input class="btn-success" type="button" value="Register"></td>
                </tr>
            </table>
        </div>
        </center>
    </body>
</html>
