package constructorsExamples;
//Default Constructor showing Default Values
public class TCS {
    int id;
    String name;
    String  designation;

    void displaydetails(){
        System.out.println("Emp id :: "+id +" Emp Name :: "+name+" Emp Designation :: "+designation);
    }

    public static void main(String[] args) {
        TCS s=new TCS();
        s.displaydetails();
    }
}
