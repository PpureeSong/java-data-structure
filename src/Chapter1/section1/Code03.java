package Chapter1.section1;

import java.util.Scanner;

public class Code03 {

    public static void main(String[] args) {
        String str =  "Hello";
        String input;

        Scanner kb = new Scanner(System.in);

        System.out.println("Please type a string: ");

        input = kb.next();

        // 프리미티브 타입이 아닌 string의 비교는 == 연산자로 할 수 없고, equals 메서드를 사용
        if(str.equals(input)) {
            System.out.println("String match! :-)");
        } else {
            System.out.println("String do not match! :-(");
        }

        kb.close();

    }
}
