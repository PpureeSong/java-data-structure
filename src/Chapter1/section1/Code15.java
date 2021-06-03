package Chapter1.section1;

import java.util.Scanner;

public class Code15 {
    public static void main(String[] args) {
        // 사용자로부터 n개의 정수를 입력받는다.
        // 정수가 하나씩 입력될 때 마다 현재까지 입력된 정수들을 오름차순으로 정렬하여 출력하라

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];

//        최초 풀이
//        for(int i=0; i<n; i++) {
//            data[i] = sc.nextInt();
//            data = bubbleSort(data, i+1);
//
//            System.out.println("Sorted data: ");
//            for(int j=0; j<=i; j++) {
//                System.out.println(data[j]);
//            }
//        }

        // 배열에서 중간에 끼워 넣으려면 뒤로 한칸씩 이동을 시켜야 함.
        // 뒤에서 부터 확인하면서 동시에 옮기는 것이 보다 효율적
        // ordered list 에 새로운 값을 insert 하는 알고리즘
        for(int i=0; i<n; i++) {
            int tmp = sc.nextInt();

            int j = i-1; // 현재 입력된 제일 마지막 데이터의 인덱스
            while (j>=0 && data[j] > tmp) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = tmp;

            System.out.print("Sorted data: ");
            for(int k=0; k<=i; k++) {
                System.out.print(data[k]+ " ");
            }
            System.out.println();

        }
    }

    public static int[] bubbleSort(int[] data, int count) {
        for(int i=count-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }

            }
        }
        return data;
    }
}
