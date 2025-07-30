<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Checkout</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<div class="container mt-4">
    <h2>Checkout</h2>
    <form action="ConfirmOrder" method="post">
        <div class="mb-3">
            <label>Address:</label>
            <input type="text" name="address" class="form-control" required />
        </div>
        <div class="mb-3">
            <label>House Number:</label>
            <input type="text" name="housenum" class="form-control" required />
        </div>
        <div class="mb-3">
            <label>State:</label>
            <input type="text" name="state" class="form-control" required />
        </div>
        <div class="mb-3">
            <label>District:</label>
            <input type="text" name="district" class="form-control" required />
        </div>
        <div class="mb-3">
            <label>Phone No:</label>
            <input type="text" name="phoneno" class="form-control" required />
        </div>
        <div class="mb-3">
            <label>Pincode:</label>
            <input type="text" name="pincode" class="form-control" required />
        </div>
        <button type="submit" class="btn btn-success">Confirm Order</button>
    </form>
</div>
</body>
</html>
