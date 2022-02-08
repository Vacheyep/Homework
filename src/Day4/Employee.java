package Day4;

public class Employee {
    long id;
    String name;
    String departament;
    int age;
    char gender;
    static int count;

    public Employee(long id, String name, String departament, int age, char gender) {
        this.id = id;
        this.name = name;
        this.departament = departament;
        this.age = age;
        this.gender = gender;

    }
    /*

    public Employee(long id , char gender){
        this.id = 5447;
        this.gender = 'F';
     */




    public void emp () {
            System.out.println(id);
            System.out.println(name);
            System.out.println(departament);
            System.out.println(age);
            System.out.println(gender);


        }

   // public static void sum(String[] args) {
      //  System.out.println(count++);

    }

  //  }
