package AssignmentLv1;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 4. 반복문을 사용하여 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정합니다.
        // do-while 반복문 + 중첩 if 조건문

        Scanner sc = new Scanner(System.in); // 입력값 받는 Scanner 생성


        int result = 0; // 사칙연산 결과 초기화
        boolean stop; // 반복문 실행 여부 변수 생성

        do { // do 구문은 무조건 실행
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // 첫 번째 숫자 입력값 생성
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // 두 번째 숫자 입력값 생성

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operationStr = sc.next(); // 사칙연산 입력값 생성 (char타입으로는 scanner 입력값 저장 불가)
            char operationChar = operationStr.charAt(0); // char타입으로 변환하여 operationStr의 0번째 인덱스의 값을 변수에 저장

            if (operationStr.equals("+")) { // 사칙연산 기호 입력값과 "+"와 일치하면
                result = num1 + num2; // result 값은 num1 + num2
            } else if (operationStr.equals("-")) { // 사칙연산 기호 입력값과 "-"와 일치하면
                result = num1 - num2; // result 값은 num1 - num2
            } else if (operationStr.equals("*")) { // 사칙연산 기호 입력값과 "*"와 일치하면
                result = num1 * num2; // result 값은 num1 * num2
            } else if (operationStr.equals("/")) { // 사칙연산 기호 입력값과 "/"와 일치하면
                if ((num2 > num1) && (num2 == 0)) { // num2(두번쨰 정수)가 num1보다 클 경우
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 " + num2 + "은 입력될 수 없습니다."); // 해당 출력
                    break;
                } else { // 아니면
                    result = num1 / num2; // result 값은 num1 / num2 출력됨
                }
            } else {
                System.out.println("잘못 입력하셨습니다. "); // 그 밖에는 해당 출력
            }
            System.out.println("결과: " + result); // 결과값 출력
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitStr = sc.next(); // 종료 여부 입력값 생성
            if (!(exitStr.equals("exit"))) { // exitStr초기값  false, 입력값이 exit가 아니라면
                stop = true; // 반복문 실행
            } else { // 입력값이 exit라면
                stop = false; // 반복문 종료
            }
        } while (stop); // stop의 true/false 여부에 따라 do 구문 실행




    }
}
