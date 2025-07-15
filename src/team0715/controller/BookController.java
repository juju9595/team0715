package team0715.controller;

import team0715.model.dao.BookDao;

public class BookController {
    private BookController(){}
    private static final BookController bookController = new BookController();
    public static BookController getInstance(){
        return bookController;
    } //public static BookController end
    private BookDao bookDao = BookDao.getInstance();
}
