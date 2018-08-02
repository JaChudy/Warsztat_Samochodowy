package pl.coderslab.Car;

import pl.coderslab.Customer.Customer;
import pl.coderslab.dao.service.DbService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarDao {

    public static List<Car> printAllCars() throws SQLException {
        String querry ="SELECT * from car";

        try(Connection conn = DbService.createConn()){
            PreparedStatement st = conn.prepareStatement(querry);
            ResultSet rs = st.executeQuery();
            List<Car> cars = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String model = rs.getString(2);
                String brand = rs.getString(3);
                Date dateOfProduction = rs.getDate(4);
                String registrationNumber = rs.getString(5);
                Date nextTechnicalInspectionDate = rs.getDate(6);
                cars.add(new Car(id, model, brand, dateOfProduction, registrationNumber, nextTechnicalInspectionDate));
            }
            return cars;

        } catch (SQLException e) {
            throw e;
        }



    }
}
