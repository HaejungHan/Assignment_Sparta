package Assignment;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> resultArr = new ArrayList<>();// result 값 저장할 Arraylist 생성 + 선언
    // 속성(필드) 영역
    // 상태 데이터 영역
    int num1 = 0; // 입력값 정수 1
    int num2 = 0; // 입력값 정수 2
    String sign = ""; // 사칙연산 기호
    int result;

    // 생성자 영역
    public Calculator() {

    }

    // 메소드 영역
    public int calculate (int num1, int num2, String sign) { // calculate 메소드 생성 , 매개변수 3개

        if (sign.equals("+")) { // 사칙연산 기호 입력값과 "+"와 일치하면
            result = num1 + num2; // result 값은 num1 + num2
        } else if (sign.equals("-")) { // 사칙연산 기호 입력값과 "-"와 일치하면
            result = num1 - num2; // result 값은 num1 - num2
        } else if (sign.equals("*")) { // 사칙연산 기호 입력값과 "*"와 일치하면
            result = num1 * num2; // result 값은 num1 * num2
        } else if (sign.equals("/")) { // 사칙연산 기호 입력값과 "/"와 일치하면
            if ((num2 > num1) || (num2 == 0)) { // num2(두번쨰 정수)가 num1보다 크거나 0일 경우
               throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에" + num2 + "은 입력될 수 없습니다.");
            } else {
                result = num1 / num2; // result 값은 num1 / num2
            }
        } else {
            throw new ArithmeticException("연산기호를 잘못 입력하셨습니다."); // Exception 처리 + 해당문구 출력
        }
        System.out.println("결과: " + result);
        resultArr.add(result); // 결과값 저장
//        System.out.println("저장된 배열 : " + resultArr); // 배열에 저장되었는지 확인
        return result; // result 반환
    }

}





