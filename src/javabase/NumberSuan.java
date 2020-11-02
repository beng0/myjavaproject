package javabase;

import java.util.Scanner;

public class NumberSuan {
    public static void main(String[] args) {
        Scanner snn = new Scanner(System.in);

        String number1 = snn.nextLine();

        int nb1 = Integer.parseInt(number1);

        String number2 = snn.nextLine();
        int nb2 = Integer.parseInt(number2);

        int res = nb1 + nb2;

        System.out.println(res);
    }
}
