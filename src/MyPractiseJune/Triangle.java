package MyPractiseJune;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base of Triangle");
        int base=sc.nextInt();

        System.out.println("Enter Height of Triangle");
        int height=sc.nextInt();


        int area=(base*height)/2;
        System.out.println("::::Area of the triangle is:::: "+area +"sqcm");



    }
}
