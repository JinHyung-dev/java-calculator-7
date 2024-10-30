package calculator.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {

    public static List<Integer> parseInput(String input)
            throws IllegalArgumentException {
        String delimiter = parseDelimiter(input);
        String target = input;

        if (input.contains("//") || input.contains("\\n")) {
            target = replaceDelimiterMarker(input, delimiter);
        }

        List<String> parsedInput = Arrays.asList(target.split(delimiter));

        return parseStringArr(parsedInput);
    }

    static List<Integer> parseStringArr(List<String> parsedInput) {
        return parsedInput.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    static String parseCustomDelimiter(String input) {
        int startIndex = input.indexOf("//") + 2;
        int endIndex = input.indexOf("\\n", startIndex);
        return input.substring(startIndex, endIndex);
    }

    static String replaceDelimiterMarker(String input, String delimiter) {
        return input.replace("//" + delimiter + "\\n", "");
    }

    static String parseDelimiter(String input) throws IllegalArgumentException {

        if (input.contains("//") && input.contains("\\n")) {
            return parseCustomDelimiter(input);
        }

        if (input.contains(",")) {
            return ",";
        }

        if (input.contains(".")) {
            return ".";
        }

        throw new IllegalArgumentException("사용가능한 구분자가 아닙니다.");
    }
}
