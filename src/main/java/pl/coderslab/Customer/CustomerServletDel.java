package pl.coderslab.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delCustomer")
public class CustomerServletDel extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("id"));

        try {
            CustomerDao.delete(customerId);
            response.sendRedirect("/success.html");

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("/oops.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
