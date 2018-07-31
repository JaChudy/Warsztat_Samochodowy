package pl.coderslab.Car;

import java.util.Date;

public class Car {

    private String model;
    private String brand;
    private Date dateOfProduction;
    private String registrationNumber;
    private Date nextTechnicalInspectionDate;

    public Car(String model, String brand, Date dateOfProduction, String registrationNumber, Date nextTechnicalInspectionDate) {
        this.model = model;
        this.brand = brand;
        this.dateOfProduction = dateOfProduction;
        this.registrationNumber = registrationNumber;
        this.nextTechnicalInspectionDate = nextTechnicalInspectionDate;
    }
    public Car(){

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


    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Date getNextTechnicalInspectionDate() {
        return nextTechnicalInspectionDate;
    }

    public void setNextTechnicalInspectionDate(Date nextTechnicalInspectionDate) {
        this.nextTechnicalInspectionDate = nextTechnicalInspectionDate;
    }
}

