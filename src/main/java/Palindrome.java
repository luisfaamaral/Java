public class Palindrome {
    public static boolean isPalindrome(String word) {
        int len = word.length();

        word = word.toUpperCase();

        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - i - 1)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}