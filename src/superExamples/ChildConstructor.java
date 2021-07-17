package superExamples;

public class ChildConstructor extends SuperConstructor {
    ChildConstructor(){
        super();
        System.out.println("I am Child Constructor");

    }

    public static void main(String[] args) {
        ChildConstructor c=new ChildConstructor();
    }
}
