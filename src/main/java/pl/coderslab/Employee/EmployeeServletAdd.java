
package pl.coderslab.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addemployee")
public class EmployeeServletAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String note = request.getParameter("note");
        float workingHour = Float.parseFloat(request.getParameter("workingHourCost"));

        Employee employee = new Employee(name,lastName,note,workingHour);

        try {
            EmployeeDao.save(employee);
            response.sendRedirect("/success.html");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("/oops.html");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addemployee.jsp");
        dispatcher.forward(request,response);

    }
}
