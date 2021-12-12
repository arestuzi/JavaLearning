package top.binglj.chapter2;

import java.util.Scanner;

/**
 * 闰年需要满足两种条件
 * 1. 能被4整除但是不能被100整除
 * 2. 能被400整除
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        long year = scanner.nextLong();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年！");
        } else {
            System.out.println(year + "不是闰年！");
        }
    }
}
