
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
            }
        }
    }
    
}
