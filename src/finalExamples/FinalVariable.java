package finalExamples;
//Final is used to restrict the user
//final variable stop changing its value
//final method cannot be overriden
//final class cannot be inherited
//blank final variable can be initialize in constructor only
//static blank final variable can be initialize in static block only
//parameter can also be final but you cannot change it
public class FinalVariable {
    final int speedlimit=90;
    void run(){
        //speedlimit=120;
    }

    public static void main(String[] args) {
        FinalVariable f=new FinalVariable();
        f.run();
    }
}
