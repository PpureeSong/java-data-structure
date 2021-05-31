package Chapter1.section1;

// 라이브러리에 포함된 기능들을 사용할 수 있게 해줌.
import java.util.Scanner;

public class Code02 {

    public static void main(String[] args) {
        int number = 123;

        // kb라는 이름의 스캐너를 만든다.
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter an integer: ");

        // 키보드로 부터 하나의 정수를 받아 input 변수에 저장한다.
        int input = kb.nextInt();

        if(input == number) {
            System.out.println("Number match! :-)");
        } else {
            System.out.println("Number do not match! :-(");
        }

        // 스캐너를 다 사용했으니 닫아준다.
        kb.close();

    }
}
