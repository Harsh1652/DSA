package Strings;

import java.util.HashMap;
import java.util.Map;

public class CalculateFreqWords {
    static void CountWordFrequrncies(String inputString){
        String[] words = inputString.split(" ");
        Map<String , Integer> freq = new HashMap<>();
        for (String Word : words){
            freq.put(Word,freq.getOrDefault(Word,0) + 1);
        }

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "apple banana mango apple mango banana apple banana mango apple apple mango";
        CountWordFrequrncies(input);
    }
}
