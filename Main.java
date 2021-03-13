package Test0129;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int n = 5;
//        fib(n);

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        System.out.println(sum(num));

//        int num = 10;
//        System.out.println(sum1(num));

        System.out.println(product(num));
    }

    //递归求 N 的阶乘
    public static int product(int num) {
        if (num == 1) {
            return 1;
        }
        return num * product(num - 1);
    }

    //递归求和
    public static int sum1(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum1(num - 1);
    }

    //递归求返回的数字之和
    public static int sum(int num) {
        if (num < 0) {
            return 0;
        } else if (num < 10) {
            return num;
        }
        return num % 10 + num / 10;
    }

    //递归求斐波那契数列
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib (n - 2);
    }
}
