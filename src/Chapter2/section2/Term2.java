package Chapter2.section2;

import Chapter2.section1.Polynomial;
import Chapter2.section1.Term;

public class Term2 {

    public int coef; // 계수 coefficient
    public int expo; // 자수 exponent

    public int calcTerm( int x) {

        return (int) (coef * Math.pow(x, expo));
    }
    public void printTerms() {
        System.out.print(coef + "x^" + expo );
    }

}
