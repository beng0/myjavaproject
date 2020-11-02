package javabase;

/**
 * 逻辑判断演示
 * @author hejb -->这种注释叫文档注释
 *
 */
import java.util.Scanner;
public class LogicProcess {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        // 如果name是tom,则输出“你好，tom”
        // 如果是jim，则输出“欢迎您，jim”
        // 如果是其他，则输出“xxx,滚蛋”
        if("tom".equals(name)){
            System.out.println("你好，"+name);
        }
        else if ("jim".equals(name)){
            System.out.println("欢迎你，"+name);
        }
        else{
            System.out.println(name+"滚蛋！！！");
        }
    }
}
