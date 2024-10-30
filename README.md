# java-calculator-precourse
입력한 문자열에서 숫자를 추출하여 더하는 계산기 구현 내용을 리팩토링

[기존 내용](https://github.com/JinHyung-dev/java-calculator-7/blob/dev/README.md)

## 기존 설계
### Model
* Calculator 클래스 : 파싱, 검증, 합계 계산

### View
* ConsoleView 클래스 : 사용자에게 요청 및 결과를 출력하는 클래스

### Controller
* CalculatorController 클래스 : 모델과 뷰를 연결

## 재설계
### Model
* Calculator 클래스 : 합계 계산
* Validator 클래스 : 입력값 검증
* Parser 클래스 : 입력값 파싱

### View
* InputView 클래스 : 사용자에게 입력을 요청하고 처리하는 클래스
* OutputView 클래스 : 사용자에게 내용을 출력하는 클래스

### Controller
* CalculatorController 클래스 : 모델과 뷰를 연결
