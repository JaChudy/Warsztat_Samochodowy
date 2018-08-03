package pl.coderslab.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EditSpecificCar")
public class CarServletEditSpecific extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String registrationNumber = request.getParameter("registrationNumber");
        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        String dateOfProduction = request.getParameter("dateOfProduction");
        String nextTechnicalInspectionDate = request.getParameter("nextTechnicalInspectionDate");

        Car car = new Car(model,brand,dateOfProduction,registrationNumber,nextTechnicalInspectionDate);
        request.setAttribute("car", car);
        getServletContext().getRequestDispatcher("/editspecificcar.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
