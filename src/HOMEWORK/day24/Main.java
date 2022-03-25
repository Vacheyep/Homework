package HOMEWORK.day24;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        String name = "adsbbccg";
//        int[] arr1 = {4, 5, 6, 5, 4, 5, 8, 8, 8, 9, 7, 4};
//        int[] arr2 = {4, 5, 6, 7, 8};

//        System.out.println(containsDup(arr1));
//        System.out.println(containsDup(arr2));
//        System.out.println(Arrays.toString(new int[]{allSingleElements(arr1)}));
        System.out.println(lengthOfLongest(name));
    }

    //1. Write a method which will check if given array
    //of integers contains duplicate element.
    static boolean containsDup(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            {
                if (set.contains(num)) {
                    return true;
                }
                set.add(num);
            }
        }
        return false;
    }

    //2. Write a method which prints elements that
    //occurred only once in the array.
    static int allSingleElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
                set.add(num);
                if (set.contains(num)){
                    break;
                }
            }

        return set.toArray().length;
    }

    //3. Write a method that counts duplicate characters
    //from a given string.
    static int countOfDuplicate(String arr) {
        Map<Integer, Character> map = new HashMap<>();
        int count = 0;
        for (int num = 0; num < arr.length(); num++) {
            if (map.containsValue(num)){
                count++;
            }
        }
        return count;
    }
    //4. Write a method that returns the first non-
    //repeated character from a given string.
    static char firstNonRepeated(String arr) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (char ch: arr.toCharArray()) {
            characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch,0) + 1);
        }
        for (char ch : arr.toCharArray()) {
            if (characterIntegerMap.get(ch) == 1){
                return ch;
            }
        }
        return 0;
    }

    //5. Write a method which will return the length of
    //the longest substring without repeating
    //characters.
    //“abba” – 2, “abcdaefjh” – 8

    static int lengthOfLongest(String arr){
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: arr.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
            for (char ch : arr.toCharArray()){
                if (map.get(ch) > 1){
                    break;
                }

                return ch;
            }
        return 0;
    }
}

