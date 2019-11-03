<%-- 
    Document   : Train_Details
    Created on : Oct 29, 2019, 2:43:30 PM
    Author     : Sibasis Devta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Train_Details</title>
    </head>
       <style>
        td{
            padding: 10px;
        }
        div{
            width: 50%;
            border: 1px solid black;
            border-radius: 10px;
            background-color: skyblue;
        }
    </style>
    <body>
           <center><h1><u>TRAIN DETAILS</u></h1></center>
    <center>    
    <div>
            <table>
                <tr>
                    <td>TRAIN NO. :</td>
                    <td><input type="number"  name="Train No." placeholder="Train no."></td>
                </tr>
                <tr>
                    <td>TRAIN NAME :</td>
                    <td><input type="text"  name="Train Name" placeholder="Train Name"></td>
                </tr>
                 <tr>
                    <td>SOURCE :</td>
                    <td><input type="text"  name="Source" placeholder="From"></td>
                </tr>
                 <tr>
                    <td>DESTINATION :</td>
                    <td><input type="text"  name="Destination" placeholder="To"></td>
                </tr>
                 <tr>
                    <td>AVAILABLE ON :</td>
                 <tr>
                 <td><input type="checkbox" value="Mon">MON</td>
                      <td><input type="checkbox" value="Tues">TUES</td>
                        <td><input type="checkbox" value="Wed">WED</td>
                 </tr>  
                 <tr>
                      <td><input type="checkbox" value="Thurs">THURS</td>
                           <td><input type="checkbox" value="Fri">FRI</td>
                      <td><input type="checkbox" value="Sat">SAT</td>
                        
                 </tr>
                 <tr>
                     <td><input type="checkbox" value="Sun">SUN</td>
                 </tr>
                         
                </tr>
                
                 <tr>
                    <td>COACH TYPE :</td>
                    <tr>
                
                      <td><input type="checkbox" value="First Tier">First Tier Ac</td>
                        <td><input type="checkbox" value="Two Tier">Two Tier AC</td>
                        <td><input type="checkbox" value="Three Tier">Three Tier Ac</td>
                    </tr>  
                 <tr>
                      
                       <td><input type="checkbox" value="Sleeper">Sleeper</td>
                        <td><input type="checkbox" value="Chair Car">Chair Car</td>
                </tr>
                
                <tr>
                    <td colspan="2" style="text-align: center"><input type="submit"  value="Show Details" ></td>
                    
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input type="submit"  value="Reset" ></td>
                    
                </tr>
               
            </table>
        </div>
        </center>
    </body>
</html>
