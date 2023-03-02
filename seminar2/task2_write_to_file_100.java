package java_homework.seminar2;

import java.io.IOException;
// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.
import java.nio.file.Files;
import java.nio.file.Path;

public class task2_write_to_file_100 {

    public static void main(String[] args) throws IOException {
        // File note = new File("file.txt");
        // Path note = Path.of("java_homework/seminar2/task2_write_to_file_100.java");
        Path file = Path.of("file.txt");
        try {
            Files.createFile(file);
        } catch (IOException e) {
            System.out.println("Файл уже существует!");
        }

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            text.append("TEST");
        }

        Files.writeString(file, text);
    }

}
