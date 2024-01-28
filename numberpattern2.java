package pattern.PatternProblemSolving;

public class numberpattern2 {
    public static void main(String args[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int sum = 1; sum <= i; sum++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
