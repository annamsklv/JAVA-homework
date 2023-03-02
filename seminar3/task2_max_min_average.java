package java_homework.seminar3;
// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class task2_max_min_average {

    public static void main(String[] args) {
        ArrayList<Integer> random_lst = new ArrayList<>();
        Random f = new Random();
        for (int i = 0; i < 10; i++) {
            random_lst.add(f.nextInt(101));   
        }
        System.out.println(random_lst.toString()); 

        System.out.println("максимальное число: " + Collections.max(random_lst));
        System.out.println("минимальное число: " +Collections.min(random_lst));

        int summ = 0;
        for (int number : random_lst){
            summ += number;
        }

        int average = summ/random_lst.size();
        System.out.println("среднее арифметическое: " +average);

    }
    
}
