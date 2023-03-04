package java_homework.seminar5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

/*
 * Написать метод, определяющую правильность расстановки скобок в выражении.
 * Могут содержаться следующие скобки: ()[]{}<>
 * () -> true
 * []{}((<>)) -> true
 * ) -> false
 * [) -> false
 * []{}(<)> -> false
 */

public class task1_skobki {
    public static void main(String[] args) {

        HashMap<String, Integer> openBr = new HashMap<String, Integer>() {
            {
                put("{", 0);
                put("[", 1);
                put("(", 2);
            }
        };
        HashMap<String, Integer> closeBr = new HashMap<String, Integer>() {
            {
                put("}", 0);
                put("]", 1);
                put(")", 2);
            }
        };


        String text = "[,],{,},(,>,),<,)";
        boolean validate = validate(openBr, closeBr, text);

        if (validate) {
            System.out.println("Скобки расставлены правильно.");
        } else {
            System.out.println("Скобки расставлены не правильно.");
        }


        
    }

    public static boolean validate(HashMap<String, Integer> openBr,
            HashMap<String, Integer> closeBr,
            String text) {

        String[] strings = text.split(",");

        Deque<String> stack = new ArrayDeque<>();

        for (String inLine : strings) {

            for (int i = 0; i < inLine.length(); i++) {

                char character = inLine.charAt(i);
                String symbol = Character.toString(character);

                if (openBr.containsKey(symbol)) {
                    stack.push(symbol);

                } else if (closeBr.containsKey(symbol)) {

                    if (!stack.isEmpty()) {

                        Integer ordinalNumberForCheckedSymbol = closeBr.get(symbol);

                        String firstElemFromStack = stack.pop();
                        Integer ordinalLastAddedNumberElemFromStack = openBr.get(firstElemFromStack);
                        boolean isPairTheBrackets = ordinalLastAddedNumberElemFromStack.equals(ordinalNumberForCheckedSymbol);

                        if (isPairTheBrackets)
                            break;
                    }

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    
}
