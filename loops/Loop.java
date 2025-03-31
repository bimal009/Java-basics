import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        // for (int i = 0; i <= 10; i++) {
        //     System.out.println("The Number is: " + i);
        // }

//  WHILE LOOP

        // int i=0;
    // while(i<=10){
    //         System.out.println("The Number is: " + i);
    // // i=i+1; 
    // i++;
    // }
 
//  DO WHILE LOOP

// do{
//             System.out.println("The Number is: " + i);
// i++;
// }while(i<=10);

// SUM OF N NATURAL NUMBERS

// Scanner sc= new Scanner(System.in);
// System.out.println("Entre a number");
// int num = sc.nextInt();

//      int sum=0;
// for(int i=1;i<=num;i++){
//      sum = sum + i;
// }
//      System.out.println("The sum is:" + sum);


// TABLE OF A GIVEN NUMBER

 Scanner sc= new Scanner(System.in);
System.out.println("Entre a number");
int num = sc.nextInt();

for(int i=1; i<=10;i++){
    System.out.println(num +"*"+ i+"=" + (num*i));
}


    }
}
