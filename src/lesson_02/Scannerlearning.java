package lesson_02;

public class Scanner {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Please insert a number: ");
        int inputNumber = scanner.nextInt();
        System.out.printf("your nunber is: %d\n", inputNumber);
    }
}
