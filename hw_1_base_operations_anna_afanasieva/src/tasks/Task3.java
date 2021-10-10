package tasks;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер урока от 1 до 10: ");
        int lesson = in.nextInt();
        timeOfLesson(lesson);

    }

    private static void timeOfLesson(int lesson) {

        int time = 540 + 45 * lesson + (lesson - 1) * 5 + (lesson / 2) * 10 - ((lesson - 1) % 2) * 10;
        System.out.println("Время окончания урока " + time / 60 + ":" + time % 60);

    }

}
