<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/WebEx02/param" method="post">
		
		<br>TEXT<input type="text" name="name">
		
		<br>RADIO
		<input type="radio" id="radio" name="radio" value="1">1
		<input type="radio" id="radio" name="radio" value="2">2
		
		<br>CHECKBOX
		<input type="checkbox" id="checkbox" name="checkbox" value="1">1
		<input type="checkbox" id="checkbox" name="checkbox" value="2">2
		
		<br>BUTTON
		<input type="button" id="button" name="button" value="버튼">
		
		<br>FILE
		<input type="file" id="file" name="file">
		
		<br>IMAGE
		<input type="image" id="image" name="image" value="Image">
		
		<br>HIDDEN
		<input type="hidden" id="hidden" value="Hidden!!" name="hidden">
		
		<br>RESET
		<input type="reset" id="reset" name="reset" value="초기화!!">
		
		<br>PASSWORD
		<input type="password" id="pwd" name="pwd" value="비번비번">
		
		<br>SUBMIT
		<input type="submit" id="submit" value="제출제출!!!!!!!!!!!!">
		
	</form>
</body>
</html>