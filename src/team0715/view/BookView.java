package team0715.view;

import 종합.team0715.controller.BookController;

public class BookView {
    private BookView(){}
    private static final BookView bookView = new BookView();
    public static BookView getInstance(){
        return bookView;
    }//public static BookView end
    private BookController bookController = BookController.getInstance();
}
