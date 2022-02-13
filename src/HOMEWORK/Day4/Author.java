package HOMEWORK.Day4;

public class Author {
    String name;
    String email;
    char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;

    }
    public void method(){
        System.out.println(
                "Name:" + " " + name + " " + "Email:" + " " + email + " " + "Gender:" + " " + gender );
    }
}
