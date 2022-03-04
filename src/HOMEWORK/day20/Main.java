package HOMEWORK.day20;

import HOMEWORK.day20.task2.Language;

public class Main {
    public static void main(String[] args) {

        Language language = new Language() {
            @Override
            public String getName() {
                System.out.println();
                return getName();
            }
        };
    }
}
