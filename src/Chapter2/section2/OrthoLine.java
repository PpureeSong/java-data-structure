package Chapter2.section2;

// ortho 수직, 직교를 의미
// 평면상의 수직, 수평 선분을 의미

public class OrthoLine {
    public MyPoint2 u; //선분의 한쪽 끝점
    public MyPoint2 v; //선분의 다른쪽 끝점

    public OrthoLine(MyPoint2 p, MyPoint2 q) {
        this.u = p;
        this.v = q;
        // 수직 선분의 경우 위쪽이 u, 오른쪽이 v,
        // 수평 선분의 경우 왼쪽이 u, 오른쪽이 v가 되도록 한다.
        if(p.x > q.x || p.x == q.x && p.y>q.y) {
            swap();
        }
    }

    private void swap() {
        MyPoint2 tmp = u;
        u = v;
        v = tmp;
    }

    public OrthoLine(int x1, int y1, int x2, int y2 ) {
        u = new MyPoint2(x1, y1);
        v = new MyPoint2(x2, y2);
    }

    // 수직선인지 : 양점의 x좌표가 같은 경우
    public boolean isVertical() {
        return (u.x == v.x);
    }

    // 다른 선분을 받아서 나 자신과 그 선분이 교차하는지 여부를 리턴
    // 수직인지 수평인지를 파악해야함
    public boolean intersects(OrthoLine other) {
        if( isVertical() && !other.isVertical()) {
            // 수평 선분의 양 끝 점이 수직선분의 양쪽에 하나씩 있어야 함 (모두 오론쪽에 있거나, 모두 왼쪽에 있으면 안됨)
            return other.u.x < u.x && other.v.x > u.x && other.u.y > u.y && other.u.y <  v.y;
        } else if (!isVertical() && other.isVertical()) {
            return other.u.y < u.y && other.v.y > u.y && other.u.x > u.x && other.u.x <  v.x;
        } else {
            // 둘다 수직, 둘다 수평인 경우 교차할 수 없음.
            return false;
        }
    }
}
