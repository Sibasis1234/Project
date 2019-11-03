<%-- 
    Document   : Route_info
    Created on : Sep 24, 2019, 9:17:14 PM
    Author     : Sibasis Devta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Route_Info</title>
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
      
    <center><h1><u>ROUTE INFORMATION</u></h1></center>
    <center>    
    <div>
            <table>
                <tr>
                    <td>Arrival Station</td>
                    <td><input type="text"  name="Arrival station" placeholder="From"></td>
                </tr>
                <tr>
                    <td>Departure Station</td>
                    <td><input type="text"  name="Departure Station" placeholder="To"></td>
                </tr>
                 <tr>
                    <td>Total Distance(Km)</td>
                    <td><input type="number"  name="Distance" placeholder="Distance"></td>
                </tr>
                 <tr>
                    <td>No of Studets</td>
                    <td><input type="number"  name="No of Students" placeholder="Total Students"></td>
                </tr>
                 <tr>
                    <td>SL NO</td>
                    <td><input type="number"  name="SL NO" placeholder="SL NO"></td>
                </tr>
                 <tr>
                    <td>Distance from Source</td>
                    <td><input type="number"  name="Distance froom Source" placeholder="Distance"></td>
                </tr>
                 <tr>
                     <td> Station Name</td>
                    <td><input type="text"  name="Station Name" placeholder="Station"></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input type="submit"  value="Add New Route" ></td>
                    
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input type="submit"  value="Save Current Route" ></td>
                    
                </tr>
               
            </table>
        </div>
        </center>
</body>
</html>
