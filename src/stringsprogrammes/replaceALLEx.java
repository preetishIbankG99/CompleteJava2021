package stringsprogrammes;

public class replaceALLEx {
    public static void main(String[] args) {
        String s="this is what i am.this is what you are.this is java";
        System.out.println(s.replaceAll("is","was"));
        //o/p::thwas was what i am.thwas was what you are.thwas was java
        System.out.println(s.replaceAll("\\s","#"));
        //this#is#what#i#am.this#is#what#you#are.this#is#java
        System.out.println(s.replace("this","It"));
        //It is what i am.It is what you are.It is java
        System.out.println(s.replaceAll("\\s",""));
        //thisiswhatiam.thisiswhatyouare.thisisjava
    }
}
