package SRP;

public class CalcSalary {
    private int baseSalary;
    private double ratio;

    public CalcSalary(int baseSalary, double ratio) {
    this.baseSalary = baseSalary;
    this.ratio = ratio;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * ratio);
        return baseSalary - tax;
    }
}
