package org.example.day21.알고리즘.스트링;

public class 스트링심화 {
    public static void main(String[] args) {
        String s = "퐁퐁";
        String s2 = "퐁퐁"; // 100번 주소
        System.out.println(s);
        System.out.println(s2);
        // 참조형이 가르키고 있는 값을 비교
        System.out.println(s.equals(s2));
        // 참조형 변수내에 들어있는 주소를 비교
        System.out.println(s == s2);

        s2 = "하하";  // 200번 주소  // String은 값이 바뀔 때마다 주소도 바뀜
        System.out.println(s.equals(s2));
        System.out.println(s == s2);
        s2 = "홍홍"; // 300번 주소

        System.out.println("--------------------------------------------");

        // String은 값이 변할 때마다 새로운 주소를 할당하기 때문에
        // 값이 자주 바뀌는 상황에서는 String 사용 X
        // --> String의 값이 자꾸 변할 때는 StringBuilder를 쓸 것.
        StringBuilder sb = new StringBuilder(); // 주소 하나로 처리함
        sb.append("하하하하1");
        sb.append("하하하하2");
        sb.append("하하하하3");
        System.out.println(sb);

        sb.replace(0, 5, "호호호호0");
        System.out.println(sb);

        sb.delete(0, 5);
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        System.out.println(sb.indexOf("2"));

        sb.insert(1, "왕");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String result = sb.toString();
        System.out.println(result);


        System.out.println("--------------------------------------------");
        // 하나로 모아보기
        String[] s3 = {"나는 ", "홍길동", "이다."};

        String s4 = "";
        for (String x : s3) {
            System.out.println(s4.hashCode());
            s4 = s4 + x;
        }
        System.out.println(s4);
        //--> 데이터가 많은 경우 주소를 계속 할당하니 StringBuilder 사용해야 함.

        StringBuilder sb2 = new StringBuilder();
        for (String x : s3) {
            System.out.println(sb2.hashCode());
            sb2.append(x);
        }
        System.out.println(sb2);
    }
}
