<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<div class="container mt-4 text-center">
    <h2><%= request.getAttribute("message") %></h2>
    <a href="main" class="btn btn-primary mt-3">Back to Home</a>
</div>
</body>
</html>
