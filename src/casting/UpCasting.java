package casting;
//Converting HigherData type into lower one is called narrowing,explicit or upcasting
//done manually by programmer if we donot perform casting it will give C.E
//data loss occurs
//byte<short<char<int<long<float<double
public class UpCasting {
    public static void main(String[] args) {
        double d=133.5556;
        long l=(long)d;//we are storing double value which is biiger into long so need typecast
        int i=(int)l;//again we are storing long value bigger into smaller(int) so typecast
        System.out.println("Before Conversion " +d);
        System.out.println("After Conversion " +l);
        System.out.println("After Conversion " +i);
    }
}
