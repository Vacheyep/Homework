package Day4;

public class Testemoloyee {
    public static void main(String[] args) {

        Employee employee = new Employee(
                00000000, "Vache", "IT", 22, 'M');
        Employee employee1 = new Employee(11111111, "Fiii","LIIIII",41,'M');
        Employee employee2 = new Employee(22222222,"Leee","LIIIII",55,'F');
        Employee employee3 = new Employee(33333333,"Treee","TREEEE",26,'M');
        Employee employee4 = new Employee(44444444,"Four","LIIIII",6,'F');


        //System.out.println(Employee.count);
        employee.emp();
        employee1.emp();
        employee2.emp();
        employee3.emp();
        employee4.emp();


    }
}
