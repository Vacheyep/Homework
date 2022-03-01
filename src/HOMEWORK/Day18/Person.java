package HOMEWORK.Day18;


class Person {
//ex1

    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String gender;
    private String nationality;

    public String getFirstName(String firstName) {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportId(String passportId) {
        return passportId;
    }

    public String setPassportId(String  passportId) {
        return this.passportId = passportId;
    }

    public int getAge(int age) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender(String gender) {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality(String nationality) {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    void display(){
         System.out.println("Name is " + firstName);
         System.out.println("Last name is" + lastName);
         System.out.println("age is" + age);

    }


}
