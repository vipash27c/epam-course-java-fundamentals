import java.util.Scanner;

public class Program {

    /*Реализовать следующие программы:
    1. Приветствовать любого пользователя при вводе его имени через командную строку.
    2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
    3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
    4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
    5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.*/

    public static void main(String[] args) {
        // task 1
        welcomeUser();

        // task 2
        displayDataInReverseOrder();
    }

    // 1. Приветствовать любого пользователя при вводе его имени через командную строку.
    private static void welcomeUser() {
        System.out.println("--------------- TASK 1 ---------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + "!");
    }

    // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
    private static void displayDataInReverseOrder() {
        System.out.println("--------------- TASK 2 ---------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String line = scanner.nextLine();
        System.out.print("Output: ");
        for (int i = line.length() - 1; i >= 0; i--) {
            System.out.print(line.charAt(i));
        }
    }

}
