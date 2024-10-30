package calculator.view;

public class OutputView {


    public void printResult(int result) {
        System.out.println("결과 : " + result);
    }

    public void printError(String message) {
        System.err.println("에러가 발생하여 프로그램을 종료합니다.(" + message + ")");
    }
}
