package team0715.view;

import team0715.controller.BookController;
import static team0715.view.Index.scan;

public class BookView {
    
    // 0.싱글톤 생성(bookView)
    private BookView(){}
    private static final BookView bookView = new BookView();
    public static BookView getInstance(){ return bookView; }//public static BookView end

    // 0. 싱글톤 호출(bookController)
    private BookController bookController = BookController.getInstance();


    // 3. 메소드
    // 3-1. 도서등록 메소드
    private int bno = 0;// 도서번호( PK:bno ) 자동번호 초기화
    public void bookPost(){
        System.out.println("--- 도서 등록 ---");
        System.out.print("도서명: ");
        String btitle = scan.next();
        System.out.print("저자:");
        String bname = scan.next();


        bno++; // 도서번호(bno) 증가
        boolean result = bookController.bookPost( bno,btitle,bname );
        if(result ==true){
            System.out.println("[안내]도서등록성공");
        }else{
            System.out.println("[경고]도서등록실패");
        }
    }

    // 3-2. 도서목록 메소드
    public void bookList(){

        System.out.println("도서목록");

    } //bookList() end



    // 3-3. 도서대출 메소드
    public void bookLoan(){

        System.out.println("도서대출");

    } //bookLoan() end



    // 3-4. 도서반납 메소드
    public void bookReturn(){

        System.out.println("도서반납");

    } //bookReturn() end


}// class end
