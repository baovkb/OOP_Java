package OOP_Excercise.Babylon;

import java.util.Scanner;

public class Babylon {
    public static void main(String[] args) {
        int numPedion, numZattacker, numCarrier;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Pedion: ");
        numPedion = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number of Zattacker: ");
        numZattacker = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number of Carrier: ");
        numCarrier = Integer.parseInt(scanner.nextLine());

        int totalRobots = numPedion+numZattacker+numCarrier;
        Robot[] robots = new Robot[totalRobots];

        int rand, i;
        for (i = 0; i < numPedion; ++i) {
            rand = getRandomNumber(1, 5);
            robots[i] = new Pedion(rand);
        }

        for (; i < numPedion+numZattacker; ++i) {
            rand = getRandomNumber(20, 30);
            robots[i] = new Zattacker(rand);
        }

        for (; i < totalRobots; ++i) {
            rand = getRandomNumber(50, 100);
            robots[i] = new Carrier(rand);
        }

        //print info of robots
        for (i = 0; i < totalRobots; ++i) {
            System.out.println(
                robots[i].getClass().getSimpleName() 
                + " "
                + robots[i].getInfo()
                + " Energy-used=" + robots[i].useEnergy(10)
            );
        }

        //calc sum of energy that a specific type of robot using
        double totalEnergyPedion = 0;
        for (i = 0; i < numPedion; ++i) {
            totalEnergyPedion += robots[i].useEnergy(10);
        }

        double totalEnergyZattacker = 0;
        for (; i < numPedion+numZattacker; ++i) {
            totalEnergyZattacker += robots[i].useEnergy(10);
        }

        double totalEnergyCarrier = 0;
        for (; i < totalRobots; ++i) {
            totalEnergyCarrier += robots[i].useEnergy(10);
        }

        String nameRobotMostEng;
        double valueRobotMostEng;
        if (totalEnergyPedion > totalEnergyZattacker && totalEnergyPedion > totalEnergyCarrier) {
            nameRobotMostEng = "Pedion";
            valueRobotMostEng = totalEnergyPedion;
        } else if (totalEnergyZattacker > totalEnergyPedion && totalEnergyZattacker > totalEnergyCarrier) {
            nameRobotMostEng = "Zattacker";
            valueRobotMostEng = totalEnergyZattacker;
        } else {
            nameRobotMostEng = "Carrier";
            valueRobotMostEng = totalEnergyCarrier;
        }
        System.out.println("Robot-used-the-most-energy-is: " + nameRobotMostEng + " Energy-used=" + valueRobotMostEng);
        

        //find sum of energy
        System.out.printf("Total-energy-used=%.3f\n", (totalEnergyPedion + totalEnergyZattacker + totalEnergyCarrier));

        scanner.close();
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    
}
