package finalExamples;

public class ChildMethod extends ParentFinalMethod{
//    void run(){//cannot ovveride bcoz parent method is final
//        System.out.println("child");
//    }
    public static void main(String[] args) {
ChildMethod c=new ChildMethod();
c.run();
    }
}
