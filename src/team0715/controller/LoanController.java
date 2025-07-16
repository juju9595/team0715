package team0715.controller;

import team0715.model.dao.LoanDao;
import team0715.model.dto.LoanDto;

import java.util.ArrayList;

public class LoanController {
    private LoanController(){}
    private static final LoanController loanController = new LoanController();
    public static LoanController getInstance(){
        return loanController;
    } //public static LoanController end
    private LoanDao loanDao = LoanDao.getInstance();


    // 3. 메소드
    // 3-1. 내대출현황 메소드
    public ArrayList<LoanDto> getLoanStatus(){
        return loanDao.getLoanStatus();
    }


} // class end
