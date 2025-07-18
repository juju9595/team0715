package team0715.model.dto;

public class MemberDto {

    // 1. 멤버변수
    private int mno;       // pk.회원번호
    private String mid;    // 아이디
    private String mpwd;   // 비밀번호
    private String mphone; // 연락처
    private String mname;  // 이름
    private int mtype;     // 회원유형

    // 2.생성자(기본/전체)
    public MemberDto(){}

    public MemberDto(int mno, String mid, String mpwd, String mphone, String mname, int mtype) {
        this.mno = mno;
        this.mid = mid;
        this.mpwd = mpwd;
        this.mphone = mphone;
        this.mname = mname;
        this.mtype = mtype;
    }

    public MemberDto(String mid, String mpwd, String mphone, String mname) {

        this.mid = mid;
        this.mpwd = mpwd;
        this.mphone = mphone;
        this.mname = mname;

    }

    public MemberDto(String mid, String mpwd ){
        this.mid = mid;
        this.mpwd = mpwd;
    }

    // 3. 메소드(getter/setter/toString)

    public int getMno() {
        return mno;
    }

    public String getMid() {
        return mid;
    }

    public String getMpwd() {
        return mpwd;
    }

    public String getMphone() {
        return mphone;
    }

    public String getMname() {
        return mname;
    }

    public int getMtype() {return mtype;}

    public void setMno(int mno) {
        this.mno = mno;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public void setMpwd(String mpwd) {
        this.mpwd = mpwd;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setMtype(int mtype) {
        this.mno = mtype;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "mno=" + mno +
                ", mid='" + mid + '\'' +
                ", mpwd='" + mpwd + '\'' +
                ", mphone='" + mphone + '\'' +
                ", mname='" + mname + '\'' +

                '}';
    }
} // class end
