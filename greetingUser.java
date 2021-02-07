package chapter2;

import java.util.Scanner;

public class CallingGreetingUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username ");
        String user = scanner.next();
        scanner.close();
        greetingUser(user);

    }

    public static void greetingUser(String user){

        System.out.println("Hello " + user);

    }
}
