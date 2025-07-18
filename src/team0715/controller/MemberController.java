package team0715.controller;

import team0715.model.dao.MemberDao;
import team0715.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberController {//class s

    // 0. 싱글톤 생성(memberController)
    private MemberController(){}
    private static final MemberController memberController = new MemberController();
    public static MemberController getInstance() {
        return memberController;
    } 

    // 0. 싱글톤 호출(memberDao)
    private MemberDao memberDao = MemberDao.getInstance();



    // 3. 메소드
    // 3-1 회원가입 메소드
    public boolean signup(int mno,String mid, String mpwd, String mphone, String mname, int mtype){
        boolean result = false;
        result = memberDao.signup(mno, mid, mpwd, mphone, mname, mtype);
        return result;
    }

    // 3-2 로그인 메소드_ 정은주
//    public boolean login(String mid, String mpwd){
//        boolean result = false;
//        result = memberDao.login(mid, mpwd);
//        return result;
//    }

    // 3-2. 로그인 메소드
    public boolean login( String mid, String mpwd ){
        boolean result = false;
        result = memberDao.login(mid, mpwd);
        return result;
    }// func end

    // 3-3. 회원정보(객체) 호출 메소드
    public MemberDto getMember(String mid ){
        MemberDto member = null;
        member = memberDao.getMember( mid );
        return member; // 로그인 아이디와 일치하면, 회원정보 객체 반환
    } //func end

}//class end
