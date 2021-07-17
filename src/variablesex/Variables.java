package variablesex;
//variables names are case sensitive it must start with a letter or the $ or _character
//blank space cannot be used in variable names
//local variables declared in methods,constructors,blocks and it destroyed once it exists methods,constructors,blocks
//acess specifier cannot be used in local variables
//local variables are visible only within declared method,constructor or block
//no default value for local variables
public class Variables {
    public Variables(){
       //public ,private,protected
        // int _fee=10;
    }

    public void show(){
        System.out.println("how the josh");
    }

    public static void main(String[] args) {
        Variables v=new Variables();
        System.out.println();
    }
}
