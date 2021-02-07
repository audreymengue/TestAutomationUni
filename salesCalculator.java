package chapter2;

import java.util.Scanner;

public class SalesCalculator {

    public static void main(String[] args) {

        int salary = 1000;
        int sales = 10;
        int bonus = 250;

        System.out.print("Please enter your number of sales this week, thank you!");
        Scanner scanner = new Scanner(System.in);
        double weeklySales = scanner.nextDouble();
        scanner.close();

        if(weeklySales > sales) {

            int currentSalary = salary + bonus;
            System.out.print("Hurray you got a bonus of " + bonus + " and your current salary is " + currentSalary + "USD");
        } else {
            System.out.println("Sorry you have to work harder in order to get your bonus next time.");
        }
    }
}
