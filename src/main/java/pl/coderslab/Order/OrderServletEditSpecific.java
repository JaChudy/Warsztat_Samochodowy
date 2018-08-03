package pl.coderslab.Order;

import com.sun.org.apache.xpath.internal.operations.Or;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EditSpecificOrder")
public class OrderServletEditSpecific extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String acceptanceDate = request.getParameter("acceptanceDate");
        String estimateStartDate = request.getParameter("estimateStartDate");
        String startWorkDate = request.getParameter("startWorkDate");
        String problemDetails = request.getParameter("problemDetails");
        String repairDetails = request.getParameter("repairDetails");
        String status = request.getParameter("status");
        float totalCostForCustomer = Float.parseFloat(request.getParameter("totalCostForCustomer"));
        float totalCostOfThePartsUsed = Float.parseFloat(request.getParameter("totalCostOfThePartsUsed"));
        int workHoursCount = Integer.parseInt(request.getParameter("workHoursCount"));

        Order order = new Order(id,acceptanceDate,estimateStartDate,
                startWorkDate,problemDetails,repairDetails,
                status,totalCostForCustomer,totalCostOfThePartsUsed,workHoursCount);

        request.setAttribute("order", order);
        getServletContext().getRequestDispatcher("/editspecificorder.jsp").forward(request,response);

    }
}
