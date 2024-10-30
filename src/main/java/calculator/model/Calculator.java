package calculator.model;

import java.util.List;

public class Calculator {
    public int calc(List<Integer> numbers) throws IllegalArgumentException {
        Validator.isLargerThanZero(numbers);
        return sum(numbers);
    }

    public int sum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

}
