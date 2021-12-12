package top.binglj.chapter2;

import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a integer: ");
        long number = scan.nextLong();
        String check = (number % 2 == 0) ? "this is an even" : "This is an odd";
        System.out.println(check);
    }
}
