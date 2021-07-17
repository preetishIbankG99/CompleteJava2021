package exceptionhandling;
//throw keyword is used to explicitly throw an exception
//we can throw either checked or unchecked exception
//throw keyword is mainly used to throw customexception
public class ThrowException {
    static void validate(int age){
        if(age<18){
            throw new ArithmeticException("not valid");

        }
    else {
            System.out.println("welcome to vote");
        }

    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of code");
    }

}
