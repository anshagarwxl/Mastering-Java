package ctrlflowlevel2; ////Create a program to print odd and even numbers between 1 to the number entered by the user.
////Hint =>
////Get an integer input from the user, assign to a variable number and check for Natural Number
////Using a for loop, iterate from 1 to the number
////In each iteration of the loop, print the number is odd or even number
//package forloop;
//import java.util.Scanner;
//public class ctrlflowlevel2.oddandeven {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        if(num>=1) {
//            System.out.println("It is a natural number, so we can proceed with the program.");
//            for(int i=1; i<=num; i++){
//                if(i%2==0){
//                    System.out.println(i+" is an even number.");
//                }
//                else {
//                    System.out.println(i+ " is an odd number.");
//                }
//            }
//        }
//        else{
//            System.out.println("Please enter a natural number.");
//        }
//    }
//}


import java.util.Scanner;
public class oddandeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num >= 1) {
            System.out.println("We can proceed with the program further, as the number entered by the user is a natural number.");
            int i = 1;
            while (i <= num) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
                i++;
            }
        } else {
            System.out.println("Please enter a natural number to proceed further.");
        }
    }
}
