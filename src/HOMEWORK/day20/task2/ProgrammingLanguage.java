package HOMEWORK.day20.task2;

public class ProgrammingLanguage implements Language{
    public ProgrammingLanguage() {
    }

    @Override
    public String getName() {
        Language.super.getName();
        return "Prog";
    }
}
