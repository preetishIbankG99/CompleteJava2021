package controlStatements;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(":::Enter a Month:::");
        String input = sc.nextLine();


        switch (input) {

            case "jan":
                System.out.println("January");
                break;

            case "feb":
                System.out.println("February");
                break;

            case "mar":
                System.out.println("March");
                break;

            case "apr":
                System.out.println("April");
                break;

            case "may":
                System.out.println("May");
                break;

            case "jun":
                System.out.println("June");
                break;

            case "jul":
                System.out.println("July");
                break;

            case "aug":
                System.out.println("August");
                break;

            case "sept":
                System.out.println("September");
                break;

            case "oct":
                System.out.println("October");
                break;

            case "nov":
                System.out.println("November");
                break;

            case "dec":
                System.out.println("December");
                break;
            default:
                System.out.println("Enter a valid Month");
        }

    }
}