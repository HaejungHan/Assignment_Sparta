package Assignment;

import java.util.ArrayList;
import java.util.Scanner;


public class Calculator {

    // 속성(필드) 영역
    // 상태 데이터 영역
    private ArrayList<Integer> resultArr = new ArrayList<>();
    int num1 = 0; // 입력값 정수 1
    int num2 = 0; // 입력값 정수 2
    String sign = ""; // 사칙연산 기호
    int result;

    // 생성자 영역
    public Calculator(ArrayList<Integer> resultArr) {
        this.resultArr = resultArr;
    }

    // 메소드 영역
    public ArrayList<Integer> getResult() {
        return resultArr;
    }

    public void setResult(int result) {
        this.resultArr = resultArr;
    }

    public int calculate(int num1, int num2, String sign) { // calculate 메소드 생성 , 매개변수 3개

        if (sign.equals("+")) { // 사칙연산 기호 입력값과 "+"와 일치하면
            result = num1 + num2; // result 값은 num1 + num2
        } else if (sign.equals("-")) { // 사칙연산 기호 입력값과 "-"와 일치하면
            result = num1 - num2; // result 값은 num1 - num2
        } else if (sign.equals("*")) { // 사칙연산 기호 입력값과 "*"와 일치하면
            result = num1 * num2; // result 값은 num1 * num2
        } else if (sign.equals("/")) { // 사칙연산 기호 입력값과 "/"와 일치하면
            if ((num2 > num1) || (num2 == 0)) { // num2(두번쨰 정수)가 num1보다 크거나 0일 경우
                throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에" + num2 + "은 입력될 수 없습니다."); // Exception 처리 + 해당문구 출력
            } else { // 아니라면
                result = num1 / num2; // result 값은 num1 / num2
            }
        } else {
            throw new ArithmeticException("연산기호를 잘못 입력하셨습니다."); // Exception 처리 + 해당문구 출력
        }
        return result; // result 반환
    }

}

class App { // App클래스 시작
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ArrayList<>()); // Calculator 인스턴스 생성
        Scanner sc = new Scanner(System.in); // 입력값 받는 Scanner 생성

        do { // do 구문은 무조건 실행

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // 첫 번째 숫자 입력값 생성
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // 두 번째 숫자 입력값 생성

            System.out.print("사칙연산 기호를 입력하세요: ");
            String sign = sc.next(); // 사칙연산 입력값 생성 (char타입으로는 scanner 입력값 저장 불가)
            char operationChar = sign.charAt(0); // char타입으로 변환하여 operationStr의 0번째 인덱스의 값을 변수에 저장


//            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
//            String removeValue = sc.next(); // remove 여부 입력값 생성
//            if (removeValue.equals("remove")) { //  입력값이 remove와 같다면
//                resultArr.remove(0); // 인덱스번호 0 (가장 먼저 저장된 값) 삭제
////                System.out.println(resultArr.toString()); // 배열 인덱스0번의 값이 제거되었는지 확인
//            }
//
//            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
//            String showResult = sc.next(); // inquiry 여부 입력값 생성
//            if (showResult.equals("inquiry")) { // 입력값이 inquiry와 같다면
//                for (Integer showAll : resultArr) { // 향상된 for반복문으로 배열의 값 전체 조회
//                    System.out.println("저장된 결과 : " + showAll);
//                }
//            }
            int result = calculator.calculate(num1, num2, sign);// 입력값 calculate 메소드호출하여 실행
            calculator.getResult().add(result); // getResult 메소드를 통해 값 저장
//            System.out.println("저장된 값 : " + calculator.getResult()); // 값이 배열에 잘 들어갔는지 확인
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while (!(sc.next().equals("exit"))); // exit 입력하지 않을 경우 do문으로 가서 실행
    }

} // App 클래스 끝






