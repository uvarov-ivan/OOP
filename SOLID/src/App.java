import DIP.DieselEngine;
import DIP.EngineCar;
import DIP.PetrolEngine;
import ISP.Circle;
import ISP.Cube;
import OCP.Bus;
import OCP.Car;
import OCP.SpeedCalculation;
import SRP.CalcSalary;
import SRP.Controller;
import SRP.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Employee worker1 = new Employee("Перович", "14.11.85", 10000);
        CalcSalary salary = new CalcSalary(worker1.getBaseSalary(), 0.25);
        Controller control = new Controller(worker1, salary);

        control.paySalary();

        Car car1 = new Car(220);
        Bus bus1 = new Bus(160);

        SpeedCalculation<Car> carSpeed = new SpeedCalculation<Car>();
        SpeedCalculation<Bus> busSpeed = new SpeedCalculation<Bus>();

        System.out.println("Допустимая скорость = " + carSpeed.calculateAllowedSpeed(car1));
        System.out.println("Допустимая скорость = " + busSpeed.calculateAllowedSpeed(bus1));

        Circle circle = new Circle(10);
        Cube cube = new Cube(10);
        System.out.println("Площадь круга с радиусом " + circle.getRadius() + " равен " + circle.area());
        System.out.println("Площадь куба с длинами сторон " + cube.getEdge() + " равен " + cube.area() + ", а объём " + cube.volume());

        DieselEngine disEngine = new DieselEngine();
        PetrolEngine petrEngine = new PetrolEngine();
        EngineCar disCar = new EngineCar(disEngine);
        EngineCar petrCar = new EngineCar(petrEngine);
        disCar.start();
        petrCar.start();
    }
}
