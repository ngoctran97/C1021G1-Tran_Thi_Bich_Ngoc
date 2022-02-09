package controler;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<Customer> customerList = new ArrayList<>();
    customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","https://deviet.vn/wp-content/uploads/2019/04/vuong-quoc-anh.jpg"));
    customerList.add(new Customer("Nguyễn Văn Nam","1983-08-22","Bắc Giang","https://duhocvietglobal.com/wp-content/uploads/2018/12/dat-nuoc-va-con-nguoi-anh-quoc.jpg"));
    customerList.add(new Customer("Nguyễn Thái Hoà","1983-08-23","Bắc Ninh","https://indochinapost.com/wp-content/uploads/dich-vu-giao-hang-nhanh-tu-anh-quoc-ve-viet-nam.jpg"));
    customerList.add(new Customer("Trần Đăng Khoa","1983-08-24","Hải Phòng","https://ejoy-english.com/blog/wp-content/uploads/2018/05/tie%CC%82%CC%81ng-anh-u%CC%81c-.jpg"));
        customerList.add(new Customer("Nguyễn Đình Thi","1983-08-25","Hà Tây","https://vuongquocanh.com/wp-content/uploads/2018/03/england-wal.jpg"));
    request.setAttribute("list",customerList);
    request.getRequestDispatcher("customer.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
