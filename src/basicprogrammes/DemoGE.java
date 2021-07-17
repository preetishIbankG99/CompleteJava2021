package basicprogrammes;

public class DemoGE {
    int empid;
    String ename;
    static String company="ge";

    static void changecompany(){
        company="tcs";
    }

void display(){
    empid=1;
    ename="nikhil";
    System.out.println(empid+" "+ename+" "+company);
}

    public static void main(String[] args) {

       DemoGE d=new DemoGE();
       DemoGE.changecompany();

        d.display();

    }
}
