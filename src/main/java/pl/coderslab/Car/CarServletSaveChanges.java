package pl.coderslab.Car;

import pl.coderslab.dao.service.DbService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/CarSaveChanges")
public class CarServletSaveChanges extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String registrationNumber = request.getParameter("registrationNumber");
        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        String dateOfProduction= request.getParameter("dateOfProduction");
        String nextTechnicalInspectionDate= request.getParameter("nextTechnicalInspectionDate");

        Car car = new Car(model,brand,dateOfProduction,registrationNumber,nextTechnicalInspectionDate);
        try {
            CarDao.update(car);
            response.sendRedirect("/index.html");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
