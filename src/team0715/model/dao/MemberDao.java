package team0715.model.dao;

import team0715.model.dto.MemberDto;
import java.util.ArrayList;

public class MemberDao {

    // 0. 싱글톤 생성(memberDao)
    private MemberDao(){}
    private static final MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){
        return memberDao;
    }
    
    // 1. 멤버변수
    // 회원정보 리스트 DB
    private ArrayList<MemberDto> memberDB = new ArrayList<>();



    // 3. 메소드
    // 3-1. 회원가입 메소드
    public boolean signup(int mno, String mid, String mpwd, String mphone, String mname){
        boolean result = false;
        MemberDto memberDto = new MemberDto(mno, mid,mpwd,mphone,mname);
        memberDB.add(memberDto);
        result = true;
        return result;
    } // signup() end
    
    // 3-1. 로그인 메소드
    public boolean login(String mid, String mpwd){
        boolean result = false;
        MemberDto memberDto = new MemberDto(mid, mpwd);
        memberDB.add(memberDto);
        result = true;
        return result;
    }// login() end

}//class end
