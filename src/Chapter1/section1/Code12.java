package Chapter1.section1;

import java.util.Scanner;

public class Code12 {

    public static void main(String[] args) {
        // n개의 정수를 입력받아 배열에 저장한다.
        // 이들 중에서 0개 이상의 연속된 정수들을 더하여 얻을 수 있는 최대값을 구하여 출력하는 프로그램을 작성하라.
        // 모든 수가 음수일 경우 하나도 선택 안 할 수 있기 때문에 이 경우, 최대값은 0이다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for(int i=0; i<n; i++) {
            input[i] = sc.nextInt();
        }

        sc.close();

//        최초 풀이 : 이것도 맞는 답!
//        int max = 0;
//
//        for(int i=0; i<n; i++) {
//            int sum = 0;
//            for(int j=i; j<n; j++) {
//                sum += input[j];
//                if(max < sum) {
//                    max = sum;
//                }
//            }
//        }

        int max = 0;

        for(int i=0; i<n; i++) {
            // 구간을 설정
            for(int j=i; j<n; j++) {

                // 구간의 합 구하기
                int sum = 0;
                for(int k=i; k<=j; k++) {
                    sum += input[k];
                }

                if(max < sum) {
                    max = sum;
                }
            }
        }

        System.out.println("max: "+ max);

    }
}
