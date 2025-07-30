package Project;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/main")
public class MainMenuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Item> items = Item.ItemList; // use static list with initial items
        req.setAttribute("items", items);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
