import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your Age: "); 
        
        int age = sc.nextInt();
        
        if (age >= 18) {  
            System.out.println("You are greater than or equal to 18");
        } else {
            System.out.println("You are less than 18");
        }
        
        sc.close(); 
    }
}
