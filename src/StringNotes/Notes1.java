package StringNotes;

public class Notes1 {
}
/*
String s1 = "Hello";
String s2 = "Hello"    // points to the same object in the String pool.
String s3 = new String("Hello");  // 'new' always creates a new object in the heap, even if the value already exists in SCP, it won't reuse it.
                                    //SCP -> (String Constant Pool), located inside Heap.
-----------------------
  Literal = shared in SCP (memory efficient)
  new = new object every time.
------------------------

        -IMPORTANT STRING METHODS-
       -----------------------------
       String str = "Java Programming";
    -> .length() - str.length() = 17
    -> .charAt(i) - str.charAt(2) = 'v'
    -> substring(0,4) - "Java"
    -> equals() - "java".equals("java") = true
    -> equalsIgnoreCase() - "java".equalsIgnoreCase("JAVA") = true
    -> compareTo() - "apple".compareTo("banana") = negative(lexicographic order)
    -> toUpperCase() - "java".toUpperCase() =   "JAVA"
    -> toLowerCase() - "JAVA".toLowerCase() = "java"
    -> trim() - removes leading & trailing spaces "   Java  ".trim() = "Java"

 */


/*
String is immutable in nature, once created a String can't be changed.
Why? = as String objects are stored in SCP and shared among multiple references. If one changes it affects all references.
 */

/*
 --------------
 String vs StringBuffer vs StringBuilder
 --------------

 -> Use String for constants
 -> Use StringBuilder for frequent changes(faster)
 -> Use StringBuffer for multi-threaded code
 */


/*
--------------------
COMMON STRING PROBLEMS
--------------------
a) [PALINDROME CHECK]
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");


b) [REVERSE STRING]
        String str = "hello";
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--) {
             rev += str.charAt(i);
         }
            System.out.println(rev); // "olleh"

c) [COUNT VOWELS]
        String str = "education";
        int count = 0;
        for(char c : str.toLowerCase().toCharArray()) {
            if("aeiou".indexOf(c) != -1) count++;
        }
        System.out.println(count); // 5

 d) [CHARACTER FREQUENCY]
        String str = "programming";
        int[] freq = new int[256];
        for(char c : str.toCharArray()) {
            freq[c]++;
        }
        for(int i=0; i<freq.length; i++) {
            if(freq[i] > 0) System.out.println((char)i + " : " + freq[i]);
        }
 */

/*
-----------------
STRING INPUT
-----------------
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();  // reads full line
String word = sc.next();      // reads one word

-----------------
STRING ARRAYS
-----------------
String[] names = {"Kabir", "Raj", "Manya"};
for(String n : names) {
    System.out.println(n);
}


---------------------------
STRING AS METHOD PARAMETERS
---------------------------
public static void greet(String name) {
    System.out.println("Hello, " + name);
}
 */

/*

---------------------------
JAVA EXCEPTIONAL HIERARCHY
---------------------------
Throwable
  ↳ Error (not recoverable, e.g., OutOfMemoryError)
  ↳ Exception
       ↳ Checked (IOException, SQLException)
       ↳ Unchecked (RuntimeException → NullPointerException, ArithmeticException)

============================
 -> Java Exception Types
============================

	1.	Checked (compile-time) → must handle
Example: IOException
	2.	Unchecked (runtime) → not compulsory
Example: NullPointerException

==============================
RuntimeException (Unchecked)
==============================

	•	NullPointerException
	•	ArithmeticException
	•	ArrayIndexOutOfBoundsException
	•	NumberFormatException

===================
Checked Exceptions
===================

	•	IOException
	•	SQLException
	•	ClassNotFoundException
        (Handled with try-catch or throws.)
 */


/*

=================
TRY-CATCH in Java
=================

-> Used for exception handling.
-> Prevents program crash by catching runtime errors.
-> Provides alternate flow of execution.

===================
Basic Syntax
===================

try {
    // code that may throw an exception
} catch (ExceptionType e) {
    // handle exception here
}

===================
How it Works
===================

1. Code inside try {} executes normally.
2. If exception occurs → control jumps to matching catch {}.
3. If no exception occurs → catch {} is skipped.

===================
Example
===================

try {
    int result = 10 / 0;   // ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Error: Cannot divide by zero!");
}

Output:
Error: Cannot divide by zero!

============================
Multiple Catch Blocks
============================

try {
    String str = null;
    System.out.println(str.length());  // NullPointerException
} catch (ArithmeticException e) {
    System.out.println("Math error!");
} catch (NullPointerException e) {
    System.out.println("Null value found!");
}

============================
Generic Catch (Superclass)
============================

try {
    int[] arr = {1, 2, 3};
    System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
} catch (Exception e) {
    System.out.println("Something went wrong: " + e.getMessage());
}

*/
