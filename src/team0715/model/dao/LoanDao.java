package team0715.model.dao;

import team0715.model.dto.LoanDto;
import java.util.ArrayList;

public class LoanDao {//class s
    private LoanDao(){}
    private static final LoanDao loanDao = new LoanDao();
    public static LoanDao getInstance(){
        return loanDao;
    } //public static LoanDao end
    

    // 대출현황 리스트 DB 생성
    private ArrayList<LoanDto> loanDB = new ArrayList<>();


    // 3. 메소드
    // 3-1. 내대출현황 메소드
    public ArrayList<LoanDto> getLoanStatus(){
        return loanDB;
    } //loanStatus() end


}//class end
