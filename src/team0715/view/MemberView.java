package team0715.view;

import team0715.controller.MemberController;
import team0715.model.dto.MemberDto;

import static team0715.view.Index.scan;

public class MemberView {

    // 0. 싱글톤 생성(memberView)
    private MemberView(){}
    private static final MemberView memberView = new MemberView();
    public static MemberView getInstance() {
        return memberView;
    }

    // 0. 싱글톤 호출(memberController)
    private MemberController memberController = MemberController.getInstance();

    // 1. 멤버변수
    // ★★ 로그인ID 정적변수 초기화 (setter/getter)
    private static String loginMember = null;
    public String getLoginMember() { return loginMember; }
    public String setLoginMember( String mid ) { return loginMember = mid; }

    // 3. 메소드
    // 3-1. 회원가입 메소드
    private int mno = 0;// 회원번호(PK:mno) 자동번호 초기화
    private int mtype = 1;// 회원유형(일반유저) 고정
    public void signup(){
        System.out.println("--- 회원 가입 ---");
        System.out.print("아이디 : "); String mid = scan.next();
        System.out.print("비밀번호 : "); String mpwd = scan.next();
        System.out.print("이름 : "); String mname = scan.next();
        System.out.print("연락처 : "); String mphone = scan.next();

        mno++; // 회원번호(mno) 증가
        boolean result = memberController.signup(mno, mid, mpwd, mphone, mname, mtype);
        if(result) {
            if ( mid.equals("admin") ) {
                System.out.println("[경고] 이미 존재하는 아이디입니다.");
            } else {
                System.out.println("[안내] 회원가입 성공!");}
            }
    } // func end

    // 3-2. 로그인 메소드
    public boolean login() {
        System.out.println("--- 로그인 ---");
        System.out.print("아이디 : "); String mid = scan.next();
        System.out.print("비밀번호 : "); String mpwd = scan.next();

        MemberDto memberInfo = memberController.getMember( mid );
        System.out.println( memberInfo );


        boolean result = memberController.login(mid, mpwd);
        if ( result == true ) {
            setLoginMember( mid );
            System.out.println(  getLoginMember() );
            System.out.printf("[안내] %s님, 환영합니다.\n", memberInfo.getMname());

        }else{
            System.out.println("[경고] 아이디와 비밀번호를 확인하세요.");
        }
        return result;

    } // func end



}//class end
