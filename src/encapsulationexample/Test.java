package encapsulationexample;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        //setting values
        s.setName("preetish");
        s.setId(121);
        //getting values
        System.out.println(s.getName());
        System.out.println(s.getId());
    }
}
