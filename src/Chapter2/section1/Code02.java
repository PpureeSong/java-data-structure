package Chapter2.section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {

    static Person1[] members = new Person1[100];
    static int n = 0;

    public static void main(String[] args) {

        try {
            Scanner inFile = new Scanner(new File("src/Chapter2/data.txt"));

            while (inFile.hasNext()) {
                String nm = inFile.next();
                String nb = inFile.next();

                Person1 person = new Person1();
                person.name = nm;
                person.number = nb;
                members[n] = person;
                n++;
            }

            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            System.exit(1);
        }

        for(int i=0; i<n; i++) {
            System.out.println("Name: "+ members[i].name + ", Number: "+ members[i].number);
        }
    }
}
