package casting;
//converting one dataType to another is TypeCasting
//converting lower datatype into a higherone(widening,implicit or downcasting)
//no chance of dataloss
//Both data type must be compatible with each other(conversion between numeric datatype to char or boolean not done as not compatible)
//target must be larger than sourcetype
//byte>short>char>int>long>float>double
public class DownCasting {
    public static void main(String[] args) {
        int x = 4;
        long y=x;
        float z=y;
        double d=z;
        System.out.println("Before conversion int value " +x);
        System.out.println("After conversion long value " +y);
        System.out.println("After conversion float value " +z);
        System.out.println("After conversion double value " +d);
    }
}