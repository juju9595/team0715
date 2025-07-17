package team0715.view;

import team0715.controller.LoanController;

public class LoanView {

    // 0. 싱글톤 생성(LoanView)
    private LoanView(){}
    private static final LoanView loanView = new LoanView();
    public static LoanView getInstance(){
        return loanView;
    } //public static LoanView end

    // 0. 싱글톤 호출(loanController)
    private LoanController loanController = LoanController.getInstance();


    // 3. 메소드

    // 3-1. 내대출현황 메소드
    public void loanStatus(){

    } //loanStatus() end

} // class end
