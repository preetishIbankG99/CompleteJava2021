package exceptionhandling;
//we are trying to find length of string field 's' of class A.but not initialize.it is pointed to null
//it happens if you dont initialize the reference  variable and pointing to null
public class NullPointerException {
    static  String s;

    public static void main(String[] args) {
        System.out.println(NullPointerException.s.length());
    }
}
