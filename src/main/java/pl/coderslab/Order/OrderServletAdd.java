package pl.coderslab.Order;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addorder")
public class OrderServletAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Order order = new Order();
        order.setAcceptanceDate(String.valueOf(request.getParameter("acceptanceDate")));
        order.setEstimateStartDate(String.valueOf(request.getParameter("estimateStartDate")));
        order.setProblemDetails(String.valueOf(request.getParameter("problemDetails")));
        try {
            OrderDao.save(order);
            response.sendRedirect("/success.html");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("/index.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addorder.jsp");
        dispatcher.forward(request,response);
    }
}
