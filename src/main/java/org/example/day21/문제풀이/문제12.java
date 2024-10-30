package org.example.day21.문제풀이;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문제12 {
    public static void main(String[] args) {
        // 배열컬렉션 변환 고급 확인문제
        String[] s3 = {"박명수", "유재석", "김종국", "송지효", "하하"};

        List<String> list = new ArrayList<>(Arrays.asList(s3));
        //List<String> list2 = new ArrayList<>(List.of(s3));
        // --> 두 코드 모두 s3 배열을 기반으로 한 수정 가능한 ArrayList를 생성하지만,
        // List.of(s3)는 불변 리스트를 반환하고,
        // Arrays.asList(s3)는 고정 크기 리스트를 반환.

        // 1. 오름차순 정렬해서 프린트
//        Arrays.sort(s3);
//        ArrPrint.p(s3);
        Collections.sort(list);
        System.out.println(list);
        // 2. 내림차순 정렬해서 프린트
        Collections.reverse(list);
        System.out.println(list);
        // 3. 글자수가 3미만인 사람 삭제후  프린트
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < 3) {
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
        // 4. 유재석을 찾아서 유재돌로 변경한 후 프린트
//        Collections.replaceAll(list, "유재석", "유재돌");
//        System.out.println(list);
        int index = list.indexOf("유재석");
        list.set(index, "유재돌");
        System.out.println(list);

        // 5. 전체 목록에 “김종민"을 3번째에 추가한 후 프린트
        list.add(2, "김종민");
        System.out.println(list);
        // 6. 숫자찾기 문제 풀기
    }
}

/*
public class 배열컬렉션변환 {
    //    String[] s3 = {"박명수", "유재석","김종국","송지효","하하"};
//    오름차순 정렬해서 프린트
//    내림차순 정렬해서 프린트
//    글자수가 3미만인 사람 삭제후  프린트
//    유재석을 찾아서 유재돌로 변경한 후 프린트
//    전체 목록에 "김종민"을 3번째에 추가한 후 프린트
    public static void main(String[] args) {
        String[] s3 = {"박명수", "유재석", "김종국", "송지효", "하하"};
        //List<String> list = Arrays.asList(s3);
        //길이 조절 불가능(remove, add X)

        List<String> list2 = new ArrayList<>(Arrays.asList(s3));
        //길이 조절 가능(remove, add O)
        Collections.sort(list2); //오름차순
        System.out.println(list2);
        Collections.reverse(list2); //내림차순
        System.out.println(list2);

        int find = 0;
        for (int i = 0; i < list2.size(); i++){
            if(list2.get(i).length() < 3){
                find = i;
            }
        }//for

        list2.remove(find);
        //binarySearch는 오름차순에서만 찾을 수 있음.
        //내림차순이어서 오류 -5나옴.
        //int index = Collections.binarySearch(list2, "유재석");
        list2.set(0, "유재돌");
        System.out.println(list2);

        list2.add("김종민");
        System.out.println(list2);
    }

}
 */