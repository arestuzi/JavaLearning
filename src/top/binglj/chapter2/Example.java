package top.binglj.chapter2;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a English string or decoded string");
        String password = scan.nextLine();
        char[] array = password.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char)(array[i] ^ 20000);
        }
        System.out.println("The result of incode or decode is: ");
        System.err.println(new String(array));
    }
}
