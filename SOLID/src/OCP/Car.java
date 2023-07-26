package OCP;

public class Car extends Vehicle{

    public Car(int maxSpeed) {
        super(maxSpeed);        
        super.ratio = 0.8;
        super.type = "Car";
    }

}
