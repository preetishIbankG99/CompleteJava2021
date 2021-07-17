package javaSessions;

public class ConstructorOverloading {
    int id;
    String name;
    int age;
    //creating two arg constructor
    ConstructorOverloading(int i,String n){
        id=i;
        name=n;
    }
    ConstructorOverloading(int i,String n,int a) {
        id = i;
        name = n;
        age=a;
    }

public void studentCredentials(){
    System.out.println(id+" "+name+"  "+age);
}

    public static void main(String[] args) {
        ConstructorOverloading co=new ConstructorOverloading(111,"Bala");
        ConstructorOverloading co1=new ConstructorOverloading(112,"Raghu",32);
co.studentCredentials();
co1.studentCredentials();
}


}
