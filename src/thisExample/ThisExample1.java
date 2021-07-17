package thisExample;

import staticExample.StaticVariable;

///this is a reference variable that refers to current object
//this can be used to refer current class instance variable
//this can be used to invoke current class method(implicitly)
//this() can be used to invoke current class constructor
//this can be use to passed as an argument in the method call
//this can be use to passed as an argument in the constructor call
//this can be used to return the current class instance from method
public class ThisExample1 {
    int rollno;//instance or global variable
    String name;//

    public ThisExample1(int rollno,String name){
        this.rollno=rollno;//this can be used any where either lhs or rhs
        this.name=name;
        //System.out.println("Student details :::" +rollno+" " +name);//this will print local variable datas

    }
    void display(){
        System.out.println("Student details :::" +rollno+" " +name);
    }

    public static void main(String[] args) {
        ThisExample1 s=new ThisExample1(1,"preetish");
        s.display();
    }





}
