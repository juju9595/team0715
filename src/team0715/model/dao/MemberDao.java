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
    private static ArrayList<MemberDto> memberDB = new ArrayList<>();
    // static 초기화 블록 → 클래스가 처음 로딩될 때 단 한 번 실행됨
    static {
        MemberDto admin = new MemberDto(0, "admin", "1234", "010-1111-2222", "관리자", 0);
        memberDB.add(admin);
    }
    // 필요 시 접근 메서드
    public ArrayList<MemberDto> getMemberDB() {
        return memberDB;

    }


    // 3. 메소드
    // 3-1. 회원가입 메소드
    public boolean signup(int mno, String mid, String mpwd, String mphone, String mname, int mtype ){
        boolean result = false;
        MemberDto memberDto = new MemberDto(mno, mid,mpwd,mphone,mname, mtype);
        memberDB.add(memberDto);
        result = true;
        return result;
    } // func end
    
    // 3-1. 로그인 메소드 _ 정은주
//    public boolean login(String mid, String mpwd){
//        boolean result = false;
//        MemberDto memberDto = new MemberDto(mid, mpwd);
//        memberDB.add(memberDto);
//        result = true;
//        return result;
//    }// login() end


    // 3-2. 로그인 메소드
    public boolean login( String mid, String mpwd ){
       boolean result = false;
        for(int i = 0; i < memberDB.size(); i++ ){
            MemberDto member = memberDB.get(i);
            if( mid.equals( member.getMid()) && mpwd.equals( member.getMpwd()) ){
                result = true; // 로그인 입력 아이디와 memberDB 일치하면 리턴 true
                return result;
            }
        } // for end
        return result;
    }// func end


    // 3-3. 회원정보(객체) 호출 메소드_ 잘 되는 것 확인함.
    public MemberDto getMember( String mid ){

        for(int i = 0; i < memberDB.size(); i++ ){
            MemberDto member = memberDB.get(i);
            if( mid.equals( member.getMid() ) ){
                return member; // 로그인 아이디와 일치하면, 회원정보 객체 반환
            }
        } // for end
        return null;
    } //func end


}//class end
