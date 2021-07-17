package basicprogrammes;

public class SeleniumOnlineTraining {
    String trainerName="Mukesh";
    public void seleniumTraining(){
        String price="200USD";
        System.out.println("Welcome to Online Training Programme");
        System.out.println("Thank you for showing interest in training programme ");
        System.out.println("Selenium Training charges are "+price+" and Trainer name is "+trainerName);
        System.out.println();
    }
    public void devopsTraining(){
        String price="300USD";
        System.out.println("Welcome to Online Training Programme");
        System.out.println("Thank you for showing interest in training programme ");
        System.out.println("Devops Training charges are "+price+" and Trainer name is "+trainerName);
        System.out.println();
    }
    public void jmeterTraining(){
        String price="400USD";
        System.out.println("Welcome to Online Training Programme");
        System.out.println("Thank you for showing interest in training programme ");
        System.out.println("JMeter Training charges are "+price+" and Trainer name is "+trainerName);

    }

    public static void main(String[] args) {
        SeleniumOnlineTraining s=new SeleniumOnlineTraining();
        s.seleniumTraining();
        s.devopsTraining();
        s.jmeterTraining();

    }
}
