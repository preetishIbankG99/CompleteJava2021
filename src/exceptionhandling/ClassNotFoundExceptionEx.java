package exceptionhandling;
//it is checked type exception.it throws exception when an application tries load a class at run time
//using Class.forName() or loadClass()or findSystemClass() methods but class with specified name not found in classpath
//this frequently occurs when you try to run your application without updating classpath with reqd jars
public class ClassNotFoundExceptionEx {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        //above class will throw exception if you dont update classpath with oracle jdbc driver
        }
    }
}
