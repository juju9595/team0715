package team0715.view;


import team0715.controller.MemberController;
import team0715.model.dto.MemberDto;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberView {//class s
    private MemberView(){}
    private static final MemberView memberView = new MemberView();
    public static MemberView getInstance() {
        return memberView;
    }//public static MemberView end

    //2) controller 싱글톤 가져오기
    private MemberController memberController = MemberController.getInstance();

    //*모든 메소드에서 사용 가능한 Scanner 입력객체
    private Scanner scan = new Scanner(System.in);

    public void index(){
        for(;;){
            System.out.println("=========== 도서관리 시스템  ===========");
            System.out.println("  1.회원가입 | 2.로그인");
            System.out.println("==========================================");
            System.out.println("선택 >");
            int choose = scan.nextInt();
            if (choose == 1) {signup();
            }else if (choose==2){login();}
        }
    }

    //3) 회원가입 등록 입출력 구현
    public void signup(){
        System.out.println("--- 회원 가입 ---");
        System.out.println("아이디 : "); String mid = scan.next();
        System.out.println("비밀번호 : "); String mpwd = scan.next();
        System.out.println("이름 : "); String mname = scan.next();
        System.out.println("연락처 : "); String mphone = scan.next();
        boolean result = memberController.signup(mid, mpwd, mphone, mname);
        if(result) {
            if (mid.equals("admin")) {
                System.out.println("[안내] 관리자 계정이 등록되었습니다.");
            } else {
                System.out.println("[안내] 회원가입이 완료되었습니다.");}
            } else {
                System.out.println("[경고] 이미 존재하는 아이디입니다.");
        }
    }

    //3) 로그인 등록 입출력 구현
    public void login() {
        System.out.println("--- 로그인 ---");
        System.out.print("아이디 : "); String mid = scan.next();
        System.out.print("비밀번호 : "); String mpwd = scan.next();


        boolean loginResult = memberController.login(mid, mpwd);
        if (!loginResult) {
            System.out.println("[경고] 로그인 정보가 일치하지 않습니다.");
            return;
        }

        System.out.printf("[안내] %s님, 환영합니다.\n", mid);

        for (int i = 0; i < 100; i++) {
            if (mid.equals("admin")) {
                System.out.println("=========== 로그인 후 메뉴 (admin일경우) ===========");
                System.out.println("  1.도서등록 | 2.도서대출 | 3.도서반납 | 4.내대출현황 | 5.도서목록 | 6.로그아웃");
                System.out.println("================================================================");
                System.out.print("선택 > ");
                int sel = scan.nextInt();
                if (sel == 6) {
                    System.out.println("[안내] 로그아웃 되었습니다.");
                    break;
                } else {
                    System.out.println("[기능] 메뉴 실행...");
                }
            } else {
                System.out.println("=========== 로그인 후 메뉴 (일반유저 일경우) ===========");
                System.out.println("  1.도서대출 | 2.도서반납 | 3.내대출현황 | 4.도서목록 | 5.로그아웃");
                System.out.println("================================================================");
                System.out.print("선택 > ");
                int sel = scan.nextInt();
                if (sel == 5) {
                    System.out.println("[안내] 로그아웃 되었습니다.");
                    break;
                } else {
                    System.out.println("[기능] 메뉴 실행...");
                }
            }
        }
    }
}//class e
