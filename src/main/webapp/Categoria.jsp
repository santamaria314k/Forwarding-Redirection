<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<html>
<head>
    <title> Ingresar Categoria</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet"href="css/CATEGORIA.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>



<%@ include file="header.jsp"%>
<header class="bg-white">
</header>



<section>
    <form class="form"  action="registercate"method="post">


        <h1 class="text-dark"> Categoria con BD </h1>

        <label  for="ID">ID categoria:</label><br>
        <input type="number" class="form-control " id="ID" placeholder="Ingresa el ID de la categoria: " required autofocus pattern="[0-9 ]{5}"><br>
        <label  for="name">Nombre categoria:</label><br>
        <input type="text" class="form-control " id="name" placeholder="Ingresa el nombre de la categoria: " required autofocus pattern="[A-Za-z ]{2,40}"><br>




        <input  class="btn btn-info w-50" type="submit" value="Registrar">
    </form>

</section>

<BR><BR>
<BR><BR>

<footer class="bg-info" ><%@ include file="footer.jsp"%></footer>

</body>
</html>
