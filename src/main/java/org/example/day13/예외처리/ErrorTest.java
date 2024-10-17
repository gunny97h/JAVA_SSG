package org.example.day13.예외처리;

public class ErrorTest {
    public static void main(String[] args) {
        // 예외 처리 순서
        // 예외가 발생하면 해당 예외(첫 번째 예외)가 처리된 후
        // 프로그램은 예외가 발생한 곳 이후의 코드는 실행되지 않고 바로 catch 블록으로 넘어갑니다.
        // 이후 finally 블록이 실행
        try {
            int[] numbers = {1, 2, 3};
            //int result1 = numbers[5] / 0;  // 배열 인덱스 초과와 0으로 나누기 시도
            //int result2 = numbers[2] / 0;  // 0으로 나누기 시도
            int result3 = numbers[2] / 1;
            //System.out.println("결과1: " + result1);
            //System.out.println("결과2: " + result2);
            System.out.println("결과3: " + result3);
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            // 0으로 나눌 때 발생하는 예외 처리
            System.out.println("예외 발생: 0으로 나눌 수 없습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 배열의 잘못된 인덱스 접근 시 발생하는 예외 처리
            System.out.println("예외 발생: 배열의 인덱스가 잘못되었습니다.");
        } catch (Exception e){ // 아래에 있을수록 범위가 넓어야 함.
            //위에 쓴 에러 이외의 예외 처리
            System.out.println(e.getMessage());
        }finally {
            // 예외 발생 여부와 상관없이 항상 실행되는 코드
            System.out.println("프로그램이 종료되었습니다.");
        }
    }
}
