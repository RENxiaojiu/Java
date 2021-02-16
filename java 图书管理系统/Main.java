package BookSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while(true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = scanner.next();
        System.out.println("请输入您的身份: 0. 管理员  1. 普通用户");
        while(true) {
            int who = scanner.nextInt();
            if(who == 0) {
             return new Admin(name);
            } else if(who == 1) {
            return new NormalUser(name);
            } else {
                System.out.println("您的输入有误，请重新输入");
            }
        }
    }
}
