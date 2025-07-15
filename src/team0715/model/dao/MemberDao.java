package team0715.model.dao;

public class MemberDao {//class s
    private MemberDao(){}
    private static final MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){
        return memberDao;
    }
}//class e
