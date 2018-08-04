package pl.coderslab.Order;

import pl.coderslab.Car.Car;
import pl.coderslab.Employee.Employee;

import java.util.Date;

public class Order{

    private int id;
    /*
    * Date when car arrive
    * */
    private String acceptanceDate;
    /*
    * Estimate date when car will be repaired
    * */
    private String estimateStartDate;
    /*
    * Start repair car date
    * */
    private String startWorkDate;
    /*
    * Assigned employee for repair
    * */
    private Employee employeeAssigned;
    private String problemDetails;
    private String repairDetails;
    private String status;
    private Car car ;
    private int carID;
    private float totalCostForCustomer;
    private float totalCostOfThePartsUsed;
    private float workingHourCost;
    private int workHoursCount;
    private int employeeID;
    private int customerId;
    private int carRegNumber;

    public int getCarRegNumber() {
        return carRegNumber;
    }

    public void setCarRegNumber(int carRegNumber) {
        this.carRegNumber = carRegNumber;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Order(int id, String acceptanceDate, String estimateStartDate, String startWorkDate, Employee employeeAssigned, String problemDetails, String repairDetails, String status, Car car, float totalCostForCustomer, float totalCostOfThePartsUsed, int workHoursCount) {
        this.id = id;
        this.acceptanceDate = acceptanceDate;
        this.estimateStartDate = estimateStartDate;
        this.startWorkDate = startWorkDate;
        this.employeeAssigned = employeeAssigned;
        this.problemDetails = problemDetails;
        this.repairDetails = repairDetails;
        this.status = status;
        this.car = car;
        this.totalCostForCustomer = totalCostForCustomer;
        this.totalCostOfThePartsUsed = totalCostOfThePartsUsed;
        this.workHoursCount = workHoursCount;
        workingHourCost = employeeAssigned.getWorkingHourCost();
    }

    public Order(int id, String acceptanceDate, String estimateStartDate, String startWorkDate, String problemDetails, String repairDetails, String status, float totalCostForCustomer, float totalCostOfThePartsUsed, int workHoursCount) {
        this.id = id;
        this.acceptanceDate = acceptanceDate;
        this.estimateStartDate = estimateStartDate;
        this.startWorkDate = startWorkDate;
        this.problemDetails = problemDetails;
        this.repairDetails = repairDetails;
        this.status = status;
        this.totalCostForCustomer = totalCostForCustomer;
        this.totalCostOfThePartsUsed = totalCostOfThePartsUsed;
        this.workHoursCount = workHoursCount;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public String getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(String acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public String getEstimateStartDate() {
        return estimateStartDate;
    }

    public void setEstimateStartDate(String estimateStartDate) {
        this.estimateStartDate = estimateStartDate;
    }

    public String getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(String startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    public Employee getEmployeeAssigned() {
        return employeeAssigned;
    }

    public void setEmployeeAssigned(Employee employeeAssigned) {
        this.employeeAssigned = employeeAssigned;
    }

    public String getProblemDetails() {
        return problemDetails;
    }

    public void setProblemDetails(String problemDetails) {
        this.problemDetails = problemDetails;
    }

    public String getRepairDetails() {
        return repairDetails;
    }

    public void setRepairDetails(String repairDetails) {
        this.repairDetails = repairDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public float getTotalCostForCustomer() {
        return totalCostForCustomer;
    }

    public void setTotalCostForCustomer(float totalCostForCustomer) {
        this.totalCostForCustomer = totalCostForCustomer;
    }

    public float getTotalCostOfThePartsUsed() {
        return totalCostOfThePartsUsed;
    }

    public void setTotalCostOfThePartsUsed(float totalCostOfThePartsUsed) {
        this.totalCostOfThePartsUsed = totalCostOfThePartsUsed;
    }

    public float getWorkingHourCost() {
        return workingHourCost;
    }

    public void setWorkingHourCost(float workingHourCost) {
        this.workingHourCost = workingHourCost;
    }

    public int getWorkHoursCount() {
        return workHoursCount;
    }

    public void setWorkHoursCount(int workHoursCount) {
        this.workHoursCount = workHoursCount;
    }
}
