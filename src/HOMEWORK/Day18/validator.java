package HOMEWORK.Day18;
//ex2
public class validator {

    private validator() {
    }

    public static boolean firstNameRange(String a){
        return a.length() > 3 && a.length() < 15;
    }
    public static boolean lastNameRange(String a) {
        return a.length() > 6 && a.length() < 20;
    }
    public static boolean ageRang(int a) {
        return a > 18 && a < 99;
    }
    public static int gender(String a) {
        return a.compareToIgnoreCase("male");
    }
    public static boolean passportId(String a) {
        if (a.startsWith("AN") && a.length() == 8){
            for (int i = 2; i < a.length(); i++) {
                if (a.charAt(i) < '0' && a.charAt(i) > '9'){
                    return false;
                }
            }
        }
        return true;
    }
}
