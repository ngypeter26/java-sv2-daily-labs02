package day02;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a nevet!");


        String inputName = scanner.nextLine();

        Terminator terminator = new Terminator("Bill",12);

        System.out.println(terminator.greetingSomebody(inputName));

    }
}
