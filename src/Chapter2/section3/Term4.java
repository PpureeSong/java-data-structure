package Chapter2.section3;

public class Term4 {

    private int coef; // 계수 coefficient
    private int expo; // 자수 exponent

    // 생성자(constructor) : 클래스와 동일한 이름을 가지며 return 타입이 없는 메서드
    // 생성자는 객체를 생성할 때 장동으로 실행됨
    // 생성자가 있는 경우 객체의 생성과 초기화를 한번에 할 수 있음
    public Term4(int c, int e) {
        coef = c;
        expo = e;
    }

    //getter method
    public int getExpo() {
        return expo;
    }

    // getter, accessor
    public int getCoef() {
        return coef;
    }

    // setter, mutator
    public void setCoef(int coef) {
        this.coef = coef;
    }

    public int calcTerm( int x) {

        return (int) (coef * Math.pow(x, expo));
    }
    public void printTerms() {
        System.out.print(coef + "x^" + expo );
    }

}
