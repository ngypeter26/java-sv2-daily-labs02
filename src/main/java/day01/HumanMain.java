package day01;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class HumanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a neved!");
        String name = scanner.nextLine();

        System.out.println("Add meg a korod!");
        int age = scanner.nextInt();

        Human person = new Human(name,age);

        //new Human(name,age);   így is ott lesz a memóriában, de nem tudom megszólítani

        System.out.println("A te neved: " + person.getName() + "\n" +
                "A te korod: " + person.getAge());
    }
}
