package javaSessions;

public class LabelledForLoopExample {
    public static void main(String[] args) {
        aa:
        for (int i = 1; i <= 4; i++) {
            bb:
            for (int j = 1; j <= 4; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
