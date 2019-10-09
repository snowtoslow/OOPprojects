package com.snowtoslow.StringParser;


public class StringParser {

    private static int count = 0;
    public void nrOfLetters(String smth) {
        for (int i = 0; i < smth.length(); i++) {
            count = i;
        }
        System.out.println("Nr of letters in text:" + count);
    }

    public void nrOfSEntences(String smth) {
        int nrOfSentences = smth.split("[!?.]+").length;
        System.out.println("Nr of sentences is :" + nrOfSentences);
    }

    public void nrOfConsAndWovels(String smth) {
        int nrOfWovels = smth.split("[aeiouAEIOU]").length;
        int nrOfConsonants = smth.split("[a-zA-Z&&[^aeiouAEIOU]]").length;
        System.out.println("Nr of Vowels is: " + nrOfWovels + " and " + "Nr of Consonants is: " + nrOfConsonants);
    }

    public void nrOfWords(String smth) {
        int words = smth.split("[\\s]").length;
        System.out.println("Nr of words:" + words);
    }
}




