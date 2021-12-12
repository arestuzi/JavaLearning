package top.binglj.chapter2;

import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入登陆用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入登陆密码：");
        String password = scanner.nextLine();

        if (!username.equals("mr")) {
            System.out.println("用户名非法。");
        } else if(!password.equals("mrsoft")) {
            System.out.println("登陆密码错误");
        } else {
            System.out.println("恭喜您，登陆信息通过验证");
        }
    }
}
