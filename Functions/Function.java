import java.util.Scanner;

public class Function {

    // public static int sum(int num1, int num2) {

    // int total = num1 + num2;
    // return total;
    // }

    // public static void main(String[] args) {

    // int result = sum(4, 5);
    // System.out.println("Sum: " + result);
    // }

    // take name input from the user and print it
    public static void myName(String name) {

        System.out.println("your name is " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yourName = sc.nextLine();
        myName(yourName);
        sc.close();
    }
}
