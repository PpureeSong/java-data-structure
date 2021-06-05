package Chapter1.section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code21 {
    static int n;
    static int[][] grid;

    public static void main(String[] args) {
        // 2차원 배열에서 소수 찾기
        // 입력으로 n*n개의 음이 아닌 한자리 정수가 주어진다.
        // 이 정수들 중 가로, 세로, 대각선 8방향으로 연속된 숫자들을 연결하여
        // 만들 수 있는 모든 소수들을 찾아서 나열하는 프로그램을 작성하라.
        // 중복된 수를 출력해도 상관없다.

        // 컴퓨터는 빠르다! 지금 단계에서는 뭔가 교묘한 방법을 찾으려 하지 말고
        // 무식하지만 논리적으로 가장 명료한 방법을 먼저 찾아라!
        // 그런다음 어떻게 개선할 수 있는지를 오민하라.

        // 1. 모든 가능한 수열들을 찾는다
        //    하나의 수열은 (시작점, 방향, 길이)에 의해서 정의
        //    방향은 0~7번까지의 수로 표현
        // 2. 정수값으로 환산한다.
        // 3. 만약 그것이 소수면 출력한다.

        try {
            Scanner inFile = new Scanner(new File("src/Chapter1/data.txt"));
            n = inFile.nextInt();
            grid = new int[n][n];

            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    grid[i][j] = inFile.nextInt();
                }
            }

            inFile.close();

            for(int x=0; x<n; x++) {
                for(int y=0; y<n; y++) {
                    for(int dir=0; dir<8; dir++) {
                        for(int len=1; len<=n; len++) {

                            int value = computeValue(x, y, dir, len);
                            if(value != -1 && isPrime(value)) {
                                System.out.println(value);
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file");
        }


    }

    // 수열의 출발점 (x,y), 방향(dir), 길이(len) 정수로 환산
    // 값이 없을 경우 -1 리턴
    public static int computeValue(int x, int y, int dir, int len) {
        int value = 0;
        for(int i=0; i<len; i++) {
            int digit = getDigit(x, y, dir, i);

            if(digit == -1) {
                return -1;
            } else {
                value = value * 10 + digit;
            }
        }
        return value;
    }

    static int[] offsetX = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] offsetY = {-1, -1, 0, 1, 1, 1, 0, -1};

    public static int getDigit(int x, int y, int dir, int k) {
        int newX = x + k * offsetX[dir];
        int newY = y + k * offsetY[dir];

//        switch (dir) {
//            case 0: newY -= k; break;
//            case 1: newX += k; newY -= k; break;
//            case 2: newX += k; break;
//            case 3: newX += k; newY += k; break;
//            case 4: newY += k; break;
//            case 5: newX -= k; newY += k; break;
//            case 6: newX -= k; break;
//            case 7: newX -= k; newY -= k; break;
//        }
        if(newX < 0 || newX >= grid.length || newY < 0 || newY >= grid.length ) {
            return -1;
        } else {
            return grid[newX][newY];
        }
    }

    public static boolean isPrime(int a) {
        if(a < 2) {
            return false;
        } else {
            for(int i=2; i*i < a; i++) {
                if(a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
