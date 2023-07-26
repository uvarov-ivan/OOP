package SRP;

public class Controller {
    private Employee worker;
    private CalcSalary salary;

    public Controller(Employee worker, CalcSalary salary) {
        this.worker = worker;
        this.salary = salary;
    }

    public void paySalary(){
        System.out.println("Сотруднику " + worker.getEmpInfo() + " выплачена зарплата в размере " + salary.calculateNetSalary() + " рублей.");
    }



    
}
