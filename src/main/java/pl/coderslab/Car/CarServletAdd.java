package pl.coderslab.Car;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addvehickle")
public class CarServletAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        String dateOfProduction = request.getParameter("dateOfProduction");
        String registrationNumber = request.getParameter("registrationNumber");
        String nextTechnicalInspectionDate = request.getParameter("nextTechnicalInspectionDate");

        Car car = new Car(brand, model, dateOfProduction, registrationNumber, nextTechnicalInspectionDate);

        try{
            CarDao.insert(car);
        } catch (Exception e){
            e.printStackTrace();
        }
        response.sendRedirect("/addvehickle.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addvehickle.jsp");
        dispatcher.forward(request,response);

    }
}
