package team0715.controller;

import team0715.model.dao.MemberDao;

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
    public boolean signup(int mno,String mid, String mpwd, String mname, String mphone){
        boolean result = false;
        result = memberDao.signup(mno, mid, mpwd, mphone, mname);
        return result;
    }

    // 3-2 로그인 메소드
    public boolean login(String mid, String mpwd){
        boolean result = false;
        result = memberDao.login(mid, mpwd);
        return result;
    }


}//class end
