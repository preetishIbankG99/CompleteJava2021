package constructorsExamples;
//Constructor is a block of codes similar to methods.
// it is special type of method which is use to initialize object
//Every  time an object is created using new() keyword at least one constructor is called
//java compiler provides a default constructor if there is no constructor
//it is called when an instance of the class is created
//at the time of calling constructor memory for the object is allocated
//constructor name must be same as class name.it must not have explicit return type
//constructor cannot be abstract ,static,final and synchronized
//all access specifier like public,protected,default and private can be use while declaring a constructor
public class ConstructorExample1 {
public ConstructorExample1(){
    System.out.println("I am default constructor");
}

    public static void main(String[] args) {
         ConstructorExample1 c=new ConstructorExample1();
    }
}
