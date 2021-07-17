package staticExample;
//static keyword in java used for memory management
//static can be used with variables,methods,blocks and nested class
//static keyword belongs to class
public class StaticVariable {
    int rollno;//instance or global variable
    String name;//
    static String college="PIET";//static variable
public StaticVariable(int r,String n){
    rollno=r;
    name=n;
}
void display(){
    System.out.println("Student details :::" +rollno+" " +name+ " " +college);
}

    public static void main(String[] args) {
        StaticVariable s=new StaticVariable(1,"preetish");
        s.display();
    }
}
