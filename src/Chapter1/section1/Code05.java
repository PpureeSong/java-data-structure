package Chapter1.section1;

public class Code05 {

    public static void main(String[] args) {
        // array : 동일한 타입의 데이터 여러개를 한 번에 저장 할 수 있는 특별한 형태의 변수

        // declaare the array
        int[] grades;

        // allocte memory for 5 indices : 배열을 선언한 후에 배열의 크기를 지정하면서 생성
        grades = new int[5];

        grades[0] = 100;
        grades[1] = 76;
        grades[2] = 92;
        grades[3] = 95;
        grades[4] = 14;

        System.out.println("for문");
        for(int i = 0; i < grades.length; i++) {
            System.out.println("Grade"+ (i+1)+ ": " + grades[i]);
        }


        System.out.println("while문");
        int i = 0;
        while(i < grades.length) {
            System.out.println("Grade"+ (i+1)+ ": " + grades[i]);
            i++;
        }

    }
}
