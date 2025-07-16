package team0715.controller;

import team0715.model.dao.MemberDao;


public class MemberController {//class s
    //1)싱글톤
    private MemberController(){}
    private static final MemberController memController = new MemberController();
    public static MemberController getInstance() {
        return memController;
    } //public static MemberController end
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


}//class e
