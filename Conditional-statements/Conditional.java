import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        // <-- checking age-->


        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter Your Age: "); 
        
        // int age = sc.nextInt();
        
        // if (age >= 18) {  
        //     System.out.println("You are greater than or equal to 18");
        // } else {
        //     System.out.println("You are less than 18");
        // }
        
        // <-- checking odd or even-->

        //  Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter a number: "); 
        
        // int num = sc.nextInt();
        
        // if (num%2== 0) {  
        //     System.out.println("You entered a even number");
        // } else {
        //     System.out.println("You entered a odd number");
        // }
        
        // sc.close(); 


        // <-- checking number is greater,smaller,Zero or Equal-->

        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter Your First number: "); 
        
        // int num1 = sc.nextInt();
        // System.out.print("Enter Your Second number: "); 
        
        // int num2 = sc.nextInt();
        // if(num1==0 && num2==0){
        //     System.out.println("Entre The Number Greater Than 0");
        // }
        // else if (num1== num2) {  
        //     System.out.println("Both Number You have entered is Equal");
        // } else if(num1>num2) {
        //     System.out.println("Number One is Greater number than number two");
        // } else {
        //     System.out.println("Number two is Greater number than number one");
        // }
        
        // sc.close(); 


        // <-- checking number is greater,smaller,Zero or Equal in nested if else-->

    //     Scanner sc = new Scanner(System.in);
        
    //     System.out.print("Enter Your First number: "); 
        
    //     int num1 = sc.nextInt();
    //     System.out.print("Enter Your Second number: "); 
        
    //     int num2 = sc.nextInt();
    //     if(num1==0 && num2==0){
    //         System.out.println("Entre The Number Greater Than 0");
    //     }
    //     else{
           
    //         if(num1== num2){
    //             System.out.println("Both Number You have entered is Equal");

    //         }
    //         else if(num1>num2) {
    //            System.out.println("Number One is Greater number than number two");
    //        } else {
    //            System.out.println("Number two is Greater number than number one");
    //        }
    //     }
        
    //     sc.close(); 
    // }

     // <-- using switch case-->

    //     Scanner sc = new Scanner(System.in);
        
    //     System.out.print("Choose Your number(1,2,3): "); 
        
    //     int button = sc.nextInt();

    //     switch (button) {
    //         case 1 :
    //             System.out.println("Hello");
    //             break;
    //             case 2:
    //             System.out.println("Namaste");
    //             break;
    //             case 3:
    //             System.out.println("Bonjur");
    //             break;
    //         default:
    //             throw new AssertionError();
    //     }
        
        
    //     sc.close(); 
    // }


      // <-- Calcutalor using switch case-->

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre Your First Number: "); 
        
        int Number1 = sc.nextInt();
         
        System.out.print("Entre Your Second Number: "); 
        
        int Number2 = sc.nextInt();
        System.out.print("Entre Your Condition(for ex: +,-,%,/,*): "); 
        
        String Condition = sc.next();



        switch (Condition) {
            case "+" :
                System.out.println("The result is: "+ (Number1+Number2));
                break;
                case "-":
                System.out.println("The result is: "+ (Number1 - Number2));
             
                break;
                case "%":
                System.out.println("The result is: "+ Number1 % Number2);
               
                break;

                case "/":
                System.out.println("The result is: "+ Number1 / Number2);
               
                break;
                case "*":
                System.out.println("The result is: "+ (Number1 * Number2));
               
                break;
            default:
                throw new AssertionError();
        }
        
        
        sc.close(); 
    }
}
