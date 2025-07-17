package team0715.controller;

import team0715.model.dao.LoanDao;
import team0715.model.dto.LoanDto;
import java.util.ArrayList;

public class LoanController {

    // 0. 싱글톤 생성(loanController)
    private LoanController(){}
    private static final LoanController loanController = new LoanController();
    public static LoanController getInstance(){
        return loanController;
    }

    // 0. 싱글톤 호출(loanDao)
    private LoanDao loanDao = LoanDao.getInstance();


    // 3. 메소드
    // 3-1. 내대출현황 메소드
    public ArrayList<LoanDto> getLoanStatus(){
        return loanDao.getLoanStatus();
    } // getLoanStatus() end

} // class end
