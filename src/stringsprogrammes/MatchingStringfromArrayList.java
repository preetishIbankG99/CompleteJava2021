package stringsprogrammes;

import java.util.ArrayList;

public class MatchingStringfromArrayList {

	public static void main(String[] args) {

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
