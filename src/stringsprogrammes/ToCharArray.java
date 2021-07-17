package stringsprogrammes;

public class ToCharArray {
    public static void main(String[] args) {
        String s="Dilip Kumar";
        char[]c=s.toCharArray();
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
