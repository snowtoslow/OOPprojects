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


    public void countTop5(String text){
        String[] words=text.split(" ");  //Split the word from String
        int wrc=1;    //Variable for getting Repeated word count

        //ArrayList<Integer> newArray = new ArrayList<Integer>();
        HashMap<String, Integer> placeOfPastrare = new HashMap<>();
        ArrayList<Integer> placeOfSorting = new ArrayList<Integer>();


        for(int i=0;i<words.length;i++) //Outer loop for Comparison
        {
            for(int j=i+1;j<words.length;j++) //Inner loop for Comparison
            {

                if(words[i].equals(words[j]))  //Checking for both strings are equal
                {
                    wrc=wrc+1;    //if equal increment the count
                    words[j]="0"; //Replace repeated words by zero
                }
            }
            if(words[i]!="0")
                //System.out.println(words[i]+"----->"+wrc); //Printing the word along with count
                placeOfPastrare.put(words[i],wrc);
            wrc=1;

        }
        System.out.println(placeOfPastrare);


    }
}




