package java_homework.seminar4;
// Реализовать консольное приложение, которое:

// Принимает от пользователя строку вида
// text~num

// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
import java.util.*;

public class task1_string_split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> resulList = new ArrayList<>();
        int arrSize = 100;
        
        for (int i = 0; i < arrSize; i++) {
            resulList.add(" ");    
        }
      
        Boolean run = true;

        while (run) {

            String text = sc.nextLine();
        
            if (text.toLowerCase().equals("stop")) {
                run = false;
            } 
            
            else if (text.toLowerCase().equals("toscreen")) {
                System.out.println(resulList.toString());     
            }
            else if (text.toLowerCase().contains("print")){
                String[] split = text.split("~");
                String numberString = split[1];
                int indexNumber = Integer.parseInt(numberString);
                System.out.println(resulList.get(indexNumber));
            }

            else {
                String[] split = text.split("~");
                String word = split[0];
                String numberString = split[1];
                int indexNumber = Integer.parseInt(numberString);
                resulList.add(indexNumber, word); 
            }

        }

        sc.close();

    }
}
