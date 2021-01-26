
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
    public void hitAccelerator(int howMuch) {
        if(!this.spoiler) {
            super.hitAccelerator(howMuch * 2);
        } else {
            super.hitAccelerator(howMuch);
        }
    }
    public void hitBreaks(int howMuch) {
        if (this.spoiler) {
            super.hitBreaks(howMuch * 2); 
        } else {
            super.hitBreaks(howMuch);
        }
    }
    public String toString() {
        return "Sports car " + super.toString();
    }
}