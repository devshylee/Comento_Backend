<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html> 
<html lang="ko">
     <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
         <title>View Test Page</title> 
     </head> 
 <body> 
     <h2>설정 테스트 ${name}</h2> 
     <div>JSP 뿌리기</div> 
     <c:forEach var="item" items="${list}" varStatus="idx"> 
         ${idx.index} : ${item} <br /> 
     </c:forEach>
     
     
		<form action="/api/user-logins/monthly" method="get">
		    <label for="monthlyMonth">월별 조회 (YYYY-MM): </label>
		    <input type="text" id="monthlyMonth" name="month" required>
		    <button type="submit">조회</button>
		</form>
		
		
		<form action="/api/user-logins/daily" method="get">
		    <label for="dailyDate">일자별 조회 (YYYY-MM-DD): </label>
		    <input type="text" id="dailyDate" name="date" required>
		    <button type="submit">조회</button>
		</form>
		
		
		<form action="/api/user-logins/average" method="get">
		    <button type="submit">평균 조회</button>
		</form>
		
		
		<form action="/api/user-logins/excluding-holidays" method="get">
		    <label for="startDate">시작 날짜 (YYYY-MM-DD): </label>
		    <input type="text" id="startDate" name="startDate" required>
		    <label for="endDate">종료 날짜 (YYYY-MM-DD): </label>
		    <input type="text" id="endDate" name="endDate" required>
		    <button type="submit">조회</button>
		</form>
		
		
		<form action="/api/user-logins/department-monthly" method="get">
		    <label for="departmentMonthlyMonth">부서별 월별 조회 (YYYY-MM): </label>
		    <input type="text" id="departmentMonthlyMonth" name="month" required>
		    <button type="submit">조회</button>
		</form>
  </body> 
</html>