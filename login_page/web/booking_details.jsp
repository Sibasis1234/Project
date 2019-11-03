<%-- 
    Document   : booking_details
    Created on : Sep 24, 2019, 8:01:42 PM
    Author     : Sibasis Devta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BOOKING_DETAILS</title>
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
    <center><h1><u>BOOKING DETAILS</u></h1></center>
    <center>    
    <div>
            <table>
                <tr>
                    <td>PNR NO.</td>
                    <td><input type="number"  name="PNR NO." placeholder="PNR NO."></td>
                </tr>
                <tr>
                    <td>TRAIN NO.</td>
                    <td><input type="number"  name="TRAIN NO." placeholder="TRAIN NO."></td>
                </tr>
                 <tr>
                    <td>DEPARTURE DATE</td>
                    <td><input type="date"  name="Departure Date" placeholder="DEPARTURE DATE"></td>
                </tr>
               
                 <tr>
                    <td>NO OF SEATS</td>
                    <td><input type="number"  name="NO OF SEATS." placeholder="No of seats"></td>
                </tr>
                 <tr>
                    <td>FROM</td>
                    <td><input type="text"  name="FROM" placeholder="Boarding Station"></td>
                </tr>
                 <tr>
                    <td>TO</td>
                    <td><input type="Text"  name="TO" placeholder="Destination Station"></td>
                </tr>
                 <tr>
                    <td>BOOKED BY:</td>
                    <td><input type="Text"  name="Name" placeholder="Name"></td>
                </tr>
                 <tr>
                    <td>Email_ID</td>
                    <td><input type="Email"  name="EMAIL_ID" placeholder="Email_ID"></td>
                </tr>
                 <tr>
                    <td>PHONE NO.</td>
                    <td><input type="number"  name="PHONE NO." placeholder="PHONE NO."></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input type="submit"  value="Submit" ></td>
                    
                </tr>
               
            </table>
        </div>
        </center>
</body>
</html>
