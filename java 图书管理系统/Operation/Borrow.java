package BookSystem.Operation;

import BookSystem.BookList;

import java.util.Scanner;

public class Borrow implements IOperation {
    @Override
    public void word(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("借阅书籍");
        System.out.println("请输入要借阅的书籍名称：" );
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                break;
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("没有找到指定的书籍");
            return;
        }
        if (bookList.getBooks(i).isBorrow()) {
            System.out.println("该书籍已被借出");
            return;
        }
        bookList.getBooks(i).setBorrow(true);
        System.out.println("借书成功！");
    }
}
