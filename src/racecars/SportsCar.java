
package racecars;

public class SportsCar {
    
}

//        int[] cars = new int[8];
//        int goMifune = cars[0];
//        int kurioMifune = cars[1];
//        int daisukeMifune = cars[2];
//        int ayaMifune = cars[3];
//        int fukumenRacer = cars[4];
//        int takumiFujiwara = cars[5];
//        int ryosukeTakahashi = cars[6];
//        int keisukeTakahashi = cars[7];
//
//        int[] carLineup = new int [10];
//        int checkpointCount = 10;
//        int checkpoint = 100;
//        int finishLine = 1000;
//        int[][] raceStats = new int[carLineup.length][cars.length];
//        int burst = (int) (Math.random() * 10 + 1); // kiekvieno ciklo metu
//
//        for (int i = 0; i < checkpointCount; i++) {
//            for (int j = 0; j <= checkpoint; j++) {
//                for (int r = 0; r < cars.length; r++) {
//                    cars[r] += burst;
//                    if (cars[r] >= checkpoint) {
//                        continue;
////                        break;
//                    }
//                    System.out.print(cars[r] + " ");
//                    System.out.println("");
//                }
//            }
//
//        }
//
//        for (int i = 0; i < raceStats.length; i++) {
//            carLineup = raceStats[i];
//            for (int j = 0; j < cars.length; j++) {
//                int racer = carLineup[j];
//                System.out.println(racer + "; ");
//            }
//        }