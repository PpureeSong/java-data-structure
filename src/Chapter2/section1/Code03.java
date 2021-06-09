package Chapter2.section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code03 {

    static Person1[] members = new Person1[100];
    static int n = 0;

    public static void main(String[] args) {

        try {
            Scanner inFile = new Scanner(new File("src/Chapter2/data.txt"));

            while (inFile.hasNext()) {
                String nm = inFile.next();
                String nb = inFile.next();

//                Person1 person = new Person1();
//                person.name = nm;
//                person.number = nb;
//                members[n] = person;

                members[n] = new Person1();
                members[n].name = nm;
                members[n].number = nb;
                n++;
            }

            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            System.exit(1);
        }

        bubbleSort();

        for(int i=0; i<n; i++) {
            System.out.println("Name: "+ members[i].name + ", Number: "+ members[i].number);
        }
    }

    public static void bubbleSort() {
        for(int i=n-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(members[j].name.compareToIgnoreCase(members[j+1].name) > 0 ) {
                    // class : 서로 관련이 있는 데이터 들끼리 묶어 준 것.
                    Person1 tmp = members[j];
                    members[j] = members[j+1];
                    members[j+1] = tmp;
                }
            }
        }
    }
}
