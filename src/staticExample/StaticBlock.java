package staticExample;
//used for initialize static data member
//executed before main method at time of classload
public class StaticBlock {
    static int a;
    static {
        System.out.println("Hi I am Static Block");
     a=10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("I am main");

    }
}
