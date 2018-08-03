package pl.coderslab.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/addcustomer")
public class CustomerServletAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String date = request.getParameter("dateOfBirth");

        Customer customer = new Customer(name, lastName, date);

        try {
            CustomerDao.save(customer);
            response.sendRedirect("/success.html");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addcustomer.jsp");
        dispatcher.forward(request,response);
    }
}
