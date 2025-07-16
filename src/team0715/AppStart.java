package team0715;

import team0715.view.BookView;
import team0715.view.LoanView;
import team0715.view.MemberView;

import java.util.Scanner;

public class AppStart {

    // 1. 멤버변수 Scanner 입력함수 객체 생성
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {//main s

        // 1.view 싱글톤 3종(Member/Book/Loan) 가져오기
        MemberView memberView = MemberView.getInstance();
        BookView bookView = BookView.getInstance();
        LoanView loanView = LoanView.getInstance();


        // 3. 도서관리 시스템 : 로그인 전 공통화면( index )
        for(;;){
            System.out.println("=========== 도서관리 시스템  ===========");
            System.out.println("  1.회원가입 | 2.로그인");
            System.out.println("==========================================");
            System.out.print("선택 > ");
            int choose = scan.nextInt();

            if ( choose == 1 ) { memberView.signup(); }  // 1. 회원가입 메소드
            else if ( choose== 2 ){  memberView.login(); // 2. 로그인 메소드
                // 로그인 성공시, 회원유형별( 관리자,일반유저 )  화면 처리
                for (;;) {
                    if ( false ) {  // 2 - 0. 회원 유형( mtype == 0 ) : 관리자인 경우
                        System.out.println("=========== 로그인 후 메뉴 (admin일경우) ===========");
                        System.out.println("  1.도서등록 | 2.도서대출 | 3.도서반납 | 4.내대출현황 | 5.도서목록 | 6.로그아웃");
                        System.out.println("================================================================");
                        System.out.print("선택 > ");
                        int sel = scan.nextInt();

                        if ( sel == 1 ) { bookView.bookPost(); }       // 1. 도서등록 메소드
                        else if ( sel == 2 ) { bookView.bookPost(); }  // 2. 도서대출 메소드
                        else if ( sel == 3 ) { bookView.bookReturn(); }// 3. 도서반납 메소드
                        else if ( sel == 4 ) { loanView.loanStatus(); }// 4. 내대출현황 메소드
                        else if ( sel == 5 ) { bookView.bookList(); }  // 5. 도서목록 메소드
                        else if ( sel == 6 ) { System.out.println("[안내] 로그아웃 되었습니다."); break; } // 6.로그아웃 메소드
                        else { System.out.println("[경고] 올바른 메뉴번호를 입력하세요.");  }
                    } else { // 2 - 1. 회원 유형( mtype == 1 ) : 일반유저 인 경우
                        System.out.println("================= 로그인 후 메뉴 (일반유저 일경우) ===============");
                        System.out.println("  1.도서대출 | 2.도서반납 | 3.내대출현황 | 4.도서목록 | 5.로그아웃");
                        System.out.println("================================================================");
                        System.out.print("선택 > ");
                        int sel = scan.nextInt();
                        if ( sel == 1 ) { bookView.bookPost(); }        // 1. 도서대출 메소드
                        else if ( sel == 2 ) { bookView.bookReturn(); } // 2. 도서반납 메소드
                        else if ( sel == 3 ) { loanView.loanStatus(); } // 3. 내대출현황 메소드
                        else if ( sel == 4 ) { bookView.bookList(); }   // 4. 도서목록 메소드
                        else if ( sel == 5 ) { System.out.println("[안내] 로그아웃 되었습니다."); break; } // 5. 로그아웃 메소드
                        else { System.out.println("[경고] 해당 메뉴는 관리자만 접근 가능합니다."); }
                    }
                } // 회원 로그인 이후 무한루프 end

            } // 2. 로그인 메소드

        } // 무한루프 end

    }//main end
}//class end
