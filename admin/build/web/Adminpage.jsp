<%-- 
    Document   : Registered user
    Created on : 24 Sep, 2019, 12:06:07 PM
    Author     : Abdul Raheman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <form action="action_page.php">
  <div class="container">
    <h2>Admin Registeration</h2>
    <p>Please fill in this form to create an account.</p>
    <hr>
    
    <label for="emp-id"><b>Emp-Id</b></label>
    <input type="number" placeholder="Enter Emp-Id" name="number" required>
    <br>
        <br>
    <label for="emp-name"><b>Emp-Name</b></label>
    <input type="text" placeholder="Enter Emp-Name" name="name" required>
    <br>
        <br>
    <label for="phone-no"><b>Phone-No</b></label>
    <input type="text" placeholder="Enter Phone-No" name="number" required>
    <br>
        <br>    
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
    <br>
        <br>     
    <label for="date of birth"><b>DOB</b></label>
    <input type="date" placeholder="Enter DOB" name="date" required>
    <br>
        <br>     
    <label for="gender"><b>Gender</b></label>
    <input type="text" placeholder="Enter Gender" name="gender" required>
    <br>
        <br>    
        <button type="submit" class="registerbtn">Register</button>
  </div>
    </body>
</html>

