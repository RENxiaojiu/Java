package BookSystem.Operation;

import BookSystem.BookList;

public class Exit implements IOperation {
    @Override
    public void word(BookList bookList) {
        System.out.println("退出程序");
        System.exit(0);
    }
}
