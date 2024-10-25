package org.example.day19.스트림;

import java.util.Arrays;

public class 반복문사용 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        // 조건 체크
        // allMatch() : 모두 조건에 맞아야 true
        boolean result1 = Arrays.stream(intArr).allMatch(x -> x > 3);
        if (result1) {
            System.out.println("모두 3이상!");
        } else {
            System.out.println("모두 3이상은 아니다!");
        }
        // anyMatch() : 하나만 조건에 맞아도 true
        boolean result2 = Arrays.stream(intArr).anyMatch(x -> x > 3);
        if (result2) {
            System.out.println("하나는 3이상!");
        } else {
            System.out.println("모두 3이하!");
        }

        System.out.println("--------------------------------------");
        Arrays.stream(intArr)
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println("총합: " + x))  // 맨 끝에 들어가면 에러는 없어도 아무것도 출력되지 않음.
                .forEach(System.out::println);  // 맨 끝에

        System.out.println("--------------------------------------");
        int sum = Arrays.stream(intArr)
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println(x))  // 중간 결과 출력!
                .sum();
        System.out.println("--------------------------------------");
        System.out.println(sum);
    }
}
