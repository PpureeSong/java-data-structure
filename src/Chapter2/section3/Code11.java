package Chapter2.section3;

import Chapter2.section2.Polynomial3;

import java.util.Scanner;

// 항의 계수가 0일 때 항 없애기
// + 부호 처리

// main 메서드만 static이 되도록 한다.

public class Code11 {

     Polynomial3[] polys = new Polynomial3[100];
     int n;

    public void processCommand() {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("$ ");

            String command = kb.next();
            if(command.equals("create")) {
                char name = kb.next().charAt(0);
                polys[n] = new Polynomial3(name);
                n++;

            } else if(command.equals("add")) {
                char name = kb.next().charAt(0);
                int index = find(name);
                if(index == -1) {
                    System.out.println("No such polynomial exists.");
                } else {
                    int c = kb.nextInt();
                    int e = kb.nextInt();
                    polys[index].addTerm(c, e);
                }

            } else if(command.equals("calc")){
                char name = kb.next().charAt(0);
                int index = find(name);
                if(index == -1) {
                    System.out.println("No such polynomial exists.");
                } else {
                    int x = kb.nextInt();
                    int result = polys[index].calcPolynomial(x);
                    System.out.println("Result: " + result);
                }

            } else if(command.equals("print")){
                char name = kb.next().charAt(0);
                int index = find(name);
                if(index == -1) {
                    System.out.println("No such polynomial exists.");
                } else {
                    polys[index].printPolynomial();
                }
            } else if(command.equals("exit")) {
                break;
            }
        }
        kb.close();
    }

    private int find(char name) {
        for(int i=0; i<n; i++) {
            if(polys[i].name == name) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Code11 app = new Code11();
        app.processCommand();
    }

}
