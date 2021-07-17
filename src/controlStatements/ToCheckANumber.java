package controlStatements;

import java.util.Scanner;

public class ToCheckANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("::::Enter A Valid Digit::::");
        int num = sc.nextInt();
 if(num>0){
     System.out.println("POSITIVE");
 }
       else if(num<0){
            System.out.println("NEGATIVE");
        }
    else {
     System.out.println("ZERO");
 }
    }
}