package pattern;

public class reversehalfpyramid {
    public static void main(String[] args) {
        int n = 4, i, j, k;

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
