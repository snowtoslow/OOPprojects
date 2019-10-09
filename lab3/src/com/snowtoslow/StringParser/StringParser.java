package com.snowtoslow.StringParser;


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
}




