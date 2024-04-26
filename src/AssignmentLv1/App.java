package AssignmentLv1;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 1. Scanner를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
        Scanner sc = new Scanner(System.in); // 입력값 받는 Scanner 생성
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt(); // 첫 번째 숫자 입력값 생성
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt(); // 두 번째 숫자 입력값 생성
        // 2. Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
        System.out.print("사칙연산 기호를 입력하세요: ");
        String operationStr = sc.next(); // 사칙연산 입력값 생성 (char타입으로는 scanner 입력값 저장 불가)
        char operationChar = operationStr.charAt(0); // char타입으로 변환하여 operationStr의 0번째 인덱스의 값을 변수에 저장

        // 3. 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력합니다.
       //  1) if문으로 사칙연산
        int result = 0; // 사칙연산 결과 초기화
        if (operationStr.equals("+")) { // 사칙연산 기호 입력값과 "+"와 일치하면
            result = num1 + num2; // result 값은 num1 + num2
        } else if (operationStr.equals("-")) { // 사칙연산 기호 입력값과 "-"와 일치하면
            result = num1 - num2; // result 값은 num1 - num2
        } else if (operationStr.equals("*")) { // 사칙연산 기호 입력값과 "*"와 일치하면
            result = num1 * num2; // result 값은 num1 * num2
        } else if (operationStr.equals("/")) { // 사칙연산 기호 입력값과 "/"와 일치하면
            if (num2 == 0){ // num2(두번쨰 정수)에 0을 입력했다면
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 O이 입력될 수 없습니다."); // 해당 출력
            } else { // 아니면
                result = num1 / num2; // result 값은 num1 / num2 출력됨
            }
        } else {
            System.out.println("잘못 입력하셨습니다. "); // 그 밖에는 해당 출력
        }
        System.out.println("결과: " + result); // 결과값 출력

       // 2) switch문으로 사칙연산
//        int result = 0; // 사칙연산 결과 초기화
//        switch (operationStr) { // 사칙연산 기호의 입력값과 case별 비교
//            case "+": // 사칙연산 기호 입력값과 + 가 일치한다면
//                result = num1 + num2; // result 값은 num1 + num2
//                break; // 그리고 종료
//            case "-": // 사칙연산 기호 입력값과 - 가 일치한다면
//                result = num1 - num2; // result 값은 num1 - num2
//                break;
//            case "*": // 사칙연산 기호 입력값과 * 가 일치한다면
//                result = num1 * num2; // result 값은 num1 * num2
//                break;
//            case "/": // 사칙연산 기호 입력값과 / 가 일치한다면
//                if (num2 == 0){ // num2 (두번째 정수)에 0을 입력했다면
//                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 O이 입력될 수 없습니다."); // 해당 출력
//                 } else { // 아니면
//                result = num1 / num2; // result 값은 num1 / num2
//                }
//                break;
//            default:
//                System.out.println("잘못 입력하셨습니다."); // 그 밖에 해당 출력
//        }
//        System.out.println("결과: " + result); // 결과값 출력








    }
}
