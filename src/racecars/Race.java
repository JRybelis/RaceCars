package racecars;

public class Race {

    public static void main(String[] args) {
        RegularCar[] racers = {
            new SportsCar("Keisuke Takahashi", 260),
            new SportsCar("Ryosuke Takahashi", 240),
            new SportsCar("Takumi Fujiwara", 250),
            new SportsCar("Fukumen Racer", 280),
            new RegularCar("Aya Mifune", 160),
            new RegularCar("Daisuke Mifune", 180),
            new RegularCar("Kurio Mifune", 170),
            new SportsCar("Go Mifune", 270),
           };
        int checkpoint = 100;
        boolean doRace = true;
        
        while (doRace) {
            for (int i = 0; i < racers.length; i++) {
                if (racers[i] instanceof SportsCar) {
                    if (Math.random() < 0.5) {
                        ((SportsCar) racers[i]).spoilerRelease();
                    }
                }
                double stateChange = Math.random();
                if (stateChange < 0.3) {
                    racers[i].brake((int) (Math.random() * 5 + 1));
                } else if (stateChange < 0.8) {
                    racers[i].accelerate((int) (Math.random() * 10 + 1));
                }
                racers[i].drive();
            } 
            boolean printCheckpoint = false;
            int interimLead = 0;
            int interimLeadDistance = 0;
            for (int i = 0; i < racers.length; i++) {
                if (racers[i].getDistance() > interimLeadDistance) {
                    interimLead = i;
                    interimLeadDistance = racers[i].getDistance();
                }
                if (racers[i].getDistance() >= checkpoint){
                    printCheckpoint = true;
                    checkpoint += 100;
                }
            }
            if (printCheckpoint) {
                for (int i = 0; i < racers.length; i++) {
                    System.out.println(racers[i].getDistance() + "\t");
                }
                System.out.println("");
                System.out.println(racers[interimLead] + " is leading the race!");
                System.out.println("");
                System.out.println("");
            }
            for (int i = 0; i < racers.length; i++) {
                if (racers[i].getDistance() >= 1000) {
                    System.out.println("We have a winner!");
                    doRace = false;
                    break;
                }
            }
        }
        for (int i = 0; i < racers.length - 1; i++) {
            for (int j = i+1; j < racers.length; j++) {
                if (racers[i].getDistance() < racers[j].getDistance()) {
                    RegularCar temp = racers[i];
                    racers[i] = racers[j];
                    racers[j] = temp;
                }
            }
        }
        for (int i = 0; i < racers.length; i++) {
            System.out.println("Racer results: " + racers[i]);
        }
}
}
