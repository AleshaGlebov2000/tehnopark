//package Lesson_3;
//
//public class Zadanie {
//    public static void main(String[] args){
//            throws java.io.IOException {
//            char letter = 'q';
//            char probel = ' ';
//            char input;
//            int count = 0;
//            System.out.println("Введите букву");
//            do {
//                input = (char) System.in.read();
//                if (input == letter) {
//                    System.out.println("Вы угадали");
//                } else if (input == probel) {
//                    count++;
//                    System.out.println("Пробел");
//                } else {
//                    System.out.println("Попробуйте еще раз");
//                }
//            }
//            while (letter != input);
//            System.out.println("Счетчик пробелов: " + count);
//        }
//    }