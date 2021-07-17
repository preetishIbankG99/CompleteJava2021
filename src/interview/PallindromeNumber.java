package interview;

public class PallindromeNumber {
	public static void main(String args[]){  
			  int r,sum=0,temp;    
			  int n=454;//It is the number variable to be checked for palindrome  
			  
			  temp=n;    //1-454,2-45,4
			  while(n>0){    //(454>0) true//45>0 true//4>0 true
			   r=n%10;  //getting remainder 454%10=4//45%10=5
		   sum=(sum*10)+r;    //(0*10)+4=4//(4*10)+5=45
			   n=n/10;    //454/10=45//45/10=4
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  

}
