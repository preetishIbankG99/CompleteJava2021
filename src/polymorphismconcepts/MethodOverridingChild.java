package polymorphismconcepts;

public class MethodOverridingChild extends MethodOverriding {
    void run(){
        System.out.println("Bhaag BoseDK");
    }

    public static void main(String[] args) {
        MethodOverridingChild o=new MethodOverridingChild();
        o.run();
    }
}
