package org.example.day10.정규표현식;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// NEW01-Java-3(클래스+객체).pdf p.102
public class 정규표현식1 {
    public static void main(String[] args) {
        // 영문자로 시작하고 끝나는 0개 이상의 영문 단어
        String pt = "^[a-zA-Z]*$";
        System.out.println(Pattern.matches(pt, "abcaa"));
        System.out.println(Pattern.matches(pt, "123"));
        System.out.println(Pattern.matches(pt, ""));
        System.out.println();

        Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
        Matcher result1 = pattern.matcher("abcaa");
        System.out.println(result1);
        System.out.println(result1.find());
//        String pt = "[a-zA-Z]*$";
//        String str1 = "abcaa";
//        String str2 = "123";
//        String str3 = "";
//
//        boolean result1 = Pattern.matches(pt, str1);
//        boolean result2 = Pattern.matches(pt, str2);
//        boolean result3 = Pattern.matches(pt, str3);
//
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
    }
}
