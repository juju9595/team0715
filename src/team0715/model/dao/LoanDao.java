package team0715.model.dao;

public class LoanDao {//class s
    private LoanDao(){}
    private static final LoanDao loanDao = new LoanDao();
    public static LoanDao getInstance(){
        return loanDao;
    } //public static LoanDao end
}//class e
