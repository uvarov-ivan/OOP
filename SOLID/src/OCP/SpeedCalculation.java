package OCP;

public class SpeedCalculation <T extends Vehicle>{
    public double calculateAllowedSpeed(T vehicle) {
       
            return vehicle.getMaxSpeed() * vehicle.getRatio();
        
    }
}
