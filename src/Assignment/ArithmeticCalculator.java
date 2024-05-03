package Assignment;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    // 속성(필드)영역
    // 포함관계 필드 +
    private final AddOperator addOperator; // 포함관계인 속성은 변하지 않기 때문에 상수로 숨김
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;
    double result;

    // 생성자 영역
    // 포함관계 생성자 +
    public ArithmeticCalculator(ArrayList<Double> resultArr, AddOperator addOperator, SubtractOperator subtractOperator, MultiplyOperator multiplyOperator, DivideOperator divideOperator) { // 생성자 초기화
        super(resultArr);
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
    }

    // 메소드 영역
    // 계산식 빼고 포함관계 메소드 호출
    public double calculate(int num1, int num2,String sign) { // calculate 메소드 생성 , 매개변수 3개

        if (sign.equals("+")) { // 사칙연산 기호 입력값과 "+"와 일치하면
            result = addOperator.operate(num1, num2); // result 값은 num1 + num2
        } else if (sign.equals("-")) { // 사칙연산 기호 입력값과 "-"와 일치하면
            result = subtractOperator.operate(num1, num2);// result 값은 num1 - num2
        } else if (sign.equals("*")) { // 사칙연산 기호 입력값과 "*"와 일치하면
            result = multiplyOperator.operate(num1, num2); // result 값은 num1 * num2
        } else if (sign.equals("/")) { // 사칙연산 기호 입력값과 "/"와 일치하면
            if ((num2 > num1) || (num2 == 0)) { // num2(두번쨰 정수)가 num1보다 크거나 0일 경우
                throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 " + num2 + " 은 입력될 수 없습니다."); // Exception 처리 + 해당문구 출력
            } else { // 아니라면
                result = divideOperator.operate(num1, num2); // result 값은 num1 / num2
            }
        } else {
            throw new ArithmeticException("연산기호를 잘못 입력하셨습니다."); // Exception 처리 + 해당문구 출력
        }
        return result; // result 반환
    }

}
