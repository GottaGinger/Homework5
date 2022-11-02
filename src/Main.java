import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Grand Circus Casino!");
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int num;
        String rollAgain;

        do {
            System.out.println("How many sides should each die have?");
            num = scan.nextInt();
            System.out.println("Roll " + count + ":");
            for (int i = 0; i < 2; i++) {
                System.out.println(generateRandomDieRoll(num));
            }
            System.out.print("Roll again? (y/n):");
            rollAgain = scan.next();
            count++;
        }while (rollAgain.equals("y"));
    }
    public static int generateRandomDieRoll(int numberOfSides) {
        Random rand = new Random();
        return rand.nextInt(numberOfSides) + 1;
    }
}