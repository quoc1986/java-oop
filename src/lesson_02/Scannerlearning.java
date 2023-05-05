package lesson_02;

import java.util.Scanner;

public class Scannerlearning {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert a number: ");
        int inputNumber = scanner.nextInt();
        System.out.printf("your nunber is: %d\n", inputNumber);
    }
}
