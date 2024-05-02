package Assignment;

import java.util.ArrayList;
import java.util.Scanner;


public class Calculator {

    // 속성(필드) 영역
    // 상태 데이터 영역
    private ArrayList<Double> resultArr2 = new ArrayList<>(); // 원의 넓이 결과값 저장 ArrayList 생성
    private ArrayList<Integer> resultArr1 = new ArrayList<>();// 사칙연산 결과값 저장 ArrayList 생성
    double result;
    final double PI = 3.14; // 원의 넓이를 구하기 위해선 3.14는 고정되어 있기 때문에 더이상 바뀌지 않는다는 의미에서 final제어자 사용

    // 생성자 영역
    public Calculator(ArrayList<Double> resultArr2,ArrayList<Integer> resultArr1) { // 생성자 변경
        this.resultArr2 = resultArr2;
        this.resultArr1 = resultArr1;
    }

    // 메소드 영역
    public Double calculate (double radius) { // 원의넓이 계산 구현 (메소드 오버로딩)
        double result = PI * radius * radius;
        return result;
    }

    public ArrayList<Double> getCircleResult() { // 원의 넓이 결과값 조회 메소드 getter 생성
        return resultArr2;
    }

     public void setCircleResult(Double result) { // (원의넓이)매개변수 결과값 받아서 수정 setter 생성
        this.resultArr2 = resultArr2; // 배열에서 수정
    }

    public ArrayList<Integer> getResult() { // 사칙연산 결과값 조회 메소드 getter 생성
        return resultArr1; // 결과값 Array로 반환
    }

    public void setResult(int result) { // (사칙연산)매개변수 결과값 받아서 수정 setter 생성
        this.resultArr1 = resultArr1; // 배열에서 수정
    }
    public void removeResult(int index) { // 매개변수 index번호 받아서 배열의 결과값 삭제
        this.resultArr1.remove(index); // 배열에서 APP클래스에서 지정된 인덱스번호대로 결과값 삭제
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
                throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 " + num2 + " 은 입력될 수 없습니다."); // Exception 처리 + 해당문구 출력
            } else { // 아니라면
                result = num1 / num2; // result 값은 num1 / num2
            }
        } else {
            throw new ArithmeticException("연산기호를 잘못 입력하셨습니다."); // Exception 처리 + 해당문구 출력
        }
        return (int)result; // result 반환
    }

}

class App { // App클래스 시작
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ArrayList<>(),new ArrayList<>()); // Calculator 인스턴스 생성 Double, Integer 2개
        Scanner sc = new Scanner(System.in); // 입력값 받는 Scanner 생성

        do { // do 구문은 무조건 실행

            System.out.println("사칙연산(1)/원의넓이(2) 계산타입을 입력하세요 (입력 1 또는 2 만 가능): ");
            int type = sc.nextInt(); // 계산타입 입력값 생성
            if (type == 2) { // 2번 입력시 원의 넓이 계산
                System.out.println("반지름 길이를 입력하세요: ");
                Double radius = sc.nextDouble(); // 반지름 길이 입력값 생성
                double result = calculator.calculate(radius); // 원의넓이 계산 결과값은 result
                calculator.getCircleResult().add(result); // 원의 넓이 result 값 받아서 resultArr2에 저장
//                System.out.println("원의 넓이 저장된 값 : " + calculator.getCicleResult()); // 원의 넓이 결과값 확인
//                System.out.println("원의 넓이 결과 값을 전체조회 합니다. "); // 안내 글 출력
                for (Double showAllOfCicle : calculator.getCircleResult()) { // 향상된 for반복문으로 배열의 값 전체 조회
                    System.out.println("원의 넓이 저장된 결과 : " + showAllOfCicle);
                }
            }

            // 1번 입력시 사칙연산 계산
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // 첫 번째 숫자 입력값 생성
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // 두 번째 숫자 입력값 생성

            System.out.print("사칙연산 기호를 입력하세요: ");
            String sign = sc.next(); // 사칙연산 입력값 생성 (char타입으로는 scanner 입력값 저장 불가)
            char operationChar = sign.charAt(0); // char타입으로 변환하여 operationStr의 0번째 인덱스의 값을 변수에 저장

            int result = calculator.calculate(num1, num2, sign);// 입력값 calculate 메소드호출하여 실행
            calculator.getResult().add(result); // getResult 메소드를 통해 값 저장
//            System.out.println("결과 : " + calculator.getResult1()); // 결과값 확인
//            System.out.println("저장된 값 : " + calculator.getResult()); // 배열을 통해 결과확인

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeValue = sc.next(); // remove 여부 입력값 생성
            if (removeValue.equals("remove")) { //  입력값이 remove와 같다면
                calculator.removeResult(0); // 인덱스번호 0 (가장 먼저 저장된 값) 삭제
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String showResult = sc.next(); // inquiry 여부 입력값 생성
            if (showResult.equals("inquiry")) { // 입력값이 inquiry와 같다면
                for (Integer showAll : calculator.getResult()) { // 향상된 for반복문으로 배열의 값 전체 조회
                    System.out.println("저장된 결과 : " + showAll);
                }
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while (!(sc.next().equals("exit"))); // exit 입력하지 않을 경우 do문으로 가서 실행
    }

} // App 클래스 끝






