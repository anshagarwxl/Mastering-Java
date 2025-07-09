    package Methods1;
    import java.util.Scanner;
    public class SmallestAndLargest2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number1-> ");
            int number1 = sc.nextInt();
            System.out.println("Enter number2 -> ");
            int number2 = sc.nextInt();
            System.out.println("Enter number3 -> ");
            int number3 = sc.nextInt();
            if (number1 == number2 && number2 == number3) {
                System.out.println("All three numbers are equal: " + number1);
            } else {
                int[] result = checkNumber(number1, number2, number3);
                int smallest = result[0];
                int largest = result[1];

                System.out.println("From the 3 entered numbers (" + number1 + ", " + number2 + ", " + number3 + "):");
                System.out.println("The smallest number is: " + smallest);
                System.out.println("The largest number is: " + largest);
            }
        }

        public static int[] checkNumber(int number1, int number2, int number3) {
            int smallest = number1;
            int largest = number1;

            if (number2 < smallest) smallest = number2;
            if (number3 < smallest) smallest = number3;

            if (number2 > largest) largest = number2;
            if (number3 > largest) largest = number3;

            return new int[]{smallest, largest};
        }
    }

