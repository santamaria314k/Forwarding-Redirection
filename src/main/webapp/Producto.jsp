<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<html>
<head>
  <title>Ingresar producto</title>


  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet"href="css/PRODUCTO.css">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>

<header class="bg-white"><%@ include file="header.jsp"%></header>



<section>
  <form class="form"  action="registerelpro"method="post">


    <h1 class="text-dark"> Ingresar producto </h1>


    <label  for="name">Nombre del producto:</label><br>
    <input type="text" class="form-control " id="name" placeholder="Ingresa el Nombre del producto " required autofocus pattern="[A-Za-z ]{2,40}"><br>

    <label for="value">Valor del producto:</label><br>
    <input type="number" class="form-control " id="value" placeholder="Ingresa el Valor del producto: " required autofocus pattern="[1-9 ]{2,40}"><br>

    <label for="category">Categoria del producto:</label><br>
    <input type="text" class="form-control  " id="category" placeholder="Ingresa la Categoria del producto " required autofocus pattern="A-Za-z ]{2,40}}"><br>





    <input  class="btn btn-info w-50" type="submit" value="Registrar">
  </form>

</section>


<br><br>
<br><br>
<br><br>
<br><br>





<footer class="bg-info" ><%@ include file="footer.jsp"%></footer>



</body>
</html>
