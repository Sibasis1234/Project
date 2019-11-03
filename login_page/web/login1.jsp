<%-- 
    Document   : login1
    Created on : Sep 3, 2019, 3:27:18 PM
    Author     : Sibasis Devta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>LOGIN</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    
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
                    <td><input type="text"  name="User Name" placeholder="User Name"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password"  name="Password" placeholder="Password"></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input type="submit"  value="Submit" ></td>
                    
                </tr>
                <tr>
                <a href="login" </a><td colspan="4"  style="text-align: center"><input  type="button" value="Register"></td>
                
                </tr>
            </table>
        </div>
        </center>
</body>
</html>
