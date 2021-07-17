package abstraction;

public interface InterfaceExample {
//by default compiler adds public and abstract to  method in interface
void m1();
//by default compiler add public static final in data member of interface
 int a=10;
//default method;
default void t1(){
    System.out.println("I am default method");
    System.out.println(a);
}
//static method
static void p1(){
    System.out.println("I am static method");
    System.out.println(a);
}
}
