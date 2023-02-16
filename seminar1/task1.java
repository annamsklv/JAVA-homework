package java_homework.seminar1;

public class task1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isPositive(5)); // true
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println(isLeapYear(2024)); //true
        System.out.println(createArray(4, 8));// не работает
        String[] stringArray = {"aaa", "aab", "aa"};
        System.out.println(findCommonPrefix(stringArray)); // aa
        String[] stringArray2 = {"abc", "bca", "cda"};
        System.out.println(findCommonPrefix(stringArray2)); // ""
    }

    private static boolean isSumBetween10And20(int a, int b) {

        int summ = a + b;
        if (summ >= 10 && summ <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPositive(int x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printString(String source, int repeat) {
        StringBuilder multi = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            multi.append(source);
        }
        System.out.println(multi);
    }

    private static boolean isLeapYear(int year) {
        if ( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ) ){
            return true;
        }
        else{
            return false;
        }
    }
    private static int[] createArray(int len, int initalValue) {
        int [] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initalValue;
        }
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        return array;
    }
    
    private static String findCommonPrefix(String[] source) {
        if (source.length == 0) return "";
        String prefix = "";
        int min_length = source[0].length();
        for (int i = 0; i < source.length; i++) {
            if(source[i].length() < min_length) min_length = source[i].length();   
        }
        int count = 0;
        while(count < min_length){
            int temp = 0;
            for (int i = 0; i < source.length - 1; i++) {
                String a = source[i];
                a = a.substring(count, count+1);
                String b = source[i+1];
                b = b.substring(count, count+1);
                if(a.equals(b))
                temp++;   
            }
            if(temp == source.length - 1){
                String letters = source[1];
                letters = letters.substring(count, count+1);
                prefix += letters; 
            }
            else return prefix;
            count++;
        }
        return prefix;

    }

}
