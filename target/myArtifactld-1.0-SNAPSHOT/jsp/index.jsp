<%--
  Created by IntelliJ IDEA.
  User: iikhsn
  Date: 07.10.16
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
  <head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/style.css" type="text/css">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Oswald:400,300" type="text/css">
    <title>Work!Time</title>
  </head>
  <body>
  <div id="firstDiv">
      <div class="autorizName">
        <p id="systemName">Work!Time</p>
        <p id="title">Авторизация</p>

      </div>
      <div class="autorizName">
        <form name="login" action="/RegistrationServlet" method="POST">
          <input type="text" name="login" placeholder="Имя пользователя">
          <br>
          <input type="password" name="password" placeholder="Пароль">
          <br>
          <button id="submit" type="submit">Войти</button>
          <p></p>
        </form>
      </div>
    <p id="warning">Учетная запись создается в течении 2 рабочих дней.<br>
      Если вы не можете войти в аккаунт обратитесь к администратору.</p>
  </div>
  <footer>
    <p>Служба поддержки: E-mail: support@localhost тел. 8-800-555-35-35</p>
  </footer>
  </body>
</html>
