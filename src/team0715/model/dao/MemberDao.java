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
    // 회원정보 전체리스트 DB
    private static ArrayList<MemberDto> memberDB = new ArrayList<>();
    // static 초기화 블록 → 클래스가 처음 로딩될 때 단 한 번 실행됨
    // 관리자(admin) 정보 객체 직접 생성
    static {
        MemberDto admin = new MemberDto(0, "admin", "1234", "010-1111-2222", "관리자", 0);
        memberDB.add(admin);
    }
    // 회원정보 전체리스트 DB 조회 메서드
    public ArrayList<MemberDto> getMemberDB() {
        return memberDB;

    }

    // 3. 메소드
    // 3-1. 회원가입 메소드
//    private int mno = 0;// 회원번호(PK:mno) 자동번호 초기화  : 뷰의 입력값이 없어서 충돌남.
//    private int mtype = 1;// 회원유형(일반유저) 고정
//    public int getMno() { return mno;}
//    public int getMtype() { return mtype;}
    public boolean signup(int mno, String mid, String mpwd, String mphone, String mname, int mtype ){
        boolean result = false;
        MemberDto memberDto = new MemberDto(++mno, mid,mpwd,mphone,mname, mtype);
        memberDB.add(memberDto);
        result = true;
        return result;
    } // func end


    // 3-2. 로그인 메소드
    public MemberDto login( String mid, String mpwd ){
        MemberDto result = null;
        for(int i = 0; i < memberDB.size(); i++ ){
            MemberDto member = memberDB.get(i);
            if( mid.equals( member.getMid()) && mpwd.equals( member.getMpwd()) ){
                result = member; // 로그인 입력 아이디와 memberDB 일치하면 리턴 true
                return result;
            }
        } // for end
        return result;
    }// func end


    // 3-2. 로그인 메소드_250718_booleen
    // 작동 성공 확인: 단, 회원유형정보도 필요하기에 리턴값을 booleen --> MemberDto 변경
//    public boolean login( String mid, String mpwd ){
//        boolean result = false;
//        for(int i = 0; i < memberDB.size(); i++ ){
//            MemberDto member = memberDB.get(i);
//            if( mid.equals( member.getMid()) && mpwd.equals( member.getMpwd()) ){
//                result = true; // 로그인 입력 아이디와 memberDB 일치하면 리턴 true
//                return result;
//            }
//        } // for end
//        return result;
//    }// func end


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
