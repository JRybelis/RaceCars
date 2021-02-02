package racecars;

public class RegularCar {

    private String name;
    private int maxSpeed;
    private int distance;
    private int speed;
    
    public RegularCar(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.distance = 0;
        this.speed = 0;
    }
    
    public int getDistance(){
        return distance;
    }
    public void accelerate (int howMuch) {
        this.speed += howMuch;
        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
     }
    public void brake (int howMuch) {
        this.speed -= howMuch;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
    public void drive() {
        this.distance += this.speed;
    }
    
    public String toString() {
        return "RaceCar{" + "name = " + name + ", maxSpeed = " + maxSpeed +
                ", distance = " + distance + ", speed = " + speed + '}';
    }
}

