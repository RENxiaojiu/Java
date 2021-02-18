package BookSystem.Operation;

import BookSystem.BookList;

import java.util.Scanner;

public class Del implements IOperation {
    @Override
    public void word(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("删除书籍");
        System.out.println("请输入要删除的书籍名称");
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if (name.equals(bookList.getBooks(i).getName())) {
                break;
            }
        }
        if(i >= bookList.getSize()) {
            System.out.println("您输入的 [" + name + "] 书籍没有找到，删除失败！");
        }
        if(i == bookList.getSize() - 1) {
            int curSize = bookList.getSize();
            bookList.setSize(curSize - 1);
            System.out.println("删除书籍成功！");
            return;
        }
        if(i < bookList.getSize()) {
            int curSize = bookList.getSize();
            bookList.setBooks(i, bookList.getBooks(curSize - 1));
            bookList.setSize(curSize - 1);
            System.out.println("删除书籍成功！");
        }
    }
}
