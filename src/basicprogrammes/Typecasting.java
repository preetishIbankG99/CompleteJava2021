package basicprogrammes;
//Type casting is process that converts a datatype to another datatype
//implicit typecasting is done by compiler and explicit by programmer
//double>float>long>int>short>byte(narrowing)(dataloss)(upcast)(explicit)
//double<float<long<int<short<byte(widening)(no data loss)(downcast)(implicit)
public class Typecasting {
    public static void main(String[] args) {
        //implicit or widening or downcasting
        int a=10;
        double b=a;
        System.out.println(b);//10.0//no data loss

    //explicit or narrowing or upcasting
       double c=20.0;
        int d=(int)c;
        System.out.println(d);
    }
}
