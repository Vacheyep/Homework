package date;

public class Model {
    private int numbers;
    private String words;

    public Model(int numbers, String words) {
        this.numbers = numbers;
        this.words = words;
    }
    public Model(Model model){
        this.numbers = model.numbers;
        this.words = model.words;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Model{" +
                "numbers=" + numbers +
                ", words='" + words + '\'' +
                '}';
    }
}
