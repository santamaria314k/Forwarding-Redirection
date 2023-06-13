<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>


<!DOCTYPE html>
<html>
<head>
    <title> Formulario con BD</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet"href="css/FORMULARIO.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>

<%@ include file="header.jsp"%>




<section>
    <form class="form" action="registeruser" method="post">


        <h1 class="text-dark"> "Formulario con BD " </h1>

        <label  for="name">Nombres:</label><br>
        <input type="text" name="user_firstname" class="form-control " id="name" placeholder="Ingresa tus Nombres: " required autofocus pattern="[A-Za-z ]{2,40}"><br>

        <label for="surnames">Apellidos:</label><br>
        <input type="text" name="user_lastname" class="form-control " id="surnames" placeholder="Ingresa tus Apellidos: " required autofocus pattern="[A-Za-z ]{2,40}"><br>

        <label for="email">Correo:</label><br>
        <input type="text" name="user_email" class="form-control  " id="email" placeholder="Ingresa tu Correo: " required autofocus pattern="{80}"><br>



        <label for="password">Contrasena:</label><br>
        <input type="password" name="user_password" class="form-control " id="password" placeholder="Ingresa tu contrasena:" required autofocus pattern="{50}"><br><br>



        <input  class="btn btn-info w-50" type="submit" value="Registrar">
    </form>

</section>

<%@ include file="footer.jsp"%>
</body>
</html>