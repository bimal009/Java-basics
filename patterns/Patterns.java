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

        // int n = 4;
        // int m = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // // Print * for boundary positions
        // if (i == 1 || i == n || j == 1 || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // pattern 3

        // *

        // * *

        // * * *

        // * * * *

        // * * * * * /

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        /*
         * Star Pattern 2
         * * * * * *
         * * * * *
         * * * *
         * * *
         * 
         */

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "" + j);
            }
            System.out.println();
        }

    }
}