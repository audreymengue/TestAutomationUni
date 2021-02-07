package chapter2;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Values we know

        int minSalary = 30000;
        int minWorkingYear = 2;

        // 2. Values we don't know
        System.out.println("Please enter your minimum salary ");
        int actualSalary = scanner.nextInt();
        System.out.println("Please enter the number of year you have worked for ");
        int yearWorking = scanner.nextInt();
        scanner.close();

        // 3. Tell who qualified
        if(minSalary >= actualSalary && minWorkingYear >= yearWorking) {
            System.out.println("Yay you qualified");

        }else {
            System.out.println("Sorry, you don't meet all the requirements. Try again next time.");
        }



    }
}
