package calculator.model;

import java.util.Arrays;

public class Calculator {
    public int calc(int[] arr) throws IllegalArgumentException {
        if (arr.length == 1) {
            return sum(new int[]{0, arr[0]});
        }

        return sum(arr);
    }

    public int sum(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    int[] convertToIntArray(String[] stringNumbers) {
        return Arrays.stream(stringNumbers)
                .mapToInt(number -> {
                    int num = Integer.parseInt(number);
                    if (num < 0) {
                        throw new IllegalArgumentException("음수는 허용되지 않습니다: " + num);
                    }
                    return num;
                })
                .toArray();
    }

}
