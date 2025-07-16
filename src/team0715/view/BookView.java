package team0715.view;

import team0715.controller.BookController;
import team0715.controller.MemberController;

import static team0715.AppStart.scan;

public class BookView {
    private BookView(){}
    private static final BookView bookView = new BookView();
    public static BookView getInstance(){
        return bookView;
    }//public static BookView end
    private BookController bookController = BookController.getInstance();


    //2) controller 싱글톤 가져오기
    private MemberController memberController = MemberController.getInstance();


    // 3. 메소드
    // 3-1. 도서등록 메소드
    public void bookPost(){
        System.out.println("--- 도서 등록 ---");
        System.out.println("도서명: ");
        String btitle= scan.next();
        System.out.println("저자:");
        String bname= scan.next();
        boolean result=bookController.bookPost(btitle,bname);
        if(result==true){
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
