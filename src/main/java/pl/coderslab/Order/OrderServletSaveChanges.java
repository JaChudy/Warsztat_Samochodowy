package pl.coderslab.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/OrdersSaveChanges")
public class OrderServletSaveChanges extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
//        if(acceptanceDate=="")
//        {
//            acceptanceDate = "0000-00-00";
//        }
//        if(estimateStartDate=="")
//        {
//            estimateStartDate = "0000-00-00";
//        }
//        if(startWorkDate=="")
//        {
//            startWorkDate = "0000-00-00";
//        }
        Order order = new Order(id,acceptanceDate,estimateStartDate,
                startWorkDate,problemDetails,repairDetails,
                status,totalCostForCustomer,totalCostOfThePartsUsed,workHoursCount);
        try {
            OrderDao.update(order);
            response.sendRedirect("/success.html");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("/index.html");
        }
    }


}
