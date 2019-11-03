<%-- 
    Document   : newjsp
    Created on : 3 Sep, 2019, 3:25:27 PM
    Author     : Abdul Raheman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registered User</title>
    </head>
    <body background="image1.jpg">
         <form action="Login Page.jsp">
  <div class="container">
    <h2>Individual Registeration</h2>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>
    <br>
        <br>
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
    <br>
        <br>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
    <br>
        <br>
    <label for="psw-repeat"><b>Confirm Password</b></label>
    <input type="password" placeholder="Confirm Password" name="psw-confirm" required>
    <br>
        <br>
    <label for="security-question"><b>Security Question</b></label>
    <input type="question" placeholder="Security Question" name="security-question" required>
    <br>
        <br>
    <label for="security-answer"><b>Security Answer</b></label>
    <input type="answer" placeholder="Security Answer" name="security-answer" required>
    <br>
        <br>
    <label for="Preferred-Language"><b>Preferred Language</b></label>
    <input type="language" placeholder="Preferred Language" name="preferred-language" required>
    
    
    <hr>
    </div>
             
    <div class="container Personal Details">
        <br>
        
        <h2>Personal Details</h2>
    <label for="first-name"><b>First_Name</b></label>
    <input type="text" placeholder="Enter First Name" name="name" required>
        <br>
        <br>
    <label for="last-name"><b>Last_Name</b></label>
    <input type="text" placeholder="Enter Last Name" name="name" required>
        <br>
        <br>
    
        <label for="date-of-birth"><b>Date of Birth</b></label>
    <input type="date" placeholder="Enter Date of Birth" name="Date" required>
    
    <label for="occupation"><b>Occupation</b></label>
    <input type="occupation" placeholder="Enter Occupation" name="Occupation" required>
    
    <label for="country"><b>Country</b></label>
    <input type="country" placeholder="Enter Country" name="Country" required>
    
    <label for="email"><b>Email</b></label>
    <input type="email" placeholder="Enter Email" name="Email" required>
    
    <label for="nationality"><b>Nationality</b></label>
    <input type="nationality" placeholder="Enter Nationality" name="Nationality" required>
    
    
    </div>
             
    <div class="container Residential Address">
        <h2> Residential Address</h2>
    <label for="flat/door/blockno"><b>Flat/Door/Block-No</b></label>
    <input type="address" placeholder="Enter Flat/Door/Block-No" name="Flat/Door/Block-No" required>
    
    <br>
    <br>
    
    <label for="street/lane"><b>Street/Lane</b></label>
    <input type="street/lane" placeholder="Enter Street/Lane" name="Street/Lane" required>
        
    <br>
    <br>
    
    <label for="area/locality"><b>Area/Locality</b></label>
    <input type="area/locality" placeholder="Enter Area/Locality" name="Area/Locality" required>
        
    <br>
    <br>
    
    <label for="pincode"><b>Pincode</b></label>
    <input type="pincode" placeholder="Enter Pincode" name="Pincode" required>
        
    <br>
    <br>
    
    <label for="state"><b>State</b></label>
    <input type="state" placeholder="Enter State" name="State" required>
        
    <br>
    <br>
    
    <label for="city/town"><b>city/town</b></label>
    <input type="city/town" placeholder="Enter city/town" name="city/town" required>
        
    <br>
    <br>
    
    <label for="post-office"><b>Post-Office</b></label>
    <input type="post-office" placeholder="Enter Post-Office" name="Post-Office" required>
        
    <br>
    <br>
    
    <label for="phone-number"><b>Phone-Number</b></label>
    <input type="text" placeholder="Enter Phone Number" name="number" required>
    
    </div>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Register</button>
  

  <div class="container signin">
    <p>Already have an account? <a href="LoginPage.jsp">Sign in</a>.</p>
  </div>
</form> 
        
    </body>
</html>
