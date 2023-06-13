<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>footer</title>
    <link rel="stylesheet" href="css/FOOTER.css">

</head>
<body>
<footer >

    <h1 class="mt-3 mb-3 text-muted"><%=displayDate()%> -----------------todos los derechos reservados MY APP CON BD -----------------<%=displayDate()%>       </h1>

    <%!
        public String displayDate() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
            Date date = Calendar.getInstance().getTime();
            return dateFormat.format(date);
        }
    %>
    <h1>hello world  !  :)</h1>
    <br><br><br><br><br><br><br><br><br><br><br><br>
</footer>
</body>
</html>