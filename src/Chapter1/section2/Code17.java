package Chapter1.section2;

public class Code17 {
    public static void main(String[] args) {
        // 1~100000 사이의 소수를 찾아 출력
        for(int n=2; n<=100000; n++) {
            if(isPrime(n)) {
                System.out.println(n);
            }
        }
    }

    public static boolean isPrime(int a) {
        if(a < 2) {
            return false;
        }
        for(int i=2; i*i<a; i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
