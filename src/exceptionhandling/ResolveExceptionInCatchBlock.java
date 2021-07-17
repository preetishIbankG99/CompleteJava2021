package exceptionhandling;

public class ResolveExceptionInCatchBlock {
    public static void main(String[] args) {
        int i=10;
        int j=0;
        int data;

        try{
            data=i/j;

        }
        catch(Exception e){
            data=i/(j+2);
        }
        System.out.println(data);
    }
}
