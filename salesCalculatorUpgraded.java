package chapter2;

import java.util.Scanner;
public class SalesCalculatorUpgraded {

    public static void main (String[] args) {

        // 1. Known values (quota)

        int quota = 10;

        // 2. unknown values (the actual quota)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number of sales for this week. ");
        int employeeQuota = scanner.nextInt();
        scanner.close();

        // 3. congratulate them or not
        if(employeeQuota >= quota) {
            System.out.println("Congratulations you got your bonus this week");
        } else {
            System.out.println("Sorry, you need " + (quota - employeeQuota) + " more sales to get a bonus this week." );
        }
        
        /*
        From Angie, 
        else {
         int salesShort = quota - employeeQuota;
         System.out.println("Sorry you need " + salesShort + " to get your bonus this week."); 
        }
         */
    }
}
