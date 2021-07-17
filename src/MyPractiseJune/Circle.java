package MyPractiseJune;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        int r=sc.nextInt();

        int area=22/7*(r*r);

        System.out.println("Area of Circle is :: "+area);
    }
}