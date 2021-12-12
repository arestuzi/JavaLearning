package top.binglj.chapter2;

import java.util.Scanner;

public class VariableExchange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入变量A的值");
        long A = scan.nextLong();
        System.out.println("请输入变量B的值");
        long B = scan.nextLong();
        System.out.println("A=" + A + "\tB=" + B);
        System.out.println("执行变量互换");
        A = A ^ B;
        System.out.println("A=" + A + "\tB=" + B);
        B = B ^ A;
        System.out.println("A=" + A + "\tB=" + B);
        A = A ^ B;
        System.out.println("A=" + A + "\tB=" + B);
    }
}
