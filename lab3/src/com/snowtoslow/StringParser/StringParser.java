package com.snowtoslow.StringParser;

public class StringParser {
    String text1 = "Postscriptum îți scriu din ultima gară, am toamna târzie, în geam tencuială, Stația „Viața” e lungă escală Când ești un veac neiubit. Un veac m-a certat fericirea în rate, un veac internat în singurătate,Eu n-am știut că-nchisorile toate,se-nalță în locuri pustii.  Furtună în gânduri, cuvinte cad sparte, În foaie \\azi plouă cu litere moarte, din rubrica „Soartă” greșind horoscopul, steaua mi l-a citit. în strofe îmi vând vocea-n angine, Un fiu fără casă, cerșesc ca un caine, ca-ntr-un final răgușit lângă tine, să îmi cumpăr tăceri. un veac m-a certat fericirea în rate, un veac internat în singurătate, eu n-am știut că-nchisorile toate se-nalță în locuri pustii. Să rup rădacini, să las cheile-n ușă, să sap mai adânc, să smulg frica capușă, sunt dig din memorii într-un vas cu cenușă, la fundul unei fântâni.";

    private static int count =0;
    public void nrOfLetters(String smth){
        for (int i = 0; i <smth.length() ; i++) {
            count=i;
        }
        System.out.println("Nr of letters in text:" + count);
    }
    public void nrOfSEntences(String smth){
        int nrOfSentences = smth.split("[!?.]+").length;
        System.out.println("Nr of sentences is :" + nrOfSentences);
    }
    public void nrOfConsAndWovels(String smth){
        int nrOfWovels = smth.split("[aeiouAEIOU]").length;
        int nrOfConsonants = smth.split("[a-zA-Z&&[^aeiouAEIOU]]").length;
        System.out.println("Nr of Vowels is: " + nrOfWovels + " and " + "Nr of Consonants is: " + nrOfConsonants);
    }
    public void nrOfWords(String smth){
        int words = smth.split("[\\s]").length;
        System.out.println("Nr of words:" + words);
    }
}




