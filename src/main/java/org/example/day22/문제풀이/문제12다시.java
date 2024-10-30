package org.example.day22.문제풀이;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문제12다시 {
    public static void main(String[] args) {
        // 배열컬렉션 변환 고급 확인문제
        String[] s3 = {"박명수", "유재석", "김종국", "송지효", "하하"};

        // List<String> list = Arrays.asList(s3);  --> 길이 조절 불가능 (remove, add X)
        List<String> list = new ArrayList<>(Arrays.asList(s3));  // 새로 만들어야 함
        // 1. 오름차순 정렬해서 프린트
//        Arrays.sort(s3);
//        ArrPrint.p(s3);
        Collections.sort(list);
        System.out.println(list);
        // 2. 내림차순 정렬해서 프린트
        Collections.reverse(list);
        System.out.println(list);
        // 3. 글자수가 3미만인 사람 삭제후  프린트

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).length() < 3) {
//                list.remove(list.get(i));
//            }
//        }  --> 뒤에서부터 접근해야 안전하게 삭제 가능
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).length() < 3) {
                list.remove(i);
            }
        }

        System.out.println(list);
        // 4. 유재석을 찾아서 유재돌로 변경한 후 프린트
        int index = list.indexOf("유재석");
        list.set(index, "유재돌");
        System.out.println(list);
        // 5. 전체 목록에 “김종민"을 3번째에 추가한 후 프린트
        list.add(2, "김종민");
        System.out.println(list);
        // 6. 숫자찾기 문제 풀기
    }
}
