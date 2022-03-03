package HOMEWORK.Day19.Task3;

public class SMM extends Marketing{

    public SMM(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    public SMM() {
    }

    @Override
    public void marketing(){
        System.out.println("SMM");
    }
}
