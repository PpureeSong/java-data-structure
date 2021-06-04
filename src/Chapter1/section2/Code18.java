package Chapter1.section2;

import java.awt.*;
import java.util.Scanner;

public class Code18 {
    public static void main(String[] args) {
        // 사용자로부터 n개의 정수를 입력받은 후 오름차순으로 정렬(sort) 하여 출력하는 코드

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++) {
            data[i] = sc.nextInt();
        }

        sc.close();

        bubbleSort(data);

        for(int i=0; i<n; i++) {
            System.out.print(data[i]+ " ");
        }
    }

    public static void bubbleSort(int[] data) {
        for(int i=data.length-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(data[j] > data[j+1]) {
//                    swap(data[j], data[j+1]);
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }
    }

    // call by value : 값에 의한 호출
    // 프리미티브 타입의 매개변수는 호출된 메서드에서 값을 변경하더라도 호출한 쪽에(원본 값) 영향을 주지 못함.
//    public static void swap(int a, int b) {
//        int tmp = a;
//        a = b;
//        b = tmp;
//    }
}
