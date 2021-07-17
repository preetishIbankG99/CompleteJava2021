package MyPractiseJune;

import java.util.Scanner;

public class AverageOfMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mark of Subject1 - ");
        int marks1=sc.nextInt();

        System.out.println("Enter Mark of Subject2 - ");
        int marks2=sc.nextInt();

        System.out.println("Enter Mark of Subject3 - ");
        int marks3=sc.nextInt();

        System.out.println("Enter Mark of Subject4 - ");
        int marks4=sc.nextInt();

        System.out.println("Enter Mark of Subject5 - ");
        int marks5=sc.nextInt();

        int average =(marks1+marks2+marks3+marks4+marks5)/5;
        System.out.println("Average is:::: "+average);
    }
}
