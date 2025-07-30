<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Online Shopping System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<div class="container mt-4">
    <h2>Available Products</h2>
    <div class="row">
        <%
            java.util.List<Project.Item> items = (java.util.List<Project.Item>) request.getAttribute("items");
            for(Project.Item item : items) {
        %>
        <div class="col-md-4">
            <div class="card mb-4 shadow-sm">
                <div class="card-body">
                    <h5 class="card-title"><%= item.getItemName() %></h5>
                    <p class="card-text">Group: <%= item.getItemGroup() %></p>
                    <p class="card-text">Price: <%= item.getItemPrice() %> BDT</p>
                    <form action="AddItem" method="post">
                        <input type="hidden" name="id" value="<%= item.getItemid() %>" />
                        <button class="btn btn-primary" type="submit">Add to Cart</button>
                    </form>
                </div>
            </div>
        </div>
        <% } %>
    </div>
</div>
</body>
</html>
