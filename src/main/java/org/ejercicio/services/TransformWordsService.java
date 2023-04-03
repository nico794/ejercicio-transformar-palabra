package org.ejercicio.services;

public class TransformWordsService {
    private static final String suffix = "ay";

    public static String transform(String input) {
        if (input.isEmpty()) {
            return "";
        }

        String[] words = input.split(" ");

        if (words.length == 1) {
            return transformWord(input);
        }

        String result = "";
        String firstWord = words[0];

        String wordTransformed = transformWord(firstWord);
        result = result.concat(wordTransformed);

        for (int i = 1; i < words.length; i++) {
            result = result.concat(" ");

            wordTransformed = transformWord(words[i]);
            result = result.concat(wordTransformed);
        }
        return result;
    }

    private static String transformWord(String word) {
        char firstLetter = word.charAt(0);

        return capitalize(word.substring(1) + firstLetter + suffix);
    }

    private static String capitalize(String word) {
        char firstLetter = Character.toUpperCase(word.charAt(0));

        return firstLetter + word.substring(1);
    }
}
