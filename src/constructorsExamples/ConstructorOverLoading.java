package constructorsExamples;

public class ConstructorOverLoading {
    int id;
    String name;
    Float salary;
    ConstructorOverLoading(int i,String n){
        id=i;
        name=n;
    }

    ConstructorOverLoading(int i,String n,Float s){
        id=i;
        name=n;
        salary=s;
    }
void display(){
    System.out.println(id+" "+name+" "+salary);
}

    public static void main(String[] args) {
        ConstructorOverLoading co=new ConstructorOverLoading(111,"jatin");
        co.display();
        ConstructorOverLoading co2=new ConstructorOverLoading(112,"nitin",2200.4f);
        co2.display();
    }

}
