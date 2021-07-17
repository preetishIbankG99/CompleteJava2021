package javaSessions;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("########Dear Voter Please Enter Your Age########");
        int age=scan.nextInt();
if(age>18){
    System.out.println("<<<Your Age is>>>" +age);
    System.out.println("::::You are Elligible To Vote::::");
    System.out.println("THANKS FOR VOTING");
}
   else{
    System.out.println("Come After Completing 18+ age");
    System.out.println("THANK YOU VISIT AGAIN");
   }

    }
}
