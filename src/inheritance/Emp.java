package inheritance;

public class Emp {
    int id;
    String name;
    Address address;
    public Emp(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
void display(){
    System.out.println(id+" "+name);
    System.out.println(address.city+" "+address.state+" "+address.country);
}

    public static void main(String[] args) {
        Address addr1=new Address("rourkela","odisha","india");
        Address addr2=new Address("bangalore","karnataka","india");

        Emp e=new Emp(111,"preetish",addr1);
        Emp e2=new Emp(112,"Avish",addr2);
        e.display();
        e2.display();
}

}
