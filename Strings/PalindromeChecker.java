public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        String word = System.console().readLine();
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
