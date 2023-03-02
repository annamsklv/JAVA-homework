package java_homework.seminar2;
//// 1. Создать метод, который проверяет, является ли строка палиндромом.
public class task1_palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("шалаш")); // true
        System.out.println(isPalindrome("шашлык")); // false
    }

    private static boolean isPalindrome(String source) {
        String reversed = reverseIt(source);
        if (reversed.equalsIgnoreCase(source)) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverseIt(String source) {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--) {
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }
}
