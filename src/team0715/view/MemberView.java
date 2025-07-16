package team0715.view;

import team0715.controller.MemberController;

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

    // ★★ 로그인 후 로그인ID 정적변수 초기화 및 setter ★★
    private static String loginMember = null;
    public String getLoginMember() { return loginMember; }
    public String setLoginMember( String mid ) { return loginMember = mid; }

    // 3. 메소드
    // 3-1 회원가입 메소드

    private int mno = 0;// View에서 직접 회원정보 증가
    public void signup(){
        System.out.println("--- 회원 가입 ---");
        System.out.println("아이디 : "); String mid = scan.next();
        System.out.println("비밀번호 : "); String mpwd = scan.next();
        System.out.println("이름 : "); String mname = scan.next();
        System.out.println("연락처 : "); String mphone = scan.next();
        mno++; // 회원번호 증가
        boolean result = memberController.signup(mno, mid, mpwd, mphone, mname);
        if(result) {
            if (mid.equals("admin")) {
                System.out.println("[안내] 관리자 계정이 등록되었습니다.");
            } else {
                System.out.println("[안내] 회원가입이 완료되었습니다.");}
            } else {
                System.out.println("[경고] 이미 존재하는 아이디입니다.");
        }
    }

    // 3-2 로그인 메소드
    public void login() {
        System.out.println("--- 로그인 ---");
        System.out.print("아이디 : "); String mid = scan.next();
        System.out.print("비밀번호 : "); String mpwd = scan.next();


        boolean loginResult = memberController.login(mid, mpwd);
        if (!loginResult) {
            System.out.println("[경고] 로그인 정보가 일치하지 않습니다.");
            return;
        }
        setLoginMember( mid );
        System.out.println(  getLoginMember() );

        System.out.printf("[안내] %s님, 환영합니다.\n", mid);

    } // login() end.
}//class e
