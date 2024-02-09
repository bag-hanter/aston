import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Сложение
        int sum = a + b;
        System.out.println("Сумма: " + sum);

        // Вычитание
        int difference = a - b;
        System.out.println("Разность: " + difference);

        // Деление
        if (b != 0) {
            double division = (double) a / b;
            System.out.println("Деление: " + division);
        } else {
            System.out.println("Невозможно выполнить деление на ноль");
        }

        // Умножение
        int multiplication = a * b;
        System.out.println("Умножение: " + multiplication);
    }
}