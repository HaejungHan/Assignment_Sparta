package Assignment;

import java.util.ArrayList;

public class CircleCalculator extends Calculator {

    // 속성(필드) 영역
    final double PI = 3.14; // 원의 넓이를 구하기 위해선 3.14는 고정되어 있기 때문에 더이상 바뀌지 않는다는 의미에서 final제어자 사용
    private ArrayList<Double> resultArr = new ArrayList<>();

    public CircleCalculator(ArrayList<Double> resultArr) {
        super(resultArr); // 부모 필드에 값 저장
    }

    // 메소드 영역
    public double calculate(double radius) { // 원의넓이 계산 구현 (메소드 오버로딩)
        double result = PI * radius * radius;
        return result;
    }

}



