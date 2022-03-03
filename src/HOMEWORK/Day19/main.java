package HOMEWORK.Day19;

import HOMEWORK.Day19.Task1.Animals;
import HOMEWORK.Day19.Task3.Accounting;

public class main {
    //task1
    /*
    ● ● Define a Animal class, which has two methods
    voice() and eat() with modificator protected
    ● ● Write Dog class where are overrided methods: voice() and
    eat()
     */
    public static void main(String[] args) {
        //Animals animals = new Animals();


        //task2
    /*
    ● ● Write Accounting.java class, which has fields:
    countOfEmployers, departmentName and has method account()
    ● ● Write TaxAccounting class, which has fields:
    countOfEmployers,departmentName, which extend Accounting
    class and override account() method,which calculate
    taxOfCompany
    ● ● Write FinancialAccount class, which has fields:
    countOfEmployers,departmentName, which extend
    TaxAccounting class and override account() method,which
    calculate salaryOfEmployeers
    *Don’t forget about encapsulation
     */

        //task3
    /*
    Task 3
    ● ● Write ItCompany java class which has fields:
    countOfEmployers, companyName and has method account()
    ● ● Write Accounting.java class, which extend iTCompany class
    and has fields: countOfEmployers, departmentName and has
    method account()
    ● ● Write TaxAccounting class, which has fields:
    countOfEmployers,departmentName, which extend Accounting
    class and override account() method,which calculate
    taxOfCompany
    ● ● Write FinancialAccount class, which has fields:
    countOfEmployers,departmentName, which extend
    TaxAccounting class and override account() method,which
    calculate salaryOfEmployeers
    ● ● Write Marketing class, which extend iTCompany class and has
    fields: countOfEmployers, departmentName and has method
    marketing()
    ● ● Write SMM class, which extend Marketing class and has fields:
    countOfEmployers, departmentName and override method
    marketing()
    ● ● Write SEO class, which extend Marketing class and has fields:
    countOfEmployers, departmentName and override method
    marketing()
    */

        Accounting accounting = new Accounting(14,"name","dname");
        accounting.toString();
    }
}
