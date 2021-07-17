package controlStatements;

import java.util.Scanner;

public class NestedIF {
    public static void main(String[] args) {
//        int age=20;
//        int weight=75;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Valid Age");
        int age=sc.nextInt();
        System.out.println("Enter Valid Weight");
        float weight=sc.nextFloat();
        if(age>18 && age<25){
            if(weight>50.0 && weight<90){
                System.out.println("You are Elligible to Give NDA Exam");
            }

        }
        else {
            System.out.println("Better luck next Time");
        }
    }
}
