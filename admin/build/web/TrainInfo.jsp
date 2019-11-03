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
        <title>Train Info</title>
    </head>
    <body>
        <form action="action_page.php">
  <div class="container">
    <h2>Train Information</h2>
    <p>Please fill in this form to create an account.</p>
    <hr>
    
    <label for="train-name"><b>Train-Name</b></label>
    <input type="text" placeholder="Enter Train-Name" name="name" required>
    <br>
        <br>
    <label for="train-type"><b>Train-Type</b></label>
    <input type="text" placeholder="Enter Train-Type" name="type" required>
    <br>
        <br>
    <label for="source"><b>Source</b></label>
    <input type="text" placeholder="Enter Source" name="name" required>
    <br>
        <br>    
    <label for="destination"><b>Destination</b></label>
    <input type="text" placeholder="Enter Destination" name="name" required>
    <br>
        <br>     
    <label for="distance"><b>Distance</b></label>
    <input type="number" placeholder="Enter Distance" name="number" required>
    <br>
        <br>   
        <button type="submit" class="registerbtn">Submit</button>
  </div>
    </body>
</html>

