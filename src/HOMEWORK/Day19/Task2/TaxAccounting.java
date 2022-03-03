package HOMEWORK.Day19.Task2;

public class TaxAccounting extends Accounting{

    public TaxAccounting(int countOfEmployer, String departmentName) {
        super(countOfEmployer, departmentName);
    }
    public TaxAccounting(){

    }

    @Override
    public void account(){
        int taxOfCompany = countOfEmployer * 100;
    }

}
