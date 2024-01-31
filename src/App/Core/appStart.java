
//головний клас для взаємодії з користувачем
package App.Core;

import App.File.FileReadService;
import App.File.FileWriteService;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class appStart {
    public static void Start() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        FileWriteService fileWriteService = new FileWriteService();
        FileReadService fileReadService = new FileReadService();

        while (true) {
            // Вивід меню вибору дій
            System.out.println("Меню вибору дій:\n1. Створити та записати файл\n2. Читати файл\n3. Вийти");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Зчитуємо вибір користувача

            switch (choice) {
                case 1:
                    // Створення та запис файлу
                    System.out.println("Введіть назву файлу:");
                    String fileName = scanner.nextLine();
                    System.out.println("Введіть текстовий контент файлу:");
                    String content = scanner.nextLine();
                    fileWriteService.WriteToFile(fileName, content);
                    break;

                case 2:
                    // Читання файлу
                    System.out.println("Введіть назву файлу для читання:");
                    fileReadService.readFromFile(scanner.nextLine());
                    break;

                case 3:
                    // Вихід з програми
                    System.out.println("Програма завершує роботу.");
                    System.exit(0);

                default:
                    // Обробка невірного вибору
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }
}
