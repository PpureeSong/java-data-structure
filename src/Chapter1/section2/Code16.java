package Chapter1.section2;

import java.util.Scanner;

public class Code16 {
    public static void main(String[] args) {
        // 입력으로 두 정수 a와 b를 받아 a의 b승을 계산
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = power(a, b);
        System.out.println(result);

        sc.close();
    }

    public static int power(int n,int m) {
        int result = 1;
        for(int i=0; i<m; i++ ) {
            result *= n;
        }
        return result;
    }
}
