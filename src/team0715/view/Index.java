package team0715.view;
import team0715.model.dto.MemberDto;

import java.util.Scanner;

public class Index {

    // 0. 싱글톤 생성(index)
    private Index(){}
    private static final Index index = new Index();
    public static Index getInstance(){
        return index;
    } //public static LoanView end

    // 0.싱글톤 호출( memberView/ bookView/ loanView )
    private MemberView memberView = MemberView.getInstance();
    private BookView bookView = BookView.getInstance();
    private LoanView loanView = LoanView.getInstance();


    // 1. 멤버변수
    // Scanner( 입력함수 ) 객체 정적변수 생성
    static Scanner scan = new Scanner(System.in);

    // 3. 메소드
    // 3-1. 도서관리 시스템 : 공통화면( index )
    public void index() {

        for (;;) { // 로그인 전 화면
            System.out.println("=========== 도서관리 시스템  ===========");
            System.out.println("  1.회원가입 | 2.로그인");
            System.out.println("=======================================");
            System.out.print("선택 > ");
            int choose = scan.nextInt();
            if ( choose == 1 ) { memberView.signup(); }  // 1. 회원가입 메소드
            else if ( choose == 2 ) {
                // 로그인 성공할 경우 화면!
                MemberDto result = memberView.login();
                System.out.println( result.getMtype() );
                if( result != null ){  // 2. 로그인 메소드
                    for (;;) {
                        if (  result.getMtype() == 0 ) {  // 1) 회원유형 : 관리자인 경우
                            System.out.println("=========== 로그인 후 메뉴 (admin일경우) ===========");
                            System.out.println("  1.도서등록 | 2.도서대출 | 3.도서반납 | 4.내대출현황 | 5.도서목록 | 6.로그아웃");
                            System.out.println("===================================================");
                            System.out.print("선택 > ");
                            int sel = scan.nextInt();

                            if (sel == 1) {
                                bookView.bookPost();
                            }       // 1. 도서등록 메소드
                            else if (sel == 2) {
                                bookView.bookPost();
                            }  // 2. 도서대출 메소드
                            else if (sel == 3) {
                                bookView.bookReturn();
                            }// 3. 도서반납 메소드
                            else if (sel == 4) {
                                loanView.loanStatus();
                            }// 4. 내대출현황 메소드
                            else if (sel == 5) {
                                bookView.bookList();
                            }  // 5. 도서목록 메소드
                            else if (sel == 6) {
                                System.out.println("[안내] 로그아웃 되었습니다.");
                                break;
                            } // 6.로그아웃 메소드
                            else {
                                System.out.println("[경고] 올바른 메뉴번호를 입력하세요.");
                            }

                        } else { // 2) 회원유형 : 일반유저 인 경우

                            System.out.println("================= 로그인 후 메뉴 (일반유저 일경우) ===============");
                            System.out.println("  1.도서대출 | 2.도서반납 | 3.내대출현황 | 4.도서목록 | 5.로그아웃");
                            System.out.println("================================================================");
                            System.out.print("선택 > ");
                            int sel = scan.nextInt();
                            if (sel == 1) {
                                bookView.bookPost();
                            }        // 1. 도서대출 메소드
                            else if (sel == 2) {
                                bookView.bookReturn();
                            } // 2. 도서반납 메소드
                            else if (sel == 3) {
                                loanView.loanStatus();
                            } // 3. 내대출현황 메소드
                            else if (sel == 4) {
                                bookView.bookList();
                            }   // 4. 도서목록 메소드
                            else if (sel == 5) {
                                System.out.println("[안내] 로그아웃 되었습니다.");
                                break;
                            } // 5. 로그아웃 메소드
                            else {
                                System.out.println("[경고] 해당 메뉴는 관리자만 접근 가능합니다.");
                            }
                        } // if(회원유형별 화면) end
                    } // 회원전용화면(로그인) 무한루프 end
                } // 로그인 성공!
            } // 2. 로그인 메소드 end
        } // 로그인 이전, 공통화면( index/무한루프 ) end
    } // index() end
} //class end
