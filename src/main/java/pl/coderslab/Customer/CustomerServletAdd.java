package pl.coderslab.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/addcustomer")
public class CustomerServletAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String date = request.getParameter("dateOfBirth");

//        Date birthday = null;
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        try{
//            birthday = sdf.parse(date);
//        } catch (ParseException ignore){
//
//        }

        Customer customer = new Customer(name, lastName, date);

        try {
            CustomerDao.save(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //CustomerServise.add(name, lastName, birthday);

        response.sendRedirect("/addcustomer.jsp");

    }





    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addcustomer.jsp");
        dispatcher.forward(request,response);
    }
}
