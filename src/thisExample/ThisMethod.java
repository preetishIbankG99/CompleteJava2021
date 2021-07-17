package thisExample;

public class ThisMethod {
    void m(){
        System.out.println("hello m");
    }
    void n(){
        System.out.println("hello n");
        m();//same as this.m();
    }

    public static void main(String[] args) {
        ThisMethod t=new ThisMethod();
        t.n();
    }

}
