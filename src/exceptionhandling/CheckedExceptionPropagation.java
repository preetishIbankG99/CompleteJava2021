package exceptionhandling;

import java.io.IOException;

public class CheckedExceptionPropagation {
    void m()throws IOException{
        throw new java.io.IOException("device error");//compile time error without throws
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }
        catch (Exception e){
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        CheckedExceptionPropagation e=new CheckedExceptionPropagation();
        e.p();
        System.out.println("normal flow");
    }
}
