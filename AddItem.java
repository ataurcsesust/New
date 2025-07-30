package Project;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/AddItem")
public class AddItem extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        for (Item i : Item.ItemList) {
            if (i.getItemid() == id) {
                ShoppingCart.AddToCart(i);
                break;
            }
        }
        resp.sendRedirect("cart.jsp");
    }
}
