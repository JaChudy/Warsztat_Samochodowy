package pl.coderslab.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/editCustomer")
public class CustomerEditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameCustomer = request.getParameter("name");
        String lastNameCustomer = request.getParameter("lastName");

        try {
            Customer customer = CustomerDao.find(nameCustomer, lastNameCustomer);
            request.setAttribute("customer", customer);
            getServletContext().getRequestDispatcher("/editCustomer.jsp").forward(request,response);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
