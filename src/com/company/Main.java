package com.company;

import java.util.Scanner;

public class Main {
    public static String findMin(String[] stroke) {
        int min = stroke[0].length();//длина минимального слова
        String minWord = stroke[0];//минимальное слово
        for (int i = 1; i < stroke.length; i++) {//поле в классе, то есть по сути это какая-то переменная в классе
            if (stroke[i].length() < min) {
                min = stroke[i].length();//метод в классе
                minWord = stroke[i];
            }
        }
        return minWord;
    }

    public static String findMax(String[] stroke) {
        int max = stroke[0].length();
        String maxWord = stroke[0];
        for (int i = 1; i < stroke.length; i++) {
            if (stroke[i].length() > max) {
                max = stroke[i].length();
                maxWord = stroke[i];
            }
        }
        return maxWord;
    }

    public static int amountSentences(String[] stroke) {
        int count = 0;
        for (int i = 0; i < stroke.length; i++) {
            char[] word = stroke[i].toCharArray();
            for (int j = 0; j < word.length; j++) {
                if (word[j] == '.' || word[j] == '!' || word[i] == '?') {
                    count++;
                }
            }
        }
        return count;
    }

    public static String uniqueChars(String[] stroke) {
        String unique = "";
        String newStroke = "";
        for (int i = 0; i < stroke.length; i++) {
            newStroke += stroke[i];
        }
        char[] allWords = newStroke.toCharArray();
        for (int i = 0; i < allWords.length; i++) {
            if (unique.indexOf(allWords[i]) == -1) {
                unique += allWords[i];
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stroke = scanner.nextLine().split(" ");
        System.out.println(stroke.length);//количество слов
        System.out.println("Минимальное по длине слово = " + findMin(stroke));
        System.out.println("Максимальное по длине слово = " + findMax(stroke));
        System.out.println("Колличество предложений =" + amountSentences(stroke));
        System.out.println(uniqueChars(stroke));
    }
}