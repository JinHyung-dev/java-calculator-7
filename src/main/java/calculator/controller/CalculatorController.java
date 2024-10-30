package calculator.controller;

import calculator.model.Calculator;
import calculator.model.Parser;
import calculator.model.Validator;
import calculator.view.InputView;
import calculator.view.OutputView;
import java.util.List;

public class CalculatorController {
    private final Calculator calculator = new Calculator();
    private final OutputView view = new OutputView();

    public void run() {
        try {
            String input = InputView.request();
            Validator.isValidInput(input);

            List<Integer> parsedInput = Parser.parseInput(input);

            int result = calculator.calc(parsedInput);

            view.printResult(result);
        } catch (IllegalArgumentException e) {
            view.printError(e.getMessage());
            throw e;
        } catch (Exception e) {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
