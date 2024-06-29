<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
      
<style type="text/css">
    *{
       padding: 0;
       margin: 0;
    }
    body{
       display: flex;
       justify-content: center;
       align-items: center;
       height: 100vh;
    }
    form{
        
       
    }
</style>
</head>
<body>
    <form action="submit">
         <label>Student Name</label> <br>
         <input type="text" placeholder="Student" name="username"><br>
         <label>E-mail</label><br>
         <input type="email" placeholder="E-mail" name="email"><br>
         <label>Phone</label><br>
         <input type="tel" placeholder="Phone" name="phone"><br>
         <label>Degree</label><br>
         <input type="radio" id="bca" name="degree" value="BCA">
         <label for="bca">BCA</label>
         <input type="radio" id="bsc" name="degree" value="BSC">
         <label for="bsc">BSC</label>
         <input type="radio" id="ba" name="degree" value="B.A.">
         <label for="ba">B.A.</label>
         <input type="radio" id="btech" name="degree" value="B.Tech">
         <label for="btech">B.Tech</label><br>
         <label>Branch:</label><br>
         <input type="radio" id="cse" name="branch" value="CSE/IT">
         <label for="cse">CSE/IT</label>
         <input type="radio" id="ece" name="branch" value="ece">
         <label for="ece">ECE</label>
         <input type="radio" id="me" name="branch" value="ME">
         <label for="me">ME</label>
         <input type="radio" id="civil" name="branch" value="Civil">
         <label for="civil">Civil</label><br>
         <label>Gender:</label><br>
         <input type="radio" id="male" name="gender" value="Male">
         <label for="male">Male</label>
         <input type="radio" id="female" name="gender" value="Female">
         <label for="female">Female</label>
         <input type="radio" id="o" name="gender" value="Other">
         <label for="o">Other</label><br>
         <input type="submit" value="submit">
    </form>
</body>
</html>