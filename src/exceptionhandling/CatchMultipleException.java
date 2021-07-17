package exceptionhandling;
//try block can be followed by one or more catch blocks each catch block contains different exception
//if we have to perform different tasks at occurence of different exception use it
//At a time only one exception occurs and only one catch block executed
//all catch blocks must be order from most specific to most general
//we caanot declare parent exception before arithmetic exception compile time error occurs
//arithmetic>arrayindex>......>Exception
public class CatchMultipleException {
    public static void main(String[] args) {
        try {
   //            int a[]=new int[5];//Arithmetic Exception Catchblock invoked
  //            a[5]=30/0;

            //       String s=null;
            //      System.out.println(s.length());//null pointer exception catch block invoked

  //          String s="abc";
  //          int i=Integer.parseInt(s);//NumberFormatException catch block invoked

//            int a[]=new int[7];
  //          a[10]=70;//ArrayIndexOutOfBoundsException catch block invoked

         //   String s="preetish";
          //  System.out.println(s.charAt(34));//StringIndexOutOfBoundsException catch block invoked
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticExceptionOccurs");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsExceptionOccurs");
        }
        catch (NullPointerException e){
            System.out.println("NullPointerExceptionOccurs");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsExceptionOccurs");
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatExceptionOccurs");
        }
        catch (Exception e){
            System.out.println("ParentExceptionOccurs");
        }
        System.out.println("rest of the code");
    }
}
