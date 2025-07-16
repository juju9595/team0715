package team0715.model.dao;

import team0715.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberDao {//class s
    private MemberDao(){}
    private static final MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){
        return memberDao;
    }
    private ArrayList<MemberDto> memberDB = new ArrayList<>();

    public boolean signup(int mno, String mid, String mpwd, String mphone, String mname){
        boolean result = false;
        MemberDto memberDto = new MemberDto(mno, mid,mpwd,mphone,mname);
        memberDB.add(memberDto);
        result = true;
        return result;
    }

    public boolean login(String mid, String mpwd){
        boolean result = false;
        MemberDto memberDto = new MemberDto(mid, mpwd);
        memberDB.add(memberDto);
        result = true;
        return result;
    }
}//class e
