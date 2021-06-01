package Chapter1.section1;

import java.util.Scanner;

public class Code09 {

    public static void main(String[] args) {
        /*
         * n개의 정수를 입력받아 순서대로 배열에 저장한다.
         * 그런 다음 모든 정수들을 한 칸씩 오른쪽으로 shift하라.
         * 마지막 정수는 배열의첫 칸으로 이동하라.
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i=0; i<n; i++) {
            input[i] = sc.nextInt();
        }

        int temp = input[n-1];
        for(int i=n-2; i>=0; i--) {
            input[i+1] = input[i];
        }
        input[0] = temp;

        for(int i=0; i<n; i++) {
            System.out.println(input[i]);
        }

    }
}
