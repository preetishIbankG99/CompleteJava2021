package staticExample;
//if you use static keyword in any method it becomes static
//static method can be invoked without creating object ClassName.staticmethodname
//static method can access static data member and can change the value of it
//static method can not use non static data member or call non static method
//this and super cannot be use in static context
public class StaticMethod {
    int rollno;//instance or global variable
    String name;//
    static String college="PIET";//static variable
    static void change(){
        college="GIET";
    //super();
     //this //cannot be used in static
    }
    public StaticMethod(int r,String n){
        rollno=r;
        name=n;
    }

    void display(){
        System.out.println("Student details :::" +rollno+" " +name+ " " +college);
    }

    public static void main(String[] args) {

        StaticMethod.change();
        StaticMethod s=new StaticMethod(1,"preetish");
        s.display();
    }
}
