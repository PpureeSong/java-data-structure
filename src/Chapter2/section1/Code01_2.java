package Chapter2.section1;


public class Code01_2 {
    public static void main(String[] args) {

        Person1 first = new Person1(); //object - new 생성자로 만들어짐

        first.name = "John";
        first.number = "0101231234";

        System.out.println("Name: "+ first.name + ", Number: "+ first.number);

        Person1 second = first; //동일한 객체의 주소를 참조하고 있음

        second.name = "Tom";
        System.out.println("Second Name: "+  second.name + ", Number: "+  second.number);

        Person1[] members = new Person1[100];
        members[0] = first;
        members[1] = second;

        System.out.println("First Name: "+  members[0].name + ", Number: "+  members[0].number);
        System.out.println("Second Name: "+  members[1].name + ", Number: "+  members[1].number);


        // null point exception : 객체를 생성해주지 않았기 때문에
        members[2].name = "Song";
        members[2].number = "0103333333";

        System.out.println("Third Name: "+  members[2].name + ", Number: "+  members[2].number);

    }
}
