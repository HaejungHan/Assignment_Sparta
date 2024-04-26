package AssignmentLv1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 5. 연산 결과 10개를 저장할 수 있는 배열을 선언 및 생성하고 연산의 결과를 저장합니다.
        Scanner sc = new Scanner(System.in); // 입력값 받는 Scanner 생성

        int result = 0; // 사칙연산 결과 초기화
        boolean stop = false; // 반복문 실행 여부 변수 생성


        do { // do 구문은 무조건 실행
                int[] resultArr = new int[4]; // 결과값이 입력될 배열생성
                int count = 0;

                for (int i = 0; i < resultArr.length; i++) {
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
                        if ((num2 > num1) || (num2 == 0)) { // num2(두번쨰 정수)가 num1보다 크거나 0일 경우
                            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 " + num2 + "은 입력될 수 없습니다."); // 해당 출력
                            break; // 종료
                        } else { // 아니면
                            result = num1 / num2; // result 값은 num1 / num2 출력됨
                        }
                    } else {
                        System.out.println("잘못 입력하셨습니다. "); // 그 밖에는 해당 출력
                    }
                    System.out.println("결과: " + result); // 결과값 출력
                    if (count == resultArr.length) {
                        for (int j = 1; j < resultArr.length + count; j++) {
                            resultArr[j - 1] = resultArr[j];
                        } count++;
                    } else {
                    resultArr[i] = result;
                    }
                    System.out.println(Arrays.toString(resultArr)); // 결과값이 잘 들어갔는지 확인
//                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");

                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    String exitStr = sc.next(); // 종료 여부 입력값 생성
                    if (!(exitStr.equals("exit"))) { // exitStr초기값  false, 입력값이 exit가 아니라면
                        stop = true; // 반복문 실행
                    } else { // 입력값이 exit라면
                        break; // do-while 반복문 종료
                    }
        }
        } while (stop); // stop의 true/false 여부에 따라 do 구문 실행
    }
}
