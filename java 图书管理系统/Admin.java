package Practice;

import Practice.Operation.*;

import java.util.Scanner;

public class Admin extends User {

    public Admin(String name) {
        this.name = name;
        this.iOperations = new IOperation[]{
                new Find(),
                new Add(),
                new Del(),
                new Display(),
                new Exit()
        };
    }

    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello [" + name + "] 欢迎来到图书管理系统");
        System.out.println("==============================================");
        System.out.println("请输入您的选择：");
        System.out.println("1. 查阅书籍信息");
        System.out.println("2. 增添书籍信息");
        System.out.println("3. 删除书籍信息");
        System.out.println("4. 打印书籍列表");
        System.out.println("5. 退出程序");
        System.out.println("==============================================");
        int choice = scanner.nextInt();
        return choice;
    }
}
