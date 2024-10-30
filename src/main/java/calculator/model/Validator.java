package calculator.model;

import java.util.List;

public class Validator {

    public static void isValidInput(String input) throws IllegalArgumentException {
        if (isNullOrEmpty(input)) {
            throw new IllegalArgumentException("내용을 입력해야합니다.");
        }

        if (isCustomDelimiter(input)) {
            if (!isValidCustomDelimiter(input.substring(2, input.indexOf("\\n")))) {
                throw new IllegalArgumentException("입력가능한 특수문자 : !@#$%^&_+:;,<>./|?");
            }
            input = input.substring(input.indexOf("\\n") + 2);
        }

        if (!isValidCharacter(input)) {
            throw new IllegalArgumentException("계산 숫자가 잘못 입력되었습니다.");
        }

    }

    private static boolean isValidCustomDelimiter(String input) {
        return input.matches("^[!@#$%^&_+:;<>/|?]?$");
    }

    private static boolean isCustomDelimiter(String input) {
        return input.contains("\\") && input.contains("\\n");
    }

    public static void isLargerThanZero(List<Integer> numbers) throws IllegalArgumentException {
        for (Integer number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다: " + number);
            }
        }

    }

    static boolean isValidCharacter(String input) {
        return input.matches("^[0-9]+$[!@#$%^&_+:;,<>./|?]?$");
    }

    static boolean isNullOrEmpty(String input) throws IllegalArgumentException {
        return input.isEmpty() || input.trim().isEmpty();
    }
}
