package org.example.assignment.DLSR.lambdaStream;

import java.util.Arrays;
import java.util.List;

public class BasicQ4Stream {
    public static void main(String[] args) {
        // 한 글자인 요소들을 필터링한 후,
        // 목록을 생성 후 출력
        List<String> strings = Arrays.asList("파인애플", "송아지", "양", "스마일", "소");
        List<String> strings2 = strings.stream()
                                       .filter(s -> s.length() == 1)
                                       .toList();
        System.out.println(strings2);

        // jpeg으로 끝나는 요소들을 필터링한 후,
        // 목록을 생성 후 출력하시오.
        List<String> images = Arrays.asList("1.png", "2.png", "3.jpeg", "4.jpeg");
        List<String> images2 = images.stream()
                                     .filter(i -> i.endsWith("jpeg"))
                                     .toList();
        System.out.println(images2);
    }
}
/*
package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q4_stream {
    public static void main(String[] args) {
        // 1. 한 글자인 요소들을 필터링한 후 목록 생성
        List<String> strings = Arrays.asList("파인애플", "송아지", "양", "스마일", "소");
        List<String> oneCharWords = strings.stream()
                .filter(word -> word.length() == 1) // 한 글자인 요소 필터링
                .collect(Collectors.toList());
        System.out.println("한 글자인 요소들: " + oneCharWords);

        // 2. "jpeg"로 끝나는 요소들을 필터링한 후 목록 생성
        List<String> images = Arrays.asList("1.png", "2.png", "3.jpeg", "4.jpeg");
        List<String> jpegImages = images.stream()
                .filter(image -> image.endsWith(".jpeg")) // "jpeg"로 끝나는 요소 필터링
                .collect(Collectors.toList());
        System.out.println("jpeg로 끝나는 이미지들: " + jpegImages);
    }
}

 */