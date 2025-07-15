package team0715.view;

import team0715.controller.LoanController;

public class LoanView {
    private LoanView(){}
    private static final LoanView loanView = new LoanView();
    public static LoanView getInstance(){
        return loanView;
    } //public static LoanView end
    private LoanController loanController = LoanController.getInstance();
}
