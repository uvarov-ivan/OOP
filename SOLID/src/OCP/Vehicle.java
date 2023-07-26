package OCP;

public abstract class Vehicle {
    int maxSpeed;
    double ratio;
    String type;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.ratio = ratio;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType(){
        return type;
    }
    
    public double getRatio(){
        return ratio;
    }
}
