package pl.coderslab.Employee;

public class Employee {
    private int id;
    private String name;
    private String lastName;
    private String note;
    private float workingHourCost;

    public Employee() {
    }

    public Employee(int id, String name, String lastName, String note, float workingHourCost) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.note = note;
        this.workingHourCost = workingHourCost;
    }

    public Employee(String name, String lastName, String note, float workingHourCost) {
        this.name = name;
        this.lastName = lastName;
        this.note = note;
        this.workingHourCost = workingHourCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public float getWorkingHourCost() {
        return workingHourCost;
    }

    public void setWorkingHourCost(float workingHourCost) {
        this.workingHourCost = workingHourCost;
    }
}
