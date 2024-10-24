package org.example.assignment.DLSR.lambdaStream.basicQ6Stream;

public class Student2Main {
}
/*
package org.example.basic_q6_stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("hong", 100),
                new Student("kim", 90),
                new Student("jung", 80),
                new Student("park", 70),
                new Student("moon", 95)
        );

        // 1. Student의 점수로 IntStream 생성
        OptionalDouble averageScore = list.stream()
                .mapToInt(Student::getScore) // 점수를 IntStream으로 변환
                .average(); // 평균 계산

        // 4. 평균이 존재하는지 확인하고 출력
        if (averageScore.isPresent()) {
            System.out.println("평균 점수: " + averageScore.getAsDouble());
        } else {
            System.out.println("평균값을 구할 수 없음");
        }
    }
}


 */