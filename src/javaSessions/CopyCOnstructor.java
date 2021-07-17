package javaSessions;

public class CopyCOnstructor {
    int id;
    String name;
    CopyCOnstructor(int i,String n){
        id=i;
        name=n;


    }
    CopyCOnstructor(CopyCOnstructor c){

id=c.id;
name=c.name;


    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        CopyCOnstructor co=new CopyCOnstructor(111,"gudu");
        CopyCOnstructor cp=new CopyCOnstructor(co);
    co.display();
    cp.display();
    }



}
