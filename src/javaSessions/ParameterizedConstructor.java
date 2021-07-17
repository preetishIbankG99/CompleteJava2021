package javaSessions;

public class ParameterizedConstructor {
    int id;
    String name;
    //creating parameterized constructor
    ParameterizedConstructor(int i,String n){
        id=i;
        name=n;

    }
void display(){
    System.out.println(id+" "+name);
}

    public static void main(String[] args) {
        ParameterizedConstructor pc=new ParameterizedConstructor(111,"Aditya");
        ParameterizedConstructor pc1=new ParameterizedConstructor(112,"Raj");
pc.display();
pc1.display();
}
}
