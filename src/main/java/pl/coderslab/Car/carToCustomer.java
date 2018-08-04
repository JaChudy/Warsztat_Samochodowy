package pl.coderslab.Car;

import pl.coderslab.Customer.Customer;
import pl.coderslab.Customer.CustomerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/carToCustomer")
public class carToCustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String registrationNumber = request.getParameter("registrationNumber");

        request.setAttribute("registrationNumber", registrationNumber);
        getServletContext().getRequestDispatcher("/addCarToUser.jsp").forward(request,response);

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
        getServletContext().getRequestDispatcher("/carToUser.jsp").forward(request,response);

    }
}
