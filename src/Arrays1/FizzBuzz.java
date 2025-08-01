    // Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number
    // and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz",
    // and for multiples of both save "FizzBuzz".
    // Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
    //        Hint =>
    //        Create a String Array to save the results and
    //        Finally, loop again to show the results of the array based on the index position

            package Arrays1;
    import java.util.Scanner;
    public class FizzBuzz {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if(num<=0){
                System.out.println("Enter a number greater than 0.");
                return;
            }
            String[] resultArray = new String[num + 1];
            for(int i =1;i<=num;i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    resultArray[i] = "FizzBuzz";

                } else if (i % 5 == 0) {
                    resultArray[i] = "Buzz";

                } else if (i % 3 == 0) {
                    resultArray[i] = "Fizz";

                } else {
                    resultArray[i] = String.valueOf(i);

                }

                System.out.println("Position " + i + " = " + resultArray[i]);
            }
        }
    }
