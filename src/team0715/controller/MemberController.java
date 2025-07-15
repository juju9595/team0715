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

    //3)등록 기능 구현

    public boolean signup(String mid, String mpwd, String mname, String mphone){
        boolean result = false;
        return result;
    }
    //
}//class e
