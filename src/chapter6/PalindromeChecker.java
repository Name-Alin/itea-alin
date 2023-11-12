package chapter6;

public class PalindromeChecker {
    public static void main(String[] args) {

        String word = "racecar";
        StringBuilder reversWords = new StringBuilder();
        char[] cr = word.toCharArray();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversWords.append(cr[i]);
        }

        if (word.equals(reversWords.toString().strip())) {
            System.out.println("Word " + word + " is palindrome");
        } else {
            System.out.println("Word " + word + " is NOT palindrome");
        }
    }
}
