package exceptionhandling;
//finally block is always executed whether exception is handled or not
//finally block follows try or catch block
public class finallyblock {
    public static void main(String[] args) {
        try {
           // int data=25/5;//exception doesnot occurs
            //System.exit(0);
            int data=25/0;

            System.out.println(data);

        }
        //Exception not handled
        catch (NullPointerException e){
            System.out.println(e);
           // System.exit(0);
            //System.out.println("byee");


       }

//        catch (ArithmeticException e){
//            System.out.println(e);
//        //System.exit(0);
//            System.out.println("hiii");
//          }
    finally {

            System.out.println("finally block will execute any how if exception handled or not");

        }
        System.out.println("code checked complete");
    }
}
