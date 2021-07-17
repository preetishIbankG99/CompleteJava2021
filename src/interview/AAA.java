package interview;

import java.util.ArrayList;
import java.util.Scanner;

public class AAA {

	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a String");
//	String input=sc.nextLine();
//		//System.out.println(str.length());
//		String st1=input.substring(0, 100);
//		String st2=input.substring(100,input.length());
//		String con=st1+st2;
//		System.out.println(con.length());
//		System.out.println(con.charAt(8));
		
		
//		String str="mmOonnooppOolloojjoo";
//		System.out.println(str.equalsIgnoreCase("mmOonnooppOolloojjoo"));//case ignored
//		 System.out.println("Enter a character to count in the string " + str);
//		 
//		 char c=str.toLowerCase().charAt(2);//though we taking index to count particular char
//       
//int count = 0;
//for (char cc : str.toCharArray()) {
//if (c == cc) {
//count++;
//}
//}
//System.out.println(c + " occurs " + count + " times in " + str);
		   String str1 = "MnkkOOkkhhKKjjKk";  
	        ArrayList<String> list = new ArrayList<>();  
	        list.add("MnkkOOkkhhKKjjKkbkjlgbjkvkg");   
	        list.add("MnkkOOkkhhKKjjKkhlhlkjh");  
	        list.add("MnkkOOkkhhKKjjKkufitugfujvfuk");  
	        list.add("MnkkOOkkhhKKjjKkhgljgjlgkhjkhkkk");  
	        list.add("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");  
	        for (String str : list) {  
	            if (str.equalsIgnoreCase(str1)) {  
	                System.out.println("true matched");  
	            }  
	            char c=str.charAt(2);
	            int count=0;
	            for(char s:str.toCharArray()) {
	            	if(s==c) {
	            		count++;
	            	}
	            }
	            System.out.println(c + " occurs " + count + " times in " + str);
	            
	        }  

	}

}
