import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        // Создаем объект класса Scanner для считывания ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Ввод первой строки
        System.out.print("Введите первую строку: ");
        String a = scanner.nextLine();

        // Ввод второй строки
        System.out.print("Введите вторую строку: ");
        String b = scanner.nextLine();

        // Сравниваем строки и выводим соответствующее сообщение
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // Закрываем объект Scanner
        scanner.close();
    }
}