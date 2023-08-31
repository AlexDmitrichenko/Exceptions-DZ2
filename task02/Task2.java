package task02;

import java.util.Scanner;

import task01.InvalidNumberException;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        try {

            if (num2 == 0) {
                throw new InvalidNumberException("Деление на ноль недопустимо");
            }
            System.out.println("Результат деления: " + (num1/num2));

        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
