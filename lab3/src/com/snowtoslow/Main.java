package com.snowtoslow;

import com.snowtoslow.StringParser.StringParser;

public class Main {

    public static void main(String[] args) {
        String text = "Postscriptum îți scriu din ultima gară, am toamna târzie, în geam tencuială, Stația „Viața” e lungă escală Când ești un veac neiubit. Un veac m-a certat fericirea în rate, un veac internat în singurătate,Eu n-am știut că-nchisorile toate,se-nalță în locuri pustii.  Furtună în gânduri, cuvinte cad sparte, În foaie \\azi plouă cu litere moarte, din rubrica „Soartă” greșind horoscopul, steaua mi l-a citit. în strofe îmi vând vocea-n angine, Un fiu fără casă, cerșesc ca un caine, ca-ntr-un final răgușit lângă tine, să îmi cumpăr tăceri. un veac m-a certat fericirea în rate, un veac internat în singurătate, eu n-am știut că-nchisorile toate se-nalță în locuri pustii. Să rup rădacini, să las cheile-n ușă, să sap mai adânc, să smulg frica capușă, sunt dig din memorii într-un vas cu cenușă, la fundul unei fântâni.";

        StringParser stringParser = new StringParser();

        stringParser.getNrOfLetters(text);//letters

        stringParser.getNrOfSEntences(text);//sentences

        stringParser.getNrOfConsAndWovels(text);//Cons and Vowels

        stringParser.getNrOfWords(text);//WORDS

        stringParser.countTop5(text);

    }
}
