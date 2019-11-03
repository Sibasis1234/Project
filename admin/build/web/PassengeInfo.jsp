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
        <title>Passenger Info</title>
    </head>
    <body>
        <form action="action_page.php">
  <div class="container">
    <h2>Passenger Information</h2>
    <p>Please fill in this form to create an account.</p>
    <hr>
    
    <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" required>
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
    <label for="sex"><b>Sex</b></label>
    <input type="text" placeholder="Enter Sex" name="name" required>
    <br>
        <br>     
    <label for="age"><b>Age</b></label>
    <input type="number" placeholder="Enter Age" name="number" required>
    <br>
        <br>     
    <label for="seat-no"><b>Seat-No</b></label>
    <input type="number" placeholder="Enter Seat-No" name="number" required>
    <br>
        <br>  
    <label for="pnr"><b>PNR</b></label>
    <input type="number" placeholder="Enter PNR" name="number" required>
    <br>
        <br>    
        <button type="submit" class="registerbtn">Submit</button>
  </div>
    </body>
</html>

