package HOMEWORK.Day18;
//ex4
public class Store {
    int count;
    String name;
    String fhone;
    int[] numbers;

    public boolean getCount() {
        return count > 2 && count < 50;
    }

    public boolean getName() {
        return name.length() > 3;
    }

    public boolean getFhone() {
        if (fhone.length() == 8) {
          if (fhone.contains("-")){
              return false;
          }
        }
        return true;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
