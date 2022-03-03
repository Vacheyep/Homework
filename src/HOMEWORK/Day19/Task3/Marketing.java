package HOMEWORK.Day19.Task3;

public class Marketing extends ItCompany{
    public String departmentName;
    public Marketing(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }
    public Marketing() {
    }

    public void marketing(){
        System.out.println("Marketing");
    }


}
