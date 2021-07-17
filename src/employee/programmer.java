package employee;

public class programmer extends admin{
    public programmer(String name){
        System.out.println("Hey "+name+" Thanks for Contacting US");
    }
   public void developer(){
        System.out.println("base salary is 35K");
    }
  public   void automationTester(){
        System.out.println("base salary is 30K");
    }

    public static void main(String[] args) {
        programmer p=new programmer("Mukesh");
        p.basePay();
        p.adminSalary();
        p.developer();
        p.automationTester();
    }
}
