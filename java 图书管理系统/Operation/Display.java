package BookSystem.Operation;

import BookSystem.BookList;

public class Display implements IOperation {
    @Override
    public void word(BookList bookList) {
        System.out.println("打印书籍列表");
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBooks(i));
        }
    }


}
