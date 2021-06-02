package Chapter1.section1;

import java.util.Scanner;

public class Code13 {

    public static void main(String[] args) {
        // n개의 음이 아닌 한 자리 정수를 입력받아 배열에 저장한다.
        // 이들중에서 1개 이상의 연속된 정수들을 연결하여 얻을 수 있는 소수들 중에서 최대값을 구하여 출력하는 프로그램을 작성하라.
        // 1 9 4 0 7 1 3 6 2 3 : 1940713

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for(int i=0; i<n; i++) {
            input[i] = sc.nextInt();
        }


        // 만든 값이 소수인지 확인
        // 소수가 맞다면 최대값과 비교
        // 만든값 > 최대값 : 최대값 = 만든값 (교체)

//        최초 코드
//        int maxPrime = 0;
//
//        for(int i=0; i<n; i++) {
//            String val = ""+input[i];
//            for(int j=i; j<n; j++) {
//                if(i != j) {
//                    val += input[j];
//                }
//
//                // 정수로 변환
//                int num =  Integer.parseInt(val);
//
//                // 소수인지 확인
//                boolean isPrime = true;
//                for(int k=2; k*k < num; k++ ) {
//                    if(num % k == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//
//                // 최대값과 비교
//                if(isPrime && num >1 && maxPrime < num) {
//                    maxPrime = num;
//                }
//            }
//        }

        int maxPrime = 0;

        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {

                // input[i]...input[j]를 하나의 정수로 환산하는 알고리즘 : 현재의 값에 10을 곱하고, 다음값을 더해준다.
                int val = 0;
                for(int k=i; k<=j; k++) {
                    val = val*10 + input[k];
                }

                boolean isPrime = true;
                for(int p =2; p*p<val && isPrime; p++) {
                    if(val % p == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime && val > 1 && val > maxPrime) {
                    maxPrime = val;
                }
            }
        }

        if(maxPrime > 0) {
            System.out.println("The max prime number is "+ maxPrime);
        } else {
            System.out.println("No prime number exists");
        }


    }
}
