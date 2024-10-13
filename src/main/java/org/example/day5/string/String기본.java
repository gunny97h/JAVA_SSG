package org.example.day5.string;

import java.util.Arrays;

public class String기본 {
    public static void main(String[] args) {
        String s = "나는! 프로그래머야";   //index를 가지고 있음.
        String s2 = "진짜!!!";

        System.out.println(s + s2);
        //두 문자열을 연결 // + 연산자와 동일한 기능
        String sum = s.concat(s2);
        System.out.println(sum);

        //s스트링에 들어있는 것 중 0번 index에 있는 char를 추출!
        char c = s.charAt(0);
        System.out.println(c);
        char c2 = s2.charAt(2);
        System.out.println(c2);

        //문자열이 특정 문자열로 끝나는지 검사
        System.out.println(s.endsWith("!"));    // 논리형(true/false)
        System.out.println(s2.endsWith("!"));
        //문자열이 특정 문자열로 시작하는지 검사
        System.out.println(s2.startsWith("alicia"));

        //문자열이 특정 문자열을 포함하고 있는지 검사
        System.out.println(s.contains("!"));
        System.out.println(s2.contains("!"));
        //aliciawill@kakao.com
        //-> aliciawill

        //문자열의 부분 문자열을 반환
        System.out.println(s.substring(4));
        System.out.println(s.substring(4, 9));

        //index
        //특정 문자열이 처음 위치한 index 반환
        System.out.println(s2.indexOf("짜"));
        //특정 문자열이 마지막 위치한 index 반환
        System.out.println(s2.lastIndexOf("!"));

        String s3 = "aliciawill@kakao.com";
        //aliciawill만 추출하기
        //1-1. @의 위치를 찾는다.
        //1-2. 앞에서 부터 @앞까지 추출
        int index = s3.indexOf("@");
        System.out.println(s3.substring(0,index));

        //s3에 들어있는 것을 대문자로
        System.out.println(s3.toUpperCase());                            //비파괴함수
        //s3에 들어있는 것 중 com을 net으로 변경
        System.out.println(s3.replace("com", "net"));    //비파괴함수
        System.out.println(s3);
        //replace()는 RAM에 있는 데이터를 가져와 CPU가 변경!
        //RAM은 변경되지 않았음.
        s3 = s3.replace("com", "net");
        System.out.println(s3);
        //=> 수동으로 RAM에 넣어주어야 한다.

        //s3의 전체 글자 수 프린트
        System.out.println(s3.length());

        String s4 = " root";
        String s5 = "감자,고구마,양파";
        String s6 = "ABC";

        //공백 제거
        String s44 = s4.trim();
        System.out.println(s44.length());

        //String이 같은지 비교      // System.out.println(s4 ==  s44); ==연산자는 기본자료형만 가능
        System.out.println(s44.equals("root"));
        System.out.println(s4.equals("root"));

        //String을 분리해서 배열에 넣어주기!
        String[] datas = s5.split(","); //==> {"감자", "고구마" ,"감자"}
        System.out.println(Arrays.toString(datas));
        for (String data : datas) {
            System.out.println(data);
        }
        //String을 분리해서 char배열에 넣어주기
        char[] datas2 = s6.toCharArray(); //==> {'A', 'B', 'C'}
        for (char data2 : datas2) {
            System.out.println(data2);
        }


    }
}
