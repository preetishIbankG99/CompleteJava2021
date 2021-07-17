package wrapper;
//autoboxing:primitive to object(byte>Byte,char>Character,int to Integer,long to Long,float to Float,boolean to Boolean,double to Double)
//unboxing:object to primitive
public class Wrapper {
    public static void main(String[] args) {
        //autobox
        int a=20;
        Integer i=Integer.valueOf(a);
        Integer j=a;
        System.out.println("autoboxing:::"+a+" "+i+" "+j);
     //unbox
        Integer b=new Integer(9);
        int k=b.intValue();
        int g=b;
        System.out.println("unboxing:::"+a+" "+i+" "+j);
    }
}
