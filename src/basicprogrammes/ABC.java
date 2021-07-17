package basicprogrammes;

public class ABC {
     int c;
    void show(){

        System.out.println(c);
    }
     static void display(){
         int b=20;
         System.out.println(b);
    }
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        ABC h=new ABC();
        h.show();
    }
}
