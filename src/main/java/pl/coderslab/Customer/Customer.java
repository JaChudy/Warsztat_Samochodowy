package pl.coderslab.Customer;

import java.util.Date;

public class Customer {
    private String name;
    private String lastName;
    private String dateOfBirth;
    private int id;
    //private int order_id;

    public Customer(String name, String lastName, String dateOfBirth, int id) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }

    public Customer() {
    }

    public Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Customer(String name, String lastName, String dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int getOrder_id() {
//        return order_id;
//    }
//
//    public void setOrder_id(int order_id) {
//        this.order_id = order_id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
