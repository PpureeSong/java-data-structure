package Chapter2.section1;

// class
// 서로 관련있는 데이터를 하나의 단위로 묶어두는 것
// 클래스는 결국 하나의 "타입"
// "사용자 정의 타입" : int, double처럼 java가 미리 정해놓은 타입이 아니라 사용자가 정의한 새로운 타입이라는 의미

// 프리미티브 타입의 변수 = 보통 변수 : 변수 자체에 값이 저장
// 프리미티브 타입이 아닌 모든 변수 = 참조 변수 : 실제 데이터가 저장될 "객체"는 new 명령으로 따로 만들어야 하고, 참조변수에는 객체의 주소를 저장한다.

public class Person1 {

    public String name;    // field, data member
    public String number;
}
