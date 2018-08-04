package pl.coderslab.Employee;

import pl.coderslab.Customer.CustomerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EmployeeServletDel")
public class EmployeeServletDel extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("id"));

        try {
            EmployeeDao.delete(customerId);
            response.sendRedirect("/employeemanagment.html");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("/oops.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
