package pl.coderslab.Employee;

import java.util.Date;

public class EmployeeService {

    public static void add(String name, String lastName,String address, String note, float workingHourCost) {
        Employee customer = new Employee(name, lastName, address, note, workingHourCost);
        try {
            EmployeeDao.save(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
