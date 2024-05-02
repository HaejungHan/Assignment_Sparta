//package Assignment;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class App {
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator(new ArrayList<>()); // Calculator 인스턴스 생성
//        Scanner sc = new Scanner(System.in); // 입력값 받는 Scanner 생성
//
//        do { // do 구문은 무조건 실행
//
//            System.out.print("첫 번째 숫자를 입력하세요: ");
//            int num1 = sc.nextInt(); // 첫 번째 숫자 입력값 생성
//            System.out.print("두 번째 숫자를 입력하세요: ");
//            int num2 = sc.nextInt(); // 두 번째 숫자 입력값 생성
//
//            System.out.print("사칙연산 기호를 입력하세요: ");
//            String sign = sc.next(); // 사칙연산 입력값 생성 (char타입으로는 scanner 입력값 저장 불가)
//            char operationChar = sign.charAt(0); // char타입으로 변환하여 operationStr의 0번째 인덱스의 값을 변수에 저장
//
//
////            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
////            String removeValue = sc.next(); // remove 여부 입력값 생성
////            if (removeValue.equals("remove")) { //  입력값이 remove와 같다면
////                resultArr.remove(0); // 인덱스번호 0 (가장 먼저 저장된 값) 삭제
//////                System.out.println(resultArr.toString()); // 배열 인덱스0번의 값이 제거되었는지 확인
////            }
////
////            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
////            String showResult = sc.next(); // inquiry 여부 입력값 생성
////            if (showResult.equals("inquiry")) { // 입력값이 inquiry와 같다면
////                for (Integer showAll : resultArr) { // 향상된 for반복문으로 배열의 값 전체 조회
////                    System.out.println("저장된 결과 : " + showAll);
////                }
////            }
//            int result = calculator.calculate(num1, num2, sign);// 입력값 calculate 메소드호출하여 실행
//            calculator.getResult().add(result); // getResult 메소드를 통해 값 저장
////            System.out.println("저장된 값 : " + calculator.getResult()); // 값이 배열에 잘 들어갔는지 확인
//         System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
//        } while (!(sc.next().equals("exit"))); // exit 입력하지 않을 경우 do문으로 가서 실행
//    }
//
//}
