package team0715.model.dto;

public class BookDto {

    // 1. 멤버변수
    private int bno;       // pk.도서번호
    private String btitle;  // 도서명
    private String bname;   // 저자


    // 2. 생성자(기본/전체)
    public  BookDto(){}

    public  BookDto(int bno, String btitle, String bname) {
        this.bno = bno;
        this.btitle = btitle;
        this.bname = bname;
    }

    // 3. 메소드(getter/setter/toString)
    public int getBno() {
        return bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public String getBname() {
        return bname;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "bno=" + bno +
                ", btitle='" + btitle + '\'' +
                ", bname='" + bname + '\'' +
                '}';
    }
} // class end
