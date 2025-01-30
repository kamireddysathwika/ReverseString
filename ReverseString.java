public class ReverseString{
    public static void main(String[] args) {
        // Input string
        String input = "Hello, World!";
        
        // Call the method to reverse the string
        String reversed = reverseString(input);
        
        // Print the reversed string
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverseString(String str) {
        // Use a StringBuilder to reverse the string
        StringBuilder reversed = StringBuilder(str);
        return reversed.reverse().toString();
    }
}

