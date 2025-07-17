package team0715.controller;

import team0715.model.dao.BookDao;
import team0715.model.dto.BookDto;
import java.util.ArrayList;

public class BookController {

    // 0. 싱글톤 생성(bookController)
    private BookController(){}
    private static final BookController bookController = new BookController();
    public static BookController getInstance(){ return bookController; }

    // 0. 싱글톤 호출(bookDao)
    private BookDao bookDao = BookDao.getInstance();


    // 3. 메소드
    // 3-1. 도서 등록 메소드
    public boolean bookPost(int bno, String btitle, String bname){
        boolean result=false;
        result=bookDao.BookPost( bno, btitle,bname);
        return  result;
    }

    // 3-2. 도서 목록 메소드
    public ArrayList<BookDto> getBookList(){
        return bookDao.getBookList();
    }

//    // 3-3. 도서대출 메소드
//    public Strong bookLoan( int bno ){
//
//        return getBtitle();
//
//    } // bookLoan() end
//
//
//
//    // 3-4. 도서반납 메소드
//    public Strong bookReturn(){
//
//        return getBtitle();
//
//    } // bookReturn() end




} // class end
