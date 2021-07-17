package exceptionhandling;

public class HandleExceptionWithDifferentTypeExceptn {
    public static void main(String[] args) {
        int i=10;
        int j=0;
        int data;

        try{
            data=i/j;

        }
        catch(NullPointerException e){
            data=i/j;
        }
        System.out.println(data);
    }
}
