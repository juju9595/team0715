package team0715.controller;

import team0715.model.dao.MemberDao;
import team0715.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberController {//class s
    //1)싱글톤
    private MemberController(){}
    private static final MemberController memController = new MemberController();
    public static MemberController getInstance() {
        return memController;
    } //public static MemberController end
    private MemberDao memberDao = MemberDao.getInstance();

    //3)회원가입 등록 기능 구현

    public boolean signup(String mid, String mpwd, String mname, String mphone){
        boolean result = false;
        result = memberDao.signup(mid, mpwd, mphone, mname);
        return result;
    }

    //3)로그인  등록 기능 구현
    public boolean login(String mid, String mpwd){
        boolean result = false;
        result = memberDao.login(mid, mpwd);
        return result;
    }

    //4) 전체조회 기능 구현

    //
}//class e
