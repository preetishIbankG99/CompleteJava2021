package patterns;

public class Pattern8 {
public static void main(String[] args) {
	
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" "+j);
			}
			
			for(int k=6;k>i;k--){
			
			System.out.print("*");	
			}
			
		System.out.println();
		}
		
	}
}
//1*****
//1 2****
//1 2 3***
//1 2 3 4**
//1 2 3 4 5*
//1 2 3 4 5 6