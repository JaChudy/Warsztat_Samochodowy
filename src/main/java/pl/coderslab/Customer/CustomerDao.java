package pl.coderslab.Customer;

import pl.coderslab.dao.service.DbService;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDao {

    public static void delete (int customerId){
        String querry = "DELETE FROM customer WHERE id =?";
        List<String> params = new ArrayList<>();
        params.add(String.valueOf(customerId));

        try {
            DbService.executeQuery(querry, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public static void save(Customer customer) throws Exception{

        String querry = "Insert INTO customer VALUES (null, ?, ?, ?)";
        List<String> params = new ArrayList<>();
        params.add(customer.getName());
        params.add(customer.getLastName());
        if(customer.getDateOfBirth()!=null){

            params.add(customer.getDateOfBirth());
        } else {
            params.add(null);
        }
        DbService.insertIntoDatabase(querry,params);

    }

    public static List<Customer> printAllCustomers() throws SQLException{
        String querry ="SELECT * from customer";

        try(Connection conn = DbService.createConn()){
            PreparedStatement st = conn.prepareStatement(querry);
            ResultSet rs = st.executeQuery();
            List<Customer> customers = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String lastName = rs.getString(3);
                String birthday = rs.getString(4);
                customers.add(new Customer(name, lastName, birthday, id));
            }
            return customers;

        } catch (SQLException e) {
            throw e;
        }



    }
}
