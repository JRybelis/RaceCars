
package racecars;

public class SportsCar extends RegularCar {
    private boolean spoiler;
    
    public SportsCar(String name, int maxSpeed) {
        super(name, maxSpeed);
        this.spoiler = false;
    }
    
    public void spoilerRelease() {
        this.spoiler = !this.spoiler;
    }
    public void accelerate(int howMuch) {
        if(!this.spoiler) {
            super.accelerate(howMuch * 2);
        } else {
            super.accelerate(howMuch);
        }
    }
    public void brake(int howMuch) {
        if (this.spoiler) {
            super.brake(howMuch * 2); 
        } else {
            super.brake(howMuch);
        }
    }
    public String toString() {
        return "Sports car " + super.toString();
    }
}