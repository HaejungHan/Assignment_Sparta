package Assignment;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    // 속성(필드)영역
    private ArrayList<Double> resultArr = new ArrayList<>();// 사칙연산 결과값 저장 ArrayList 생성
    double result;

    // 생성자 영역
    public ArithmeticCalculator(ArrayList<Double> resultArr) {
        super(resultArr); // 부모 필드에 값 저장
    }

    // 메소드 영역
    public double calculate(int num1, int num2,String sign) { // calculate 메소드 생성 , 매개변수 3개

        if (sign.equals("+")) { // 사칙연산 기호 입력값과 "+"와 일치하면
            result = num1 + num2; // result 값은 num1 + num2
        } else if (sign.equals("-")) { // 사칙연산 기호 입력값과 "-"와 일치하면
            result = num1 - num2; // result 값은 num1 - num2
        } else if (sign.equals("*")) { // 사칙연산 기호 입력값과 "*"와 일치하면
            result = num1 * num2; // result 값은 num1 * num2
        } else if (sign.equals("/")) { // 사칙연산 기호 입력값과 "/"와 일치하면
            if ((num2 > num1) || (num2 == 0)) { // num2(두번쨰 정수)가 num1보다 크거나 0일 경우
                throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 " + num2 + " 은 입력될 수 없습니다."); // Exception 처리 + 해당문구 출력
            } else { // 아니라면
                result = num1 / num2; // result 값은 num1 / num2
            }
        } else {
            throw new ArithmeticException("연산기호를 잘못 입력하셨습니다."); // Exception 처리 + 해당문구 출력
        }
        return result; // result 반환
    }

}
