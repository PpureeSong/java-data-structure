package Chapter1.section1;

public class Code10 {

    public static void main(String[] args) {
        // 1 ~ 100000 사이의 모든 소수들을 찾아서 출력

        // 소수 : 1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수
        // n이 소수인지 아닌지 확인하는 방법 : 2, 3, 4, ..., n-1 로 다 나눠서 나누어 떨어지는 수가 하나라도 있으면 소수가 아님
        // 2, 3, 4, ..., n/2 까지만 확인해 보면 됨 : n의 약수가 n/2보다 클 수는 없음
        // sqrt(n) : rootN까지만 확인해 보면 됨
        // > 약수는 쌍을 이룸 : rootN 보다 큰 약수가 있다면 무조건 rootN보다 작은 약수도 존재하게 되어 있음.
        // > 둘 다 rootN보다 클 수는 없음 : 두개를 곱하면 N보다 커지니까

        for(int n=2; n<=100000; n++) {
            boolean isPrime = true;
            for(int i = 2; i*i <= n && isPrime; i++) { // i < rootN == i*i < N, isPrime : for 문을 더 이상 돌 필요가 없을 때 즉시 빠져나오게 함.
                if( n % i == 0) {
                    isPrime = false;
                    // break; for 문을 더 이상 돌 필요가 없을 때 즉시 빠져나오게 함.
                }
            }
            if(isPrime) {
                System.out.println(n);
            }
        }
    }
}
