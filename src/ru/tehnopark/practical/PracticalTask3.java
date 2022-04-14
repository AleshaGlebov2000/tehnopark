package ru.tehnopark.practical;

import java.util.Random;
import java.util.Scanner;

public class PracticalTask3 {
    public static void main(String[] args) {
        gameQues();
        questGame();
    }
    public static void gameQues() {                       // ОДИН ТУР ИГРЫ
        System.out.println("Ваша задача угадать число");// ПРИГЛАШЕНИЕ
        System.out.println("Введите число от 0 до 9");

        int number;
        int inputNumber;
        int count; //СЧЕТЧИК
        int attempt = 3; //КОЛИЧЕСТВО ПОПЫТОК

        Random num = new Random();                   //загадываем число
        number = num.nextInt(9) + 1;           //
        System.out.println(number);// шпаргалка ЗАГАДАННОЕ ЧИСЛО
        count = 0;
        do {
            count++; //  СЧЕТЧИК ПОПЫТОК
            System.out.println("Попытка № " + count);
            Scanner scan_num = new Scanner(System.in);
            inputNumber = scan_num.nextInt(); //

            if (inputNumber > number) {
                System.out.println("Загаданное число меньше");
            } else if (inputNumber < number) {
                System.out.println("Загаданное число больше");
            }
        }
        while (inputNumber != number && count < attempt);

        if (inputNumber == number) {
            System.out.println("Вы угадали");
        } else {
            System.out.println("Game Over");
        }
    }
    public static void questGame() {        //СЫГРАТЬ ЕЩЕ РАЗ
        System.out.println("Повторить игру еще раз? ДА - 1 / НЕТ - 0");
        Scanner question = new Scanner(System.in);
        char answer;
        answer = question.next().charAt(0);

        if (answer == '1') {
            gameQues();
            questGame();
        } else if (answer == '0') {
            System.out.println("Bye");
        } else {
            questGame();
        }
        question.close();
    }
}






