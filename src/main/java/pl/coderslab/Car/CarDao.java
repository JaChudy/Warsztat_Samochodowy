package pl.coderslab.Car;

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
                String dateOfProduction = rs.getString(4);
                String registrationNumber = rs.getString(5);
                String nextTechnicalInspectionDate = rs.getString(6);
                cars.add(new Car(id, model, brand, dateOfProduction, registrationNumber, nextTechnicalInspectionDate));
            }
            return cars;

        } catch (SQLException e) {
            throw e;
        }
    }

    public static void insert(Car car) throws SQLException {
        String querry = "Insert INTO car VALUES (null, ?, ?, ?, ?, ?)";
        List<String> params = new ArrayList<>();
        params.add(car.getModel());
        params.add(car.getBrand());
        params.add(car.getDateOfProduction());
        params.add(car.getRegistrationNumber());
        params.add(car.getNextTechnicalInspectionDate());

        DbService.insertIntoDatabase(querry,params);

    }
    public static void deleteCar (int carId) {
        String query = "DELETE FROM car where id=?";
        List<String> params = new ArrayList<>();
        params.add(String.valueOf(carId));
        try {
            DbService.executeQuery(query, params);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
