package stringsprogrammes;

public class CountPunctuationCharacters {
    public static void main(String[] args) {
        int count=0;
        String str="He said,The mailman loves you.'I heard it with my own ears.";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='!'||str.charAt(i)==','||str.charAt(i)==';'||str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)=='_');
            {
                count++;

            }
        }

        System.out.println(count);
    }
}
