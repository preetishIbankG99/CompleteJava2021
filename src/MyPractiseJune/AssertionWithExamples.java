package MyPractiseJune;

import org.testng.Assert;

import java.util.Scanner;

public class AssertionWithExamples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(":::::::###Enter Age###:::::::");
        int age=sc.nextInt();

        if (age>18){
            Assert.assertTrue(true);
            System.out.println("You are Elgible to  vote");

        }
    else{
            System.out.println("You are not Elligible to vote");
        }


    }
}
