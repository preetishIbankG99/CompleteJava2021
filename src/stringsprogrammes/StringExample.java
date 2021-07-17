package stringsprogrammes;

public class StringExample {
//    String s1="abc";//creating string object using string literal(String Constant Pool)
 //   String s2=new String("abc");//creating String object(heap memory)
    //String obj in Java are immutable means you created String objects you cannot modify them.
    //if you try to modify them a new object will be created with modifications
    //in all thrree classes String,StringBuffer,String Builder,toString() method is overriden
//String,StringBuffer,StringBuilder all are final class
    public static void main(String[] args) {
//    System.out.println("abc".charAt(0));
//    System.out.println("abc".equalsIgnoreCase("ABC"));
//    System.out.println("abc".compareTo("abc"));
//    System.out.println("abc".indexOf('c'));

        String s1="sachin";
        String s2="sachin";
        String s3="sachin";
       s3= s3.concat("java");
        System.out.println(s3);
        System.out.println(s1);


    }
}
