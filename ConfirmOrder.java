package Project;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/ConfirmOrder")
public class ConfirmOrder extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String address = req.getParameter("address");
        String housenum = req.getParameter("housenum");
        String state = req.getParameter("state");
        String district = req.getParameter("district");
        String phoneno = req.getParameter("phoneno");
        String pincode = req.getParameter("pincode");

        CheckOut.Details(address, housenum, state, district, phoneno, pincode);

        // Clear cart after order confirmed
        ShoppingCart.ClearCart();

        req.setAttribute("message", "Order placed successfully! Thank you.");
        req.getRequestDispatcher("orderSuccess.jsp").forward(req, resp);
    }
}
