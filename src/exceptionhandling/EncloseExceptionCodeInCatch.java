package exceptionhandling;

public class EncloseExceptionCodeInCatch {
    public static void main(String[] args) {
        int i=10;
        int j=0;
        int data;

        try{
            data=i/j;

        }
        catch(Exception e){
            data=i/j;
        }
        System.out.println(data);
    }
}
