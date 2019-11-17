package com.snowtoslow.filereader;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MatExpOperation implements FileReader {


    public void readFilesOneByOneAndEvaluateIt(String path) throws Exception {//read expressions from file
        List<String>  expressions = Files.readAllLines(Paths.get(path));

        String expression;

        for (String s : expressions) {
            expression = s;
            System.out.print("Expression " + expression);
            System.out.println(getExpressionAccuracy(expression));
        }
    }


    private String getExpressionAccuracy(String expressionFromFiles){
        int numarator = 0;
        char[] chars = expressionFromFiles.toCharArray();
        for (char c : chars) {
            if(c == addToNumarator){
                numarator++;
            }else if(c == substractFromNumarator){
                numarator--;
            }
        }
        if (numarator == 0){
            System.out.println(positiveResult + numarator);
        }else{
            System.out.println(negativeResult + numarator);
        }
        return "";
    }





}
