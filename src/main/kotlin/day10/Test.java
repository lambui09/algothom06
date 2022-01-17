package day10;

import java.util.Scanner;
import java.util.Stack;
import java.lang.*;
public class Test {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        String molecule = sc.nextLine();
        String[] modeculeArr = molecule.split("");

        Stack<Integer> moleculeStack = new Stack<>();
        for(String ch: modeculeArr) {
            if (!ch.equals(")")) {
                if (ch.equals("(")) moleculeStack.push(-1);
                else if (isLetter(ch)) moleculeStack.push(massOfAtom(ch));
                else moleculeStack.push(moleculeStack.pop() * Integer.valueOf(ch));
                continue;
            }

            int mass = 0;
            while(!moleculeStack.isEmpty()) {
                int top = moleculeStack.pop();
                if (top == -1) break;
                mass += top;
            }
            moleculeStack.push(mass);
        }

        int result = 0;
        while(!moleculeStack.isEmpty()) {
            result += moleculeStack.pop();
        }

        System.out.println(result);
    }

    private static boolean isNumber(String s) {
        return s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")
                || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9");
    }

    private static boolean isLetter(String s) {
        return s.equals("C") || s.equals("H") || s.equals("O");
    }

    private static int massOfAtom(String str) {
        switch(str) {
            case "H": return 1;
            case "C": return 12;
            case "O": return 16;
        }
        return 0;
    }
}
