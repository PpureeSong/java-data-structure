package Chapter2.section2;

import Chapter2.section1.MyPoint1;
import Chapter2.section1.MyRectangle1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code09 {

    static MyRectangle2[] rects = new MyRectangle2[10];
    static int n =0;

    public static void main(String[] args) {

        try {
            Scanner inFile = new Scanner(new File("src/Chapter2/data2.txt"));

            while (inFile.hasNext()) {
                rects[n] = new MyRectangle2(inFile.nextInt(), inFile.nextInt(), inFile.nextInt(), inFile.nextInt());
                n++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("No File");
            System.exit(1);
        }

        bubbleSort();

        for(int i=0; i<n; i++) {
            System.out.println(rects[i].toString());
        }
    }

    public static void bubbleSort() {
        for(int i=n-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(rects[j].calcArea()> rects[j+1].calcArea()) {
                    MyRectangle2 tmp = rects[j];
                    rects[j] = rects[j+1];
                    rects[j+1] = tmp;
                }
            }
        }
    }



}
