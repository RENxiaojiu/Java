package BookSystem.Operation;

import BookSystem.BookList;

import java.util.Scanner;

public class Return implements IOperation {
    @Override
    public void word(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("归还书籍");
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if (bookList.getBooks(i).getName().equals(name)){
                break;
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("该书不存在，不用归还！");
            return;
        }
        if (!bookList.getBooks(i).isBorrow()) {
            System.out.println("该书未被借出，不用归还！");
            return;
        }
        bookList.getBooks(i).setBorrow(false);
        System.out.println("还书成功！");
    }
}
