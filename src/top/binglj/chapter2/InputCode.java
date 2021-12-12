package top.binglj.chapter2;

import java.util.Scanner;

public class InputCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      // 创建输入流扫描器
        System.out.println("请输入你的身份证号：");       // 提示用户输入
        String line = scanner.nextLine();             // 获取用户输入的一行文本
        // print the description of the text
        System.out.println("Total length of your ID is " + line.length());
    }
}
