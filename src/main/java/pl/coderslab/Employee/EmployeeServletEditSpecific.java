package pl.coderslab.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EditSpecificEmployee")
public class EmployeeServletEditSpecific extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String note = request.getParameter("note");
        float workingHourCost = Float.parseFloat(request.getParameter("workingHourCost"));

        Employee employee = new Employee(id, name, lastName, note, workingHourCost);

        request.setAttribute("employee", employee);
        getServletContext().getRequestDispatcher("/editspecificemployee.jsp").forward(request,response);
    }
}
