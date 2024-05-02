package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    // 속성(필드) 영역
    // 상태 데이터 영역
    private ArrayList<Double> resultArr = new ArrayList<>(); // 직접 접근 못하도록 private제어자 사용

    // 생성자 영역
    public Calculator(ArrayList<Double> resultArr) { // 생성자 변경
        this.resultArr = resultArr;
    }

    public ArrayList<Double> getResult() { // 사칙연산 결과값 조회 메소드 getter 생성
        return resultArr; // 결과값 Array로 반환
    }

    public void setResult(Double result) { // (사칙연산)매개변수 결과값 받아서 수정 setter 생성
        this.resultArr = resultArr; // 배열에서 수정
    }

    public void removeResult(int index) { // 매개변수 index번호 받아서 배열의 결과값 삭제
        this.resultArr.remove(index); // 배열에서 APP클래스에서 지정된 인덱스번호대로 결과값 삭제
    }


}

class App { // App클래스 시작
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(new ArrayList<>());
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        // Calculator 인스턴스 생성 Double, Integer 2개
        Scanner sc = new Scanner(System.in); // 입력값 받는 Scanner 생성

        do { // do 구문은 무조건 실행
            System.out.println("사칙연산(1)/원의넓이(2) 계산타입을 입력하세요 (입력 1 또는 2 만 가능): ");
            int type = sc.nextInt(); // 계산타입 입력값 생성

            if (type == 2) {  // 2번 입력시 원의 넓이 계산
                System.out.println("반지름의 길이를 입력하세요: ");
                Double radius = sc.nextDouble(); // 원의 넓이 반지름 입력값 생성

                double result = circleCalculator.calculate(radius); // 원의넓이 계산 결과값은 result
                circleCalculator.getResult().add(result); // 원의 넓이 result 값 받아서 resultArr2에 저장
//                System.out.println("원의 넓이 저장된 값 : " + calculator.getCicleResult()); // 원의 넓이 결과값 확인
                System.out.println("원의 넓이 결과 값을 전체조회 합니다. "); // 안내 글 출력
                for (Double showAllOfCicle : circleCalculator.getResult()) { // 향상된 for반복문으로 배열의 값 전체 조회
                    System.out.println("원의 넓이 저장된 결과 : " + showAllOfCicle);
                }

            } else if (type == 1) {
                // 1번 입력시 사칙연산 계산
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt(); // 첫 번째 숫자 입력값 생성
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt(); // 두 번째 숫자 입력값 생성

                System.out.print("사칙연산 기호를 입력하세요: ");
                String sign = sc.next(); // 사칙연산 입력값 생성 (char타입으로는 scanner 입력값 저장 불가)
                char operationChar = sign.charAt(0); // char타입으로 변환하여 operationStr의 0번째 인덱스의 값을 변수에 저장

                double result = arithmeticCalculator.calculate(num1, num2, sign);// 입력값 calculate 메소드호출하여 실행
                arithmeticCalculator.getResult().add(result); // getResult 메소드를 통해 값 저장
//            System.out.println("결과 : " + calculator.getResult1()); // 결과값 확인
//            System.out.println("저장된 값 : " + calculator.getResult()); // 배열을 통해 결과확인

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String removeValue = sc.next(); // remove 여부 입력값 생성
                if (removeValue.equals("remove")) { //  입력값이 remove와 같다면
                    arithmeticCalculator.removeResult(0); // 인덱스번호 0 (가장 먼저 저장된 값) 삭제
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String showResult = sc.next(); // inquiry 여부 입력값 생성
                if (showResult.equals("inquiry")) { // 입력값이 inquiry와 같다면
                    for (Double showAll : arithmeticCalculator.getResult()) { // 향상된 for반복문으로 배열의 값 전체 조회
                        System.out.println("저장된 결과 : " + showAll);
                    }
                }
            } else {
                System.out.println("잘못 입력하셨습니다. 1과 2를 선택해주세요.");
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while (!(sc.next().equals("exit"))); // exit 입력하지 않을 경우 do문으로 가서 실행
    }

} // App 클래스 끝






