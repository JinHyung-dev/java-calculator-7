package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String request() {
        System.out.print("계산할 숫자를 입력하세요 (쉼표 또는 콜론) : ");
        String input = Console.readLine();

        while (input.trim().isEmpty()) {
            System.out.print("입력이 비어있습니다. 다시 입력하세요: ");
            input = Console.readLine();
        }
        return input;
    }

}
