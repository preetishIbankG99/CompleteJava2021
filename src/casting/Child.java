package casting;

public class Child extends Parent {
    void display(){
        System.out.println("Show me Displayid");
    }

    public static void main(String[] args) {

        //converting lower datatype into a higherone(widening,implicit or downcasting)
        Parent p1=new Child();//downcast
        //parent class reference variable holding object of childclass
        //double=int (implicit)
        p1.show();

        //Converting HigherData type into lower one is called narrowing,explicit or upcasting
        //Child class reference variable holding the parent class reference variable and tyecasted
        Child c=(Child)p1;//upcast
        c.display();
        c.show();




    }
}
