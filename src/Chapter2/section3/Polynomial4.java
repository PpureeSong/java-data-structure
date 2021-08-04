package Chapter2.section3;

import Chapter2.section3.Term4;

public class Polynomial4 {

    private char name;       //다항식의 이름
    private Term4[] terms;    //항
    private int nTerms;  //다항식을 구성하는 항의 개수

    public Polynomial4() {
        nTerms = 0;
        terms = new Term4[100];
    }

    public Polynomial4(char name) {
        this.name = name;
        nTerms = 0;
        terms = new Term4[100];
    }

    public char getName() {
        return name;
    }

    public int calcPolynomial(int x) {
        int result = 0;
        for(int i=0; i<nTerms; i++) {
            result += terms[i].calcTerm(x);
        }
        return result;
    }

    public void printPolynomial() {
        for(int i=0; i<nTerms; i++) {
            terms[i].printTerms();
            System.out.print('+');
        }
        System.out.println();
    }

    public void addTerm( int c, int e) {
        int index = findTerm(e);
        if(index != -1) {
            terms[index].setCoef(terms[index].getCoef() + c); // -3x + 5x = 2x
        } else {
            int i = nTerms-1;
            while( i >= 0 && terms[i].getExpo() < e) {
                terms[i+1] = terms[i];
                i--;
            }
            terms[i+1] = new Term4(c, e);
            nTerms ++;
        }
    }

    private int findTerm(int e) {
        for(int i=0; i<nTerms && terms[i].getExpo() >= e; i++) {
            if(terms[i].getExpo() == e) {
                return i;
            }
        }
        return -1;
    }
}
