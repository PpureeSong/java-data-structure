package Chapter2.section1;

import java.io.*;
import java.util.Scanner;

public class IndexMaker {

    // 입력으로 하나의 텍스트 파일을 읽는다 (sample.txt)
    // 텍스트 파일에 등장하는 모든 단어들의 목록을 만들고, 각 단어가 텍스트 파일에 등장하는 횟수를 센다.
    // 단, 단어 개수는 100,000개 이하

    // 사요자가 요청하면 단어 목록을 하나의 파일 저장한다.
    // 사용자가 단어를 검색하면 그 단어가 텍스트 파일에 몇 번 등장하는지 출력한다.

    static Item[] items = new Item[100000];
    static int n = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 대화식 인터페이스를 가지는 경우, 언제 while문을 종료할지 미리 정해져 있지 않을 경우
        // 무한루프를 하나 생성하고, 종료 조건에 맞을 경우 break 문으로 빠져나가도록 히는 스타일
        while (true) {

            System.out.print("$ ");
            String command = sc.next();

            if(command.equals("read")) {
                String fileName = sc.next();
                makeIndex(fileName);
            } else if(command.equals("find")) {
                String word = sc.next();
                int index = findWord(word);
                if(index > -1) {
                    System.out.println("The word "+ items[index].word+" appears "+ items[index].count);
                } else {
                    System.out.println("The word "+ word +" does not appear");
                }
            } else if(command.equals("saves")) {
                String fileName = sc.next();
                saveAs(fileName);
            } else if(command.equals("exit")) {
                break;
            }
        }

        sc.close();

        for(int i=0; i<n; i++) {
            System.out.println(items[i].word+" "+items[i].count);
        }

    }

    static void saveAs(String fileName) {
        try {
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            for(int i=0; i<n; i++) {
                outFile.println(items[i].word + " "+ items[i].count);
            }
            outFile.close();
        } catch (IOException e) {
            System.out.println("Save failed, Don't ask me why!");
            return;
        }
    }

    static void makeIndex(String fileName) {
        try {
            Scanner inFile = new Scanner(new File(fileName));

            while (inFile.hasNext()) {
                String str = inFile.next();

                String trimed = trimming(str);

                if(trimed != null) {
                    String t = trimed.toLowerCase();
                    addWord(t);
                }
            }

            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            return;
        }
    }

    static void addWord(String str) {
        int index = findWord(str); // returns -1 if not found
        if(index != -1) { // found
            items[index].count ++; // 등장 빈도 추가

        } else { // not found
            // ordered list에 insert : insert 할 때는 뒤에서 부터 검사하기!!
            int i = n-1;

            for(; i >=0 && items[i].word.compareToIgnoreCase(str) > 0; i--) {
                items[i+1] = items[i];
            }
            items[i+1] = new Item();
            items[i+1].word = str; // 새로운 단어 추가
            items[i+1].count = 1;
            n++;
        }
    }

    static int findWord(String str){
       for(int i=0; i<n; i++) {
           if(items[i].word.equals(str)) {
               return  i;
           }
       }
       return -1;
    }

    static String trimming(String str) {

        if(str == null || str.length() <=0) {
            return null;
        }

        int i = 0;
        int j = str.length() -1;
        while (i < str.length()  && !Character.isLetter(str.charAt(i))) { // while i-th character is not letter;
            i++;
        }

        while (j >= 0  && !Character.isLetter(str.charAt(j))) { // while i-th character is not letter;
            j--;
        }

        if(i<=j) {
            return str.substring(i, j+1);
        } else {
            return null;
        }
    }
}
