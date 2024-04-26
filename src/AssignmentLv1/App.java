package AssignmentLv1;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Scanner를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
        Scanner sc = new Scanner(System.in); // 입력값 받는 Scanner 생성
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt(); // 첫 번째 숫자 입력값 생성
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt(); // 두 번째 숫자 입력값 생성
        // Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
        System.out.print("사칙연산 기호를 입력하세요: ");
        String operationStr = sc.next(); // 사칙연산 입력값 생성 (char타입으로는 scanner 입력값 저장 불가)
        char operationChar = operationStr.charAt(0); // char타입으로 변환하여 operationStr의 0번째 인덱스의 값을 변수에 저장

        // 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력합니다.
        // 1. if문으로 사칙연산
//        int result = 0; // 사칙연산 결과 초기화
//        if (Objects.equals(operationChar, +)) {
//            result = num1 + num2;
//        } else if (Objects.equals(operationChar, -)) {
//            result = num1 - num2;
//        } else if (Objects.equals(operationChar, "*")) {
//            result = num1 * num2;
//        } else if (Objects.equals(operationChar, "/")) {
//            if (num2 == 0){
//                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 O이 입력될 수 없습니다.");
//            } else {
//                result = num1 / num2;
//            }
//        } else {
//            System.out.println("잘못 입력하셨습니다. ");
//        }
//        System.out.println("결과: " + result);

        // 2. switch문으로 사칙연산
//        switch (operationChar) {
//            case "+":
//                result = num1 + num2;
//                break;
//            case "-":
//                result = num1 - num2;
//                break;
//            case "*":
//                result = num1 * num2;
//                break;
//            case "/":
//                result = num1 / num2;
//                break;
//            default:
//                System.out.println("잘못 입력하셨습니다.");
//        }
//        System.out.println("결과: " + result);







    }
}
