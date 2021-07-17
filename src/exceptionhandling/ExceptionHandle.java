package exceptionhandling;
//Exception handling in java is one of powerful mechanism to handle run time errors
//such as ClassnotFound,IOException,SQLException,RemoteException
/*class which directly inherits throwable class except runtime exception and error
Ex-IOException,SQL Exception at compile time are checked exceptions
UNCHECKED EXCEPTION-class inherit RuntimeException-Arithmetic,NullPointer,ArrayIndexOutOfBounds*/
//if we have a null value in any variable performing any operation on the variable throws a nullpointerexception
public class ExceptionHandle {
    public static void main(String[] args) {
        try{
            int data=10/0;
//            String s=null;
//            System.out.println(s.length());//null pointer exception

//            String s="abc";
//            int i=Integer.parseInt(s);//NumberFormatException

            //int a[]=new int[7];
           //a[10]=70;//ArrayIndexOutOfBoundsException
        }
    catch(ArithmeticException e){
        System.out.println(e);
    }
        System.out.println("rest of the code");
    }
}
