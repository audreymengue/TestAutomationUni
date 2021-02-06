package chapter2;

import java.util.Scanner;
public class MadLib {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a season: ");
        String season = scanner.next();
        System.out.println("Please enter an adjective: ");
        String adjective = scanner.next();
        System.out.println("Please, enter a whole number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + ", I drink a minimum of " + number + " cups of coffee.");
    }
}
