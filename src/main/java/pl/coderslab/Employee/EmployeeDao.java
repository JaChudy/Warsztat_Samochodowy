package pl.coderslab.Employee;

import pl.coderslab.dao.service.DbService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {


    public static void delete(int employeeId) {
        String query = "DELETE FROM employee WHERE id =?";
        List<String> params = new ArrayList<>();
        params.add(String.valueOf(employeeId));

        try {
            DbService.executeQuery(query, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void save(Employee employee) throws Exception {

        String query = "Insert INTO employee VALUES (null, ?, ?, ?, ?)";
        List<String> params = new ArrayList<>();
        params.add(employee.getName());
        params.add(employee.getLastName());
        params.add(employee.getNote());
        params.add(Float.toString(employee.getWorkingHourCost()));
        DbService.insertIntoDatabase(query, params);

    }

    public static List<Employee> printAllEmployees() throws SQLException {
        String query = "SELECT * from employee";

        try (Connection conn = DbService.createConn()) {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            List<Employee> employees = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String lastName = rs.getString(3);
                String note = rs.getString(4);
                float workingHourCost = rs.getFloat(5);

                employees.add(new Employee(id, name, lastName, note, workingHourCost));
            }
            return employees;

        } catch (SQLException e) {
            throw e;
        }
    }

}
