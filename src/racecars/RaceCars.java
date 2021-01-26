
package racecars;

public class RaceCars {

    public static void main(String[] args) {
        int[] cars = new int[8];
        int intermittentInterval = 100;
        boolean doRace = true;
        while (doRace) {
            for (int i = 0; i < cars.length; i++) {
                cars[i] += Math.random() * 10 + 1;
            }
            boolean printIntermittent = false;
            int intermittentLead = 0;
            int intermittentLeadDistance = 0;
            for (int i = 0; i < cars.length; i++) {
                if (cars[i] > intermittentLeadDistance) {
                    intermittentLead = i + 1;
                    intermittentLeadDistance = cars[i];
                }
                if (cars[i] >= intermittentInterval) {
                    printIntermittent = true;
                    intermittentInterval += 100;
                }
            }
            if (printIntermittent) {
                for (int i = 0; i < cars.length; i++) {
                    System.out.print(cars[i] + "\t");
                }
                System.out.println("");
                System.out.println("Race car no. " + intermittentLead + " is leading the race, at " + intermittentLeadDistance + "km covered.");
            }
            for (int i = 0; i < cars.length; i++) {
                if (cars[i] >= 1000) {
                    doRace = false;
                    System.out.println("We have a winner!");
                    break;
                }
            }
        }
        for (int i = 0; i < cars.length-1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i] < cars[j]) {
                    int temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        System.out.println("Final results: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
            
        }
    }
    
}
