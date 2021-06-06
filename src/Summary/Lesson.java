package Summary;

// class : java 프로그램을 구성하는 기본 단위
// java 프로그램 : class들의 집합
// class 이름과 파일명은 동일해야 함

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson {

    // 입력으로 하나의 텍스트 파일을 읽는다
    // 텍스트 파일에 등장하는 모든

    static String[] names = new String[1000];
    static int[] numbers = new int[1000];
    static int n = 0;

    public static void main(String[] args) {
//        1. 키보드로 부터 입력 받기
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt(); // 입력받은 수
//        for(int i=0; i<k; i++) {
//            names[i] = sc.next();
//            numbers[i] = sc.nextInt();
//        }
//        sc.close();
//
//        for(int i=0; i<k; i++) {
//            System.out.println("name: "+names[i] +", number: "+ numbers[i]);
//        }


        // 2. 파일로 부터 입력 받기
        try {
            Scanner sc = new Scanner(new File("src/Summary/input.txt"));

            // 파일 끝에 도달 했는지 확인
            while (sc.hasNext()) {
                names[n] = sc.next();
                numbers[n] = sc.nextInt();
                n++;

            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            System.exit(1);
        }

        bubbleSort();

        for(int i=0; i<n; i++) {
            System.out.println("name: "+names[i] +", number: "+ numbers[i]);
        }
    }

    public static void bubbleSort() {
        for(int i=n-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                // 전화번호 기준으로 정렬
//                if(numbers[j] > numbers[j+1]) {
//                    int tmp = numbers[j];
//                    numbers[j] = numbers[j+1];
//                    numbers[j+1] = tmp;
//
//                    String nameTmp = names[j];
//                    names[j] = names[j+1];
//                    names[j+1] = nameTmp;
//                }

                // 사람이름 기준으로 정렬
                if(names[j].compareTo(names[j+1]) > 0) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;

                    String nameTmp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = nameTmp;
                }
            }

        }
    }
}
