package team0715.model.dao;

import team0715.model.dto.BookDto;
import java.util.ArrayList;

public class BookDao {

    // 0. 싱글톤 생성(bookDao)
    private BookDao(){}
    private static final BookDao bookDao = new BookDao();
    public static BookDao getInstance(){ return bookDao; }

    // 1. 멤버변수
    // 도서목록 리스트 DB
    private ArrayList<BookDto> bookDB = new ArrayList<>();

    // 3. 메소드
    // 3-1 도서 등록 메소드
    public boolean BookPost(int bno , String btitle,String bname){
        boolean result=false;
        BookDto bookDto = new BookDto(bno, btitle, bname );
        bookDB.add(bookDto);
        result=true;
        return result;
    }

    // 3-2 도서목록 메소드
    public ArrayList<BookDto> getBookList(){
        return bookDB;
    }

//    // 3-3. 도서대출 메소드
//    public Strong bookLoan( int bno ){
//
//
//        BookDto boardDto = new BookDto( bno );
//       bookDB.add( boardDto );
//        return boardDto.
//
//
//
//    } //bookLoan() end
//
//
//    // 3-4. 도서반납 메소드
//    public Strong bookReturn(){
//
//        return getBtitle();
//
//    } //bookReturn() end


}//class end
