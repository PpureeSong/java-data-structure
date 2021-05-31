package Chapter1.section1;

// 변수는 메서드 내부에 선언될 수도 있고 외부에 선언될 수도 있지만 클래스 외부에 선언될 수는 없음.
public class Code01 {

    // 메서드 외부에 선언된 변수 : 클래스 전체에서 사용 가능
    static int num;

    public static void main(String[] args) {
        // 메서드 내부에 선언된 변수 : 그 메서드 내에서만 사용 가능
        int anotherNum = 5;

        num = 2;

        System.out.println(num + anotherNum);
        System.out.println("num:" + num);
        System.out.println("anthoerNum:" + anotherNum);
        System.out.println("sum:" + (num + anotherNum));  //left associativity

    }
}
