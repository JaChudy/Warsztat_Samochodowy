package pl.coderslab.Car;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

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
            response.sendRedirect("/success.html");
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("/oops.html");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addvehickle.jsp");
        dispatcher.forward(request,response);

    }
}
