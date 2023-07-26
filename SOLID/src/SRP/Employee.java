package SRP;

public class Employee {

    private String name;
    private String dob;
    private int baseSalary;

    public Employee(String name, String dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    

}
