package basicprogrammes;

public class StaticMethodDemo {
    static int add(int a,int b){
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(StaticMethodDemo.add(2,3));
    }
}
