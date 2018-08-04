package pl.coderslab.Order;

import com.sun.org.apache.xpath.internal.operations.Or;
import pl.coderslab.dao.service.DbService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {

    public static void save(Order order) throws Exception {
        /*
        * IMPORTANT don't change mydb.order or `order` to order
        * */
        String query = "Insert INTO mydb.order (`acceptance_date`,`estimate_start_date`,`problem_details`,`customerid`, `employeeid`, `car_registration_number`) VALUES (? , ?, ?, ?, ?, ?)";
        List<String> params = new ArrayList<>();
        params.add(order.getAcceptanceDate());
        params.add(order.getEstimateStartDate());
        params.add(order.getProblemDetails());
        params.add(String.valueOf(order.getCustomerId()));
        params.add(String.valueOf(order.getEmployeeID()));
        params.add(String.valueOf(order.getCarRegNumber()));
        DbService.insertIntoDatabase(query, params);

    }

    public static List<Order> printAllOrders() throws SQLException {
        String query = "SELECT * from mydb.order";

        try (Connection conn = DbService.createConn()) {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            List<Order> orders = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String acceptanceDate = rs.getString(2);
                String estimateStartDate = rs.getString(3);
                String startWorkDate = rs.getString(4);
                String problemDetails = rs.getString(5);
                String repairDetails = rs.getString(6);
                String status = rs.getString(7);
                float totalCostForCustomer = rs.getFloat(8);
                float totalCostOfThePartsUsed = rs.getFloat(9);
                int workHoursCount = rs.getInt(10);

                orders.add(new Order(id, acceptanceDate, estimateStartDate, startWorkDate, problemDetails, repairDetails, status, totalCostForCustomer, totalCostOfThePartsUsed, workHoursCount));
            }
            return orders;

        } catch (SQLException e) {
            throw e;
        }
    }
    /*
    * TODO Check it
    * */
    public static void delete(int orderId) {
        String query = "DELETE FROM mydb.order WHERE id =?";
        List<String> params = new ArrayList<>();
        params.add(String.valueOf(orderId));

        try {
            DbService.executeQuery(query, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Order order) throws Exception {

        String query = "Update `order` set " +
                "acceptance_date=?," +
                "estimate_start_date=?," +
                "start_work_date=?," +
                "problem_details=?," +
                "repair_details=?," +
                "status=?," +
                "total_cost_for_customers=?," +
                "total_cost_of_the_parts_used=?," +
                "work_hours_count=?" +
                "where id=?";
        List<String> params = new ArrayList<>();
        params.add(order.getAcceptanceDate());
        params.add(order.getEstimateStartDate());
        params.add(order.getStartWorkDate());
        params.add(order.getProblemDetails());
        params.add(order.getRepairDetails());
        params.add(order.getStatus());
        params.add(String.valueOf(order.getTotalCostForCustomer()));
        params.add(String.valueOf(order.getTotalCostOfThePartsUsed()));
        params.add(String.valueOf(order.getWorkHoursCount()));
        params.add(String.valueOf(order.getId()));

        DbService.executeQuery(query, params);

    }


}
