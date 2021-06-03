package Chapter1.section1;

import java.util.Scanner;

public class Code14 {
    public static void main(String[] args) {
        //사용자로부터 n개의 정수를 입력받은 후 오름차순으로 정렬(sort)하여 출력하는 코드

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i=0; i<n; i++) {
            input[i] = sc.nextInt();
        }

        // 버블정렬(bubble sort) 알고리즘
        // 가장 큰 숫자를 맨 뒤로 옮김
        // 마지막 배열은 생각하지 않고, 남은 배열 중에서 또 다시 가장 큰 숫자를 찾아서 맨 뒤로 옮겨 준다.
        // input[0] ~ input[i] 중에서 최대값을 input[i] 위치로 몰아가는 것

       for(int i=n-1; i>0; i--) {
            for(int j=0; j<i; j++){
                if(input[j] > input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }

       System.out.println("Sorted data: ");
       for(int i=0; i<n; i++) {
           System.out.println(input[i]);
       }
    }
}
