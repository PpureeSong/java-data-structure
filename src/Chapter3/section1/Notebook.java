package Chapter3.section1;

// extends 상속 : 모든 멤버, 메서드들을 상속 받게 된다.
// IS-A관계(역은 성립하지 않음) : A Notebook is a Computer
// 사람 - 학생 : 학생 is a 사람
// 탈 것 - 자동차 : 자동차 is a 탈 것

// Computer is the superclass of Notebook. : bassclass, parentclass
// Notebook is a subclass of Computer. : extendedclass, childclass
public class Notebook extends Computer {

    public double screenSize;
    public double weight;

    public Notebook(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed, double screenSize, double weight) {
        super(manufacturer, processor, ramSize, diskSize, processorSpeed);
        this.screenSize = screenSize;
        this.weight = weight;
    }

    // 자식클래스가 똑같은 이름의 메서드를 만들어서 부모가 만든 메서드를 덮어씌워서 재정의 할 수 있다.
    @Override
    public String toString() {
        return "Notebook{" +
                super.toString() +
                ", screenSize=" + screenSize +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Notebook test = new Notebook("Dell", "i5", 4, 100, 3.2, 15, 1.2);
//        test.manufacturer = "Dell";
//        test.processor = "i5";
//        test.ramSize = 4;
//        test.diskSize = 1000;
//        test.processorSpeed = 3.2;
//
//        test.screenSize = 15;
//        test.weight = 1.2;

        double computerPower = test.computerPower();
        System.out.println("computerPower = " + computerPower);
    }
}
