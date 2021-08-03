package Chapter2.section2;

// 다각형과 점
// 입력으로 하나의 직교다각형(모든 변이 x-축 혹은 y-축과 평행한 다각형)과 또 하나의 점 p가 주어질 때
// 그 점이 다각형의 내부에 있는지 외부에 있는지 판단하는 프로그램을 작성하라.

// 입력형식의 예 : 시계방향으로 꼭지점의 좌표가 주어짐

// 알고리즘 : 점에서 시작하여 한 방향으로 무한히 뻗어가는 아무 직선을 하나 그어서 그것이 다각형의 변과 짝수 교차하면 외부, 홀 수 번 교차하면 내부에 있다.
// >> 직전과 변이 겹치게 되면 횟수를 세는것이 어려워짐. 문제를 조금 단순화하기 위해서 여기서는 점p가 다각형의 경계상에 있지 않고,
// 또한 다각형에는 p와 동일한 x혹은 y좌표를 가진 꼭지점은 없다고 가정한다.
// 꼭지점의 좌표값은 모두 짝수, 검사할 점 p의 좌표값은 홀수로 가정한다.

// bottom - up 방식으로

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("src/Chapter2/data3.txt"));
            int n = in.nextInt();
            OrthoPolygon thePolygon = new OrthoPolygon(n);
            for(int i=0; i<n; i++) {
                thePolygon.addVertex(in.nextInt(), in.nextInt());
            }
            MyPoint2 p = new MyPoint2(in.nextInt(), in.nextInt());
            in.close();
            if(thePolygon.contains(p)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch  (FileNotFoundException e) {
            System.out.println("No File");
            System.exit(1);
        }


    }
}
