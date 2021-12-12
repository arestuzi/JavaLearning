package top.binglj.chapter2;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;
            PrintStream ps = new PrintStream("./log.txt");
            System.setOut(ps);
            int age = 18;
            System.out.println("the variable age is defined, initial value is 18");
            String sex = "female";
            System.out.println("the variable sex is defined, initial value is female");
            String info = "this is a " + sex + " ,whose age is " + age;
            System.out.println("the value of two strings is " + info);
            System.setOut(out);
            System.out.println("The program ran, please check the log");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
