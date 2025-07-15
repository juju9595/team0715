package team0715.model.dto;

public class MemberDto {
    //1. 멤버변수
    private int mno; //회원번호
    private String mid; //아이디
    private String mpwd; // 비밀번호
    private String mphone; //연락처
    private String mname; //이름

    //2.생성자
    public MemberDto(){}

    public MemberDto(String mid, String mpwd, String mphone, String mname) {
        this.mid = mid;
        this.mpwd = mpwd;
        this.mphone = mphone;
        this.mname = mname;
        this.mno = mid.equals("admin") ? 1 : 0;
    }

    public MemberDto(String mid, String mpwd){
        this.mid = mid;
        this.mpwd = mpwd;
    }

    public MemberDto(int mno,String mid, String mpwd, String mphone, String mname) {
        this.mno = mno;
        this.mid = mid;
        this.mpwd = mpwd;
        this.mphone = mphone;
        this.mname = mname;
    }
//3. 메소드


    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMpwd() {
        return mpwd;
    }

    public void setMpwd(String mpwd) {
        this.mpwd = mpwd;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
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
}
