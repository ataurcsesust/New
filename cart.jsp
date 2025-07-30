<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your Cart</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<div class="container mt-4">
    <h2>Your Shopping Cart</h2>
    <table class="table">
        <thead><tr><th>Name</th><th>Group</th><th>Price</th><th>Action</th></tr></thead>
        <tbody>
        <%
            for(Project.Item item : Project.ShoppingCart.getCartItems()) {
        %>
        <tr>
            <td><%= item.getItemName() %></td>
            <td><%= item.getItemGroup() %></td>
            <td><%= item.getItemPrice() %> BDT</td>
            <td><a href="RemoveItem?id=<%= item.getItemid() %>" class="btn btn-danger btn-sm">Remove</a></td>
        </tr>
        <% } %>
        </tbody>
    </table>
    <h4>Total: <%= Project.ShoppingCart.TotalPrice() %> BDT</h4>
    <a href="checkout.jsp" class="btn btn-success">Checkout</a>
    <a href="main" class="btn btn-primary">Continue Shopping</a>
</div>
</body>
</html>
