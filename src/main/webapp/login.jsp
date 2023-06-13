<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>

<!DOCTYPE>
<html>

<head>
<meta charset="utf-8">
<meta name="author"  content="Nombre Autor">
<meta name="description"content="En esta seccion aparace la informacion que pararece y acompaña los resultados de la busqueda">
<meta name="keywords"content="registro de usuario ,formulario de registro ,crear una cuenta ,registro en linea">
<meta name="viewport" content="width=device-width,initial-scalate=1">
    <title>LOGIN .:.MY_APP</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <link rel="stylesheet"href="css/LOGIN.css">

</head>

<body class="text-center">


<BUTTON><a href="INDEX">Index access LOGIN </a></BUTTON>
<BUTTON><a href="FORMULARIO">REGISTRO PERSONA</a></BUTTON>

    <form action="" method="post">

        <img class="mb-4" src="img/icon.png" alt="MY APP" width="100">


        <h4 >LOGIN</h4>







        <div class="form-floating">
            <div class="label"> <label  for="floatingInput">Usuario:</label></div><br>
            <input type="text" class="form-signin  bi bi-lock-fill" id="floatingInput" placeholder="nombre de usuario" required autofocus pattern="[A-Za-z0-9 ]{8,12}">
            <i class="bi bi-lock-fill"></i>
        </div>
        <br><br>
        <div class="form-floating">
            <div class="label">  <label  for="floatingPassword">Contrasena:</label></div><br>
            <input type="password" class="form-signin  "    id="floatingPassword" placeholder="ingrese su contrasena" required pattern="[A-Za-z0-9 ]{8,12 }">
            <i class="bi bi-key-fill"></i>
        </div>
        <br>
       <button class="btn btn-info "  type="submit" >Ingresar</button>

        <div id="register">
            <br>

        </div>
    </form>




</body>
</html>
