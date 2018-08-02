package pl.coderslab.Car;

import java.util.Date;

public class Car {
    private int id;
    private String model;
    private String brand;
    private String dateOfProduction;
    private String registrationNumber;
    private String nextTechnicalInspectionDate;

    public Car(int id, String model, String brand, String dateOfProduction, String registrationNumber, String nextTechnicalInspectionDate) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.dateOfProduction = dateOfProduction;
        this.registrationNumber = registrationNumber;
        this.nextTechnicalInspectionDate = nextTechnicalInspectionDate;
    }

    public Car(String brand, String model, String dateOfProduction, String registrationNumber, String nextTechnicalInspectionDate){
        this.brand = brand;
        this.model = model;
        this.dateOfProduction = dateOfProduction;
        this. registrationNumber = registrationNumber;
        this.nextTechnicalInspectionDate = nextTechnicalInspectionDate;

    }

    public Car(){

    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getNextTechnicalInspectionDate() {
        return nextTechnicalInspectionDate;
    }

    public void setNextTechnicalInspectionDate(String nextTechnicalInspectionDate) {
        this.nextTechnicalInspectionDate = nextTechnicalInspectionDate;
    }
}

