package exceptionhandling;

public class CustomMessageException {
    public static void main(String[] args) {


        try{
            int data=10/0;

        }
        catch(Exception e){
            //Custome Message
            System.out.println("Cannot Divide By Zero");
        }
        System.out.println("hiiii");
    }
}
