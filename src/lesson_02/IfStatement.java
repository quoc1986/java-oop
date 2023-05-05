package lesson_02;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        // 18 || 18-55 || 56>
        Scanner scanner = new Scanner(System.in);
        System.out.print("please insert your age: ");
        int clientAge = scanner.nextInt();

        if(clientAge < 18) {
            System.out.println("ko ban!!!");
        } else if (clientAge >=18 && clientAge <=55){
            System.out.println("Unlimited!");
        } else {
            System.out.println("2 chai!");
        }
    }
}
