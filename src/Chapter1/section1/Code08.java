package Chapter1.section1;

import java.util.Scanner;

public class Code08 {

    public static void main(String[] args) {
        // 사용자로부터 n개의 정수를 입력받은 후 합과 최대값을 구하여 출력하는 코드

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for(int i=0; i<n; i++) {
            input[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        int max = input[0];

        for (int j : input) {
            sum += j;

            if (max < j) {
                max = j;
            }
        }

        System.out.println("sum: " + sum);
        System.out.println("max: " + max);

    }
}
