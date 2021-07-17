package constructorsExamples;

public class IBM {
    int id;
    String name;
    String  designation;
    public  IBM(int id,String name,String designation){
        this.id=id;
        this.name=name;
        this.designation=designation;
    }

    void displaydetails(){
        System.out.println("Emp id :: "+id +" Emp Name :: "+name+" Emp Designation :: "+designation);
    }

    public static void main(String[] args) {
        IBM i=new IBM(11,"preetish","AutomationEngineer");
        i.displaydetails();
    }
}
