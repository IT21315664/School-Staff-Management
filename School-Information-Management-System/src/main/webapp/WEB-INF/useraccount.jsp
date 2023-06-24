<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SkyLine High School</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {font-family: "Lato", sans-serif}

.mySlides {display: none}


table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #599bd9;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #8cd2f0;
}
</style>
</head>
<body>

<!-- Navbar -->
  <div class="w3-bar w3-black w3-card">
    <a class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right" href="javascript:void(0)" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
    <a href="index.jsp" class="w3-bar-item w3-button w3-padding-large">Home</a>
    <a href="#band" class="w3-bar-item w3-button w3-padding-large w3-hide-small">Add Students</a>
    <a href="user-form.jsp" class="w3-bar-item w3-button w3-padding-large w3-hide-small">Add Accountant</a>
    <a href="#contact" class="w3-bar-item w3-button w3-padding-large w3-hide-small">Add Teachers</a>
    <a href="payment-form" class="w3-bar-item w3-button w3-padding-large w3-hide-small">Add Students' Payments</a>
    <a href="" class="w3-bar-item w3-button w3-padding-large w3-hide-small">Add Subjects</a>
    <a href="#contact" class="w3-bar-item w3-button w3-padding-large w3-hide-small">Add Teachers</a>
    <div class="w3-dropdown-hover w3-hide-small">
      <button class="w3-padding-large w3-button" title="More">More<i class="fa fa-caret-down"></i></button>     
    

<div class="w3-dropdown-content w3-bar-block w3-card-4">
        <a href="#" class="w3-bar-item w3-button">Study materials</a>
        <a href="#" class="w3-bar-item w3-button">Timetable</a>
        <a href="#" class="w3-bar-item w3-button">Events</a>
      </div>
    </div>
    <a href="javascript:void(0)" class="w3-padding-large w3-hover-red w3-hide-small w3-right"><i class="fa fa-search"></i></a>
</div>



 <h2>My Account Details</h2>
 
 <table>
    
  <c:forEach var="adm" items="${admDetails}">
   <tr>
   <td>User ID</td>
    <td>${adm.id}</td>
    </tr>
    
    <tr>
    <td>Admin Name</td>
     <td>${adm.name}</td>
      </tr>
      
     <tr>
     <td>Admin Email</td>
     <td>${adm.email} </td>
     </tr>
     
     <tr>
     <td>Admin User Name</td>
     <td>${adm.username}</td>
     
     </tr>
     
     <tr>
     <td>Admin User Password</td>
     <td> ${adm.password}</td>
      </tr>
    </c:forEach>

 </table>

</body>
</html>