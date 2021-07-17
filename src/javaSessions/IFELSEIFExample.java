package javaSessions;

import java.util.Scanner;

public class IFELSEIFExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("::::Enter Your Marks::::");
        int marks=sc.nextInt();
    if(marks>=90&&marks<100){
        System.out.println("Outstanding");
    }
    else if (marks>=80&&marks<75){
        System.out.println("Excellent");
    }
    else if (marks>=70&&marks<65){
        System.out.println("Very Good");
    }
    else if (marks>=65&&marks<60){
        System.out.println("Good");
    }
    else if (marks>=50&&marks<55){
        System.out.println("Average");
    }
    else if (marks>40&&marks<50){
        System.out.println("Fail");
    }
    else{
        System.out.println("Result Witheld");
    }
    }
}
