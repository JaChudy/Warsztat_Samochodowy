package pl.coderslab.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/customersedit")
public class CustomerServletEdit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = null;
        try {
            customers = CustomerDao.printAllCustomers();
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("/oops.html");

        }
        request.setAttribute("customers", customers);
        getServletContext().getRequestDispatcher("/customersedit.jsp").forward(request,response);
    }
}
