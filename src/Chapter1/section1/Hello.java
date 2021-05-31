package Chapter1.section1;

/*
 * class이름과 파일명이 동일해야 함.
 * class이름의 첫글자는 대문자
 * 이름 변경시 refactor > rename
 */

public class Hello {

    /*
     * main method (자바에서는 함수라는 말을 공식적으로 사용하진 않음, C언어로 치면 funtion과 같음)
     * C : 함수들의 집합. 함수를 감싸고 있는 다른 개념 없음.
     * Java : 클래스들의 집합. 클래스 = 함수의 집합
     */
    public static void main(String[] args) {
        System.out.println("Hello Java!!!");
    }
}
