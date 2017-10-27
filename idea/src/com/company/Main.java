package com.company;

import com.company.stec.stec1.StackofItem;
import com.company.stec.stec1.StackofStrings;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
private  static void StackofStrings (Scanner in, PrintStream out) {
    // to be or not to - be - - that - - - is
    StackofStrings stack = new StackofStrings();
    while(in.hasNext()){
        String s = in.next();
        if ((s.equals("-"))){
            out.print(stack.pop()+ " ");
        }else{
            stack.push(s);
        }
    }
}
    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        StackofItem (in,out);
    }
}
    private  static void StackofItems (Scanner in, PrintStream out) {

        StackofItem <Integer> stack = new StackofItem();
        while(in.hasNext()){
            String s = in.next();
            if ((s.equals("0"))){
                out.print(stack.pop()+ " ");
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
    }