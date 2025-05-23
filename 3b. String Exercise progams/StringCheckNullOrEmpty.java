//Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().


package String;

public class StringCheckNullOrEmpty {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        String input = "   ";
        if (isNullOrEmpty(input)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is not empty.");
        }
    }
}
