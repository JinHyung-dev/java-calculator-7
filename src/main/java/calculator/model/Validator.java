package calculator.model;

import java.util.List;

public class Validator {

    public static void isValidInput(String input) throws IllegalArgumentException {
        if (!isNotNullOrEmpty(input)) {
            throw new IllegalArgumentException("내용을 입력해야합니다.");
        }

        if (!isValidCharacter(input)) {
            throw new IllegalArgumentException("가능한 글자만 입력해야 합니다.(입력가능한 특수문자 : !@#$%^&_+:;,<>./|?)");
        }

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

    static boolean isNotNullOrEmpty(String input) throws IllegalArgumentException {
        return input.isEmpty() || input.trim().isEmpty();
    }
}
