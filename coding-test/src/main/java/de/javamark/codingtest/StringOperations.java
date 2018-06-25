package de.javamark.codingtest;

public class StringOperations {

    public static String capitalizeFirstCharacter(final String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("method awaits a string (min length 2) as input");
        }
        return Character.toUpperCase(input.charAt(0)) + input.substring(1);
    }

}
