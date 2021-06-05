package Chapter1.section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

    static String[] name = new String[1000];
    static String[] number = new String[1000];
    static int n = 0 ; // 사람 수

    public static void main(String[] args) {
        //input.txt 파일로부터 이름과 전화번호 쌍을 입력받은 후 이름의 알파벳 순서로 정렬하여 출력한다.

        try {
            Scanner inFile = new Scanner(new File("src/Chapter1/input.txt"));

            while (inFile.hasNext()) { //더 읽을게 남아있느냐? detect end of file
                name[n] = inFile.next();
                number[n] = inFile.next();
                n++;
            }

            inFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("No file");
            System.exit(1);
        }

        bubbleSort();

        for(int i=0; i<n; i++) {
            System.out.println("Name: " + name[i]+", Phone: "+ number[i]);
        }
    }

    static void bubbleSort() {
        for(int i=n-1; i>0; i--) {
            for(int j=0; j<i; j++) {

                if(name[j].compareTo(name[j+1]) > 0) {
                    String nameTmp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = nameTmp;

                    String numberTmp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = numberTmp;
                }

            }
        }

    }
}
