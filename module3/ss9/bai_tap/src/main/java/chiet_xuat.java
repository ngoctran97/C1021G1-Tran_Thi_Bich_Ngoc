import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "chiet_xuat", value = "/display-discount")
public class chiet_xuat extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("productDescription");
        double List_Price = Double.parseDouble(request.getParameter("listPrice"));
        double Discount_Percent = Double.parseDouble(request.getParameter("discountPercent"));

        double Discount_Amount = List_Price * Discount_Percent * 0.01;
        double discountPrice = List_Price - Discount_Percent;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h1>Product Description: " + productDescription + "</h1>");
        writer.println("<h1>List Price: " + List_Price + "</h1>");
        writer.println("<h1>Discount Percent: " + Discount_Percent + "</h1>");
        writer.println("<h1>Discount Amount: " + Discount_Amount + "</h1>");
        writer.println("<h1>Discount Price: " + discountPrice + "</h1>");
        writer.println("</html>");

    }
}
