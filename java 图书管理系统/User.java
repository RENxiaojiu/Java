package Practice;

import Practice.Operation.IOperation;

abstract public class User {
    protected IOperation[] iOperations;
    protected String name;

    public abstract int menu();

    public void doIOperation(int choice, BookList bookList) {
        this.iOperations[choice - 1].word(bookList);
    }
}



