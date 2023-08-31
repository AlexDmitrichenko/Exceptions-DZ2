package task01;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        try {

            if (num <= 0) {
                throw new InvalidNumberException("Некоректное число");
            }
            System.out.println("Число корректно");

        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}