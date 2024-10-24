package org.example.assignment.DLSR.lambdaStream.deepQ7Stream;

public class Employee2Main {
}
/*
package org.example.deep_q7_stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Employee2> employees = Arrays.asList(
                new Employee2("Michael", "Manager", 35),
                new Employee2("Sarah", "HR", 32),
                new Employee2("Roger", "Manager", 44),
                new Employee2("Mike", "Manager", 40),
                new Employee2("Maureen", "IT", 37)
        );

        // 1. department가 "Manager"인 직원들 필터링
        OptionalDouble averageAge = employees.stream()
                .filter(emp -> "Manager".equals(emp.getDepartment())) // "Manager" 부서 필터링
                .mapToInt(Employee2::getAge) // 나이를 IntStream으로 변환
                .average(); // 평균 계산

        // 2. 평균이 존재하지 않는 경우 기본값으로 0을 사용
        double avgAge = averageAge.orElse(0);
        System.out.println("직원들의 평균 나이: " + avgAge);
    }
    }
}

 */