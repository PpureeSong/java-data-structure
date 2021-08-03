package Chapter2.section2;

// 다각형
public class OrthoPolygon {
    public int n = 0;            // 저장된 꼭지점의 개수
    public MyPoint2[] vertices; // 꼭지점들

    // 꼭지점의 개수가 k개인 다각형을 만든다.
    public OrthoPolygon(int k) {
        vertices = new MyPoint2[k];
    }

    // 새로운 꼭지점을 하나 추가하는 메서드
    public void addVertex(int x, int y) {
        vertices[n++] = new MyPoint2(x, y);
    }

    // 꼭지점들의 x-좌표의 최대값을 찾아서 반환
    public int maxX() {
        int max = vertices[0].x;
        for(int i=1; i<n; i++) {
            if(vertices[i].x > max) {
                max = vertices[i].x;
            }
        }
        return max;
    }

    // 점 p가 다각형 내에 포함되는지 검사
    public boolean contains(MyPoint2 p) {
        // 점 p에서 왼쪽 방향으로 다각형 외부까지 뻗어가는 하나의 선분 arrow
        // p의 반대쪽 점의 x좌표가 꼭지점들의 x좌표의 최대값보다 1이 크므로 이점은 반드시 다각형의 외부에 있다.
        OrthoLine arrow = new OrthoLine(p, new MyPoint2( maxX()+1, p.y));
        int count = 0;
        for(int i=0; i<n; i++) {
            // n-1번째 선분은 마지막 꼭지점과 첫번째 꼭지점을 연결하는 선분이다. (n-1)+1 % n = 0
            OrthoLine edge = new OrthoLine( vertices[i], vertices[(i+1)%n]);
            if(arrow.intersects(edge)) {
                count++;
            }
        }
        // arrow와 교차하는 다각형의 변의 개수가 짝수면 내부, 홀수면 외부
        return (count % 2 == 1);
    }
}
