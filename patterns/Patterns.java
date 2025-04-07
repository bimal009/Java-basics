public class Patterns {
    public static void main(String[] args) {

        // *****
        // *****
        // *****
        // *****

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");

        // }

        // *****
        // * ..*
        // * ..*
        // *****

        int n = 4; // number of rows
        int m = 5; // number of columns

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // Print * for boundary positions
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to next line
        }
    }
}