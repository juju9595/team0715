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
    public boolean signup(){
        System.out.println("--- 회원 가입 ---");
        System.out.println("아이디 : "); String mid = scan.next();
        System.out.println("비밀번호 : "); String mpwd = scan.next();
        System.out.println("이름 : "); String mname = scan.next();
        System.out.println("연락처 : "); String mphone = scan.next();
        boolean result = true;
        System.out.println("[안내] 회원가입이 완료되었습니다.");
        return result;
    }

    //3) 로그인 등록 입출력 구현
    public boolean login(){
        boolean result = true;
        return result;
    }





}//class e
