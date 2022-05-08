<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
<style>
h3{
font-family:sherif;
color:slateblue;
text-align:center;
text-decoration:underline
}
table{
font-family:sherif;
font-size:20px;
color:white;
width:700px;
background-color:slateblue;
border:5px solid lightgreen;
}
</style>
</head>
<body>
 <div  align="center">
<h3> STUDENT REGISTRATION FORM </h3>
<form action="<%= request.getContextPath() %>/Student1Servlet" method="post">
<table>
<tr>
<td> First Name: </td>
<td><input type="text" name="firstName" required></td>
</tr>
<tr>
<td> Last Name: </td>
<td> <input type="text" name="lastName" required> </td> 
</tr>
<tr>
<td> Father Name: </td>
<td> <input type="text" name="fatherName" required> </td> 
</tr>
<tr>
<td> Mother Name: </td>
<td> <input type="text" name="motherName" required> </td> 
</tr>
<tr>
<td> Email: </td>
<td> <input type="text" name="email" required> </td> 
</tr>
<tr>
<td> Date Of Birth: </td>
<td> <input type="date" name="dob" required> </td> 
</tr>
<tr>
<td> Mobile: </td>
<td> <input type="text" name="mob" > </td> 
</tr>
<tr>
<td> Gender: </td>
<td> <select name="gender" >
     <option value="select"> select </option>
	 <option value="male"> Male</option>
	 <option value="female"> Female</option>
	 </select>
 </td> 
</tr>
<tr>
<td> Country </td>
<td> <input type="text" name="country"> </td> 
</tr>
<tr>
<td align="center" colspan="2">
     <input type="submit" value="Submit">
     <input type="reset" value="Reset">
</td>
</tr>

</table>
</form>
</div>

</body>
</html>