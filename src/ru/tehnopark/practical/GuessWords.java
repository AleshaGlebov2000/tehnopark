package ru.tehnopark.practical;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class GuessWords {
    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "mellon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int rand = random.nextInt(24);
        String answer;
        Boolean win = false;

        System.out.println(words[rand]);// подсказка
        System.out.println("Угадай слово");

        do {
            System.out.println("Введите слово");

            answer = sc.nextLine();
            System.out.println();
            if (words[rand].equals(answer.toLowerCase())) {
                win = true;
            }

            if (!win) {
                System.out.println("Не угадали. Попробуйте еще раз");
                for (int i = 0; i < words[rand].length(); i++) {
                    if (answer.length() > i && words[rand].length() > i && answer.charAt(i) == words[rand].charAt(i)) {
                        sb.append(answer.charAt(i));
                    } else sb.append("#");

                }
                System.out.println(sb.toString());
                sb.delete(0, sb.length());
            }
        }
        while (!words[rand].equals(answer.toLowerCase()));{
        System.out.println("Yes");
    }
    }
}

//(word.charAt(n) == words[i].charAt(n)