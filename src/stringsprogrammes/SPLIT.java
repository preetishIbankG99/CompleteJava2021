package stringsprogrammes;

public class SPLIT {
    public static void main(String[] args) {
        String s="hii i am lonely will you be my friend";
        String w[]=s.split("\\s");
        for (String sp:w){
            System.out.println(sp);


        }
        String z="Javatpointtt";
        System.out.println("Returning words:");
        String[]arr=z.split("t",0);
        for (String x:arr){
            System.out.println(x);
        }

    }
}
