package team0715.model.dao;

import team0715.model.dto.LoanDto;
import java.util.ArrayList;

public class LoanDao {

    // 0. 싱글톤 생성(loanDao)
    private LoanDao(){}
    private static final LoanDao loanDao = new LoanDao();
    public static LoanDao getInstance(){
        return loanDao;
    } //public static LoanDao end

    // 1. 멤버변수
    // 대출현황 리스트 DB
    private ArrayList<LoanDto> loanDB = new ArrayList<>();


    // 3. 메소드
    // 3-1. 내대출현황 메소드
    public ArrayList<LoanDto> getLoanStatus(){
        return loanDB;
    } //loanStatus() end


}//class end
