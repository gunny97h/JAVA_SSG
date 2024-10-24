package org.example.day18.람다식.람다스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// NEW01-Java-8(디자인패턴+람다+스트림+리플렉션).pdf  p.33 ~ 45
public class LambdaStream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("홍길동");
        names.add("김길동");
        names.add("송길동");
        names.add("정길동");
        names.add("이길동");
        names.add("홍길똥");

        List<String> result = names.stream()
                                    .filter(x -> x.startsWith("홍"))  // 홍으로 시작하는 것만 필터링해서
                                    .collect(Collectors.toList());  // 리스트에 모으기

        System.out.println(result);
    }
}
