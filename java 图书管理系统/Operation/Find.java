package BookSystem.Operation;

import BookSystem.BookList;

import java.util.Scanner;

public class Find implements IOperation {
    @Override
    public void word(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("查阅书籍信息");
        System.out.println("请输入要查阅的书籍名称");
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if (bookList.getBooks(i).getName().contains(name)) {
                System.out.println(bookList.getBooks(i));
            }
        }
        if(i > bookList.getSize()) {
            System.out.println("您输入的 [" + name + "] 书籍没有找到，查阅失败！");
        }
    }
}
