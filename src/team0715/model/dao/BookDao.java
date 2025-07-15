package team0715.model.dao;

public class BookDao {
    private BookDao(){}
    private static final BookDao bookDao = new BookDao();
    public static BookDao getInstance(){
        return bookDao;
    }
}
