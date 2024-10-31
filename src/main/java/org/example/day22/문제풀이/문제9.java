package org.example.day22.문제풀이;

// 1. 마지막 위치의 숫자가 1이면 서대문구에서 출생,
//    1이 아니면 다른 구에서 출생 프린트
// 2. "52"를 추출하여 두 숫자를 더해보세요.
//    더해서 10이 넘지 않아야 유효한 주민번호
//    유효한 주민번호인지 아닌지 출력
// 3. 주민번호에 포함된 5의 갯수를 출력
public class 문제9 {
    public static void main(String[] args) {
        String sno = "2056521";
        char[] c = sno.toCharArray();
        //ArrPrint.p(c);
        if (c[c.length - 1] == '1') {
            System.out.println("서대문구에서 출생");
        } else System.out.println("다른 구에서 출생");

        int n1 = Character.getNumericValue(c[c.length - 2]);
        int n2 = Character.getNumericValue(c[c.length - 3]);
        if (n1 + n2 < 11) {
            System.out.println("유효한 주민번호");
        } else System.out.println("유효하지 않은 주민번호");

        int count = 0;
        for (char cc : c) {
            if (cc == '5') count++;
        }
        System.out.println("주민번호에 포함된 5의 갯수: " + count);

    }
}
