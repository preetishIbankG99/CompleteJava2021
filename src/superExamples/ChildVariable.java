package superExamples;

public class ChildVariable extends SuperVariable {
    String color="black";
    void printColor(){
        System.out.println(color);//print color of child class
        System.out.println(super.color);//print color of parent class
    }

    public static void main(String[] args) {
        ChildVariable c=new ChildVariable();
        c.printColor();
    }

}
