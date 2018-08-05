package pl.coderslab.Order;

import pl.coderslab.Employee.Employee;
import pl.coderslab.Employee.EmployeeDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/addorder")
public class OrderServletAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Order order = new Order();
        order.setAcceptanceDate(String.valueOf(request.getParameter("acceptanceDate")));
        order.setEstimateStartDate(String.valueOf(request.getParameter("estimateStartDate")));
        order.setProblemDetails(String.valueOf(request.getParameter("problemDetails")));
//        order.setRepairDetails(request.getParameter("repaidDetails"));
//        order.setStatus(request.getParameter("status"));
//        order.setTotalCostForCustomer(Float.parseFloat(request.getParameter("totalCostCustomers")));
//        order.setTotalCostOfThePartsUsed(Float.parseFloat(request.getParameter("totalCostParts")));
//        order.setWorkHoursCount(Integer.parseInt(request.getParameter("totalWorkHours")));
        order.setCustomerId(Integer.parseInt(request.getParameter("customerId")));
        order.setEmployeeID(Integer.parseInt(request.getParameter("employeeId")));
        order.setCarRegNumber(Integer.parseInt(request.getParameter("carReg")));

        try {
            OrderDao.save(order);
            response.sendRedirect("/success.html");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("/oops.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addorder.jsp");
        dispatcher.forward(request,response);
    }
}
