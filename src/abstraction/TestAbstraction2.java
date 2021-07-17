package abstraction;

public class TestAbstraction2 extends AbstractExample2{
    void run(){
        System.out.println("run harder");
    }

    public static void main(String[] args) {
        AbstractExample2 e=new TestAbstraction2();
        e.run();
        e.changeGear();
    }
}
