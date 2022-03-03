package HOMEWORK.Day19.Task3;

public class SEO extends Marketing{

    public SEO(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    public SEO() {
    }

    @Override
    public void marketing(){
        System.out.println("SEO");
    }
}
