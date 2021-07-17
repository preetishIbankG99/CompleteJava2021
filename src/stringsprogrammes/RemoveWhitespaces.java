package stringsprogrammes;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        String s="Remove all white spaces";
        s=s.replaceAll("\\s+","");
        System.out.println("After removal ::"+s);
    }
}
