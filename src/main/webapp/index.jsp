<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
    <form action="add" method="get">
        <label>Imię:</label><input type="text" id="name" name="name" />
        <label>Nazwisko:</label><input type="text" id="surname" name="surname" />
        <label>Pracodawca:</label><input type="text" id="employment" name="employment" />
        <label>Adres email:</label><input type="text" id="email" name="email" />
        <label>Potwierdź adres email:</label><input type="text" id="emailconfirm" name="emailconfirm" />
        <label>Skąd dowiedziałeś się o konferencji?</label><br />
        <label>Ogłoszenie w pracy</label><input type="radio" name="info" value="work" />
        <label>Ogłoszenie na uczelni</label><input type="radio" name="info" value="school" />
        <label>Facebook</label><input type="radio" type="radio" name="info" value="facebook" />
        <label>Znajomi</label><input type="radio" name="info" value="friends" />
        <input type="submit" id="submit" value="Wyślij" />
    </form>
</body>
</html>