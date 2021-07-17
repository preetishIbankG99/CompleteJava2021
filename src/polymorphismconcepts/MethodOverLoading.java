package polymorphismconcepts;
//if a class have multiple methods having same name but different in parameters/dataTypes it is know as MethodOverloading
public class MethodOverLoading {
static int add(int a,int b){

    int c=a+b;
    System.out.println(c);
    return c;
}
    static int add(int a,int b,int c){

        int d=a+b+c;
        System.out.println(d);
        return d;
    }
    static float add(float a,float b){

        float c=a+b;
        System.out.println(c);
        return c;
    }
    static double add(double a,double b){

        double c=a+b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        MethodOverLoading.add(10,20);
        MethodOverLoading.add(10,20,30);
        MethodOverLoading.add(10.3,11.7);
        MethodOverLoading.add(20.34,34.43);

    }

}
