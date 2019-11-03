<%-- 
    Document   : Login Page
    Created on : 24 Sep, 2019, 12:47:50 PM
    Author     : Abdul Raheman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="action_page.php">
  <div class="container">
    <h2>Login Credentials</h2>
    <hr>
    
    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="name" required>
    <br>
        <br>
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="name" required>
    <br>
        <br>
        <div>
            <button type="submit" class="registerbtn">Login</button>
        </div>
        
    </body>
</html>
