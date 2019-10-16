package com.snowtoslow.StringParser;


import java.util.*;

public class StringParser {

    private int count = 0;

    public void getNrOfLetters(String text) {
        for (int i = 0; i < text.length(); i++) {
            count = i;
        }
        System.out.println("Nr of letters in text:" + count);
    }

    public void getNrOfSEntences(String text) {
        int nrOfSentences = text.split("[!?.]+").length;
        System.out.println("Nr of sentences is :" + nrOfSentences);
    }

    public void getNrOfConsAndWovels(String text) {
        int nrOfWovels = text.split("[aeiouAEIOU]").length;
        int nrOfConsonants = text.split("[a-zA-Z&&[^aeiouAEIOU]]").length;
        System.out.println("Nr of Vowels is: " + nrOfWovels + " and " + "Nr of Consonants is: " + nrOfConsonants);
    }

    public void getNrOfWords(String text) {
        int words = text.split("[\\s]").length;
        System.out.println("Nr of words:" + words);
    }


    public void countTop5(String text) {
        String[] words = text.split(" ");
        int wrc = 1;

        HashMap<String, Integer> placeOfPastrare = new HashMap<>();
        ArrayList<Integer> listOfTop5 = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    wrc = wrc + 1;    //if equal increment the count
                    words[j] = "0"; //Replace repeated words by zero
                }
            }
            if (!words[i].equals("0"))
                placeOfPastrare.put(words[i], wrc);
            wrc = 1;
        }

        ArrayList<Integer> list = new ArrayList<>(placeOfPastrare.values());
        Collections.sort(list, Collections.reverseOrder());

        //print first top 5 values:
        for (int i = 0; i < 5; i++) {
            listOfTop5.add(list.get(i));
        }
        System.out.println("Top Repeated Words:");
        for (int top : listOfTop5) {
            for (Map.Entry<String, Integer> entry : placeOfPastrare.entrySet()) {
                if (entry.getValue().equals(top)){
                    System.out.println("**" + entry.getKey() + "--->" + top);
                }
            }
        }
    }
}




