package Chapter2.section1;


public class Code01 {
    public static void main(String[] args) {

        Person1 first = new Person1(); //object

        first.name = "John";
        first.number = "0101231234";

        System.out.println("Name: "+ first.name + ", Number: "+ first.number);

        Person1[] members = new Person1[100];
        members[0] = first;
        members[1] = new Person1();
        members[1].name = "David";
        members[1].number = "0102222222";

        System.out.println("Second Name: "+  members[1].name + ", Number: "+  members[1].number);


    }
}
