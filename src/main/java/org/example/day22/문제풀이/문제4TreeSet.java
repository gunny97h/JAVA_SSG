package org.example.day22.문제풀이;

import org.example.ArrPrint;

import java.util.TreeSet;

// 4. int[] s4 = {11, 3, 78, 9, 2, 100} 오름차순 정렬 후
//   2번째 큰 값과 2번째 작은 값을 구하세요.
public class 문제4TreeSet {
    public static void main(String[] args) {
        int[] s4 = {11, 3, 78, 9, 2, 100};
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int x : s4) {
            treeSet.add(x);
        }
        System.out.println(treeSet);

        Object[] arr = treeSet.toArray();
        ArrPrint.p(arr);
        System.out.println("2번째 큰 값: " + arr[arr.length - 2]); // 두 번째 큰 값
        System.out.println("2번째 작은 값: " + arr[1]);

    }
}
