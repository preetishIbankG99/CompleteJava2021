package abstraction;

public class TestAbstraction extends AbstractExample{
    void printStatus(){
        System.out.println("run harder");
    }

    public static void main(String[] args) {
        AbstractExample e=new TestAbstraction();
        e.printStatus();
    }
}
