package hw5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scan.nextLine();
        char[] letters = word.toCharArray();
        String firstLetter = String.valueOf(letters[0]);
        StringBuilder newWord = new StringBuilder(firstLetter.toUpperCase());
        for (int i = 1; i < letters.length; i++){
            String anotherLetter= String.valueOf(letters[i]);
            newWord.append(anotherLetter.toLowerCase());
        }
        System.out.println("Полученный результат: " + newWord);
    }
    }
