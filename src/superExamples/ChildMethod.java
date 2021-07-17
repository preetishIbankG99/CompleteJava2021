package superExamples;

public class ChildMethod extends SuperMethod{
    void eat(){
        System.out.println("I am childmethod");
    }
void bark(){
    System.out.println("dont bark");
    super.eat();
    }

    public static void main(String[] args) {
        ChildMethod v=new ChildMethod();
        v.bark();
    }
}
