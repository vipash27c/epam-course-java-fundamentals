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
        //welcomeUser();

        // task 2
        //displayDataInReverseOrder();

        // task 3
        displayRandomValues();
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

    // 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
    private static void displayRandomValues() {
        System.out.println("--------------- TASK 3 ---------------");
        int length = setLengthOfArray();
        int[] array = getArrayOfRandomValues(length);
        System.out.println("Output numbers with a new line transition: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.print("Output numbers without switching to a new line: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // 3.1. Метод возвращает значение переменной типа int, которое >= 0. Значение переменной будет задавать размер массива.
    private static int setLengthOfArray() {
        Scanner scanner = null;
        int amount = 0;
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("Set amount of random numbers: ");
            if (scanner.hasNextInt()) {
                amount = scanner.nextInt();
                if (amount >= 0) {
                    break;
                } else {
                    System.out.println("Input wrong data! Repeat please.");
                }
            } else {
                System.out.println("Input wrong data! Repeat please.");
            }
        }
        return amount;
    }

    // 3.2. Метод возвращает массив типа int, элементы которого инициализированы рандомными значениями в диапозоне [0; 100).
    private static int[] getArrayOfRandomValues(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
