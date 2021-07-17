package controlStatements;

import java.util.Scanner;

public class IFElseLeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(":::::Please Enter a year in digit::::");
        int year=sc.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("LeapYear");
        }
        else {
            System.out.println("CommonYear");
        }
    }
}
