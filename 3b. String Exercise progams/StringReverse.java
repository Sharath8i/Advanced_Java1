//Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().

package String;

public class StringReverse {
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "JavaProgramming";
        System.out.println("Reversed string: " + reverseString(input));
    }
}
