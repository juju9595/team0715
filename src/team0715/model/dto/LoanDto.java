package team0715.model.dto;

public class LoanDto {

    // 1. 멤버 변수
    private int lno;        // pk.대출번호
    private int mno;        // fk.(대출)회원번호
    private int bno;        // fk.(대출)도서번호
    private String lStart;  // 대출일시
    private String lEnd;    // 반납일시

    // 2. 생성자(기본/전체)
    public LoanDto() {
    }

    public LoanDto(int lno, int mno, int bno, String lStart, String lEnd) {
        this.lno = lno;
        this.mno = mno;
        this.bno = bno;
        this.lStart = lStart;
        this.lEnd = lEnd;
    }

    // 3. 메소드(getter/setter/toString)
    public int getLno() {
        return lno;
    }

    public int getMno() {
        return mno;
    }

    public int getBno() {
        return bno;
    }

    public String getlStart() {
        return lStart;
    }

    public String getlEnd() {
        return lEnd;
    }

    public void setLno(int lno) {
        this.lno = lno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public void setlStart(String lStart) {
        this.lStart = lStart;
    }

    public void setlEnd(String lEnd) {
        this.lEnd = lEnd;
    }

    @Override
    public String toString() {
        return "LoanDto{" +
                "lno=" + lno +
                ", mno=" + mno +
                ", bno=" + bno +
                ", lStart='" + lStart + '\'' +
                ", lEnd='" + lEnd + '\'' +
                '}';
    }
}// class end
