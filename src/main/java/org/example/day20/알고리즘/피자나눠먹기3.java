package org.example.day20.알고리즘;

public class 피자나눠먹기3 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4, 15));
    }

}
class Solution {
    public int solution(int slice, int n) {
        if (n%slice == 0) {
            return n / slice;
        } else {
            return (n / slice) + 1;
        }
    }
}