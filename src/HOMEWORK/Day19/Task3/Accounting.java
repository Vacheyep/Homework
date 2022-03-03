package HOMEWORK.Day19.Task3;

public class Accounting extends ItCompany {

    public String departmentName;

    public Accounting(int countOfEmployers, String companyName, String departmentName) {
        super(countOfEmployers, companyName);
        this.departmentName = departmentName;
    }

    public Accounting(String departmentName) {
        this.departmentName = departmentName;
    }
    public Accounting(){}

    public void accounting(){
        System.out.println("accounting");
    }
}
