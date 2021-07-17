package thisExample;

public class ThisConstructor {
    ThisConstructor()
    {
        System.out.println("hello A");
    }
    ThisConstructor(int x){
        this();
        System.out.println(x);
    }

    public static void main(String[] args) {


    ThisConstructor c=new ThisConstructor(10);

}
}
