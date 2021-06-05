package Chapter1.section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
    public static void main(String[] args) {
        // 파일 읽기
        // input.txt 라는 파일로부터 사람들의 이름과 전화번호 쌍을 입력받아 배열에 저장하고 출력한다.

        String[] name = new String[1000];
        String[] number = new String[1000];
        int n = 0 ; // 사람 수

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

        for(int i=0; i<n; i++) {
            System.out.println("Name: " + name[i]+", Phone: "+ number[i]);
        }

    }
}
