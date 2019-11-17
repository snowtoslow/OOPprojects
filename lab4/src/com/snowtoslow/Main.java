package com.snowtoslow;

import com.snowtoslow.filereader.MatExpOperation;


public class Main {

    public static void main(String[] args) throws Exception {
        MatExpOperation matExpOperation = new MatExpOperation();

        matExpOperation.readFilesOneByOneAndEvaluateIt("/home/snowtoslow/Documents/one_expression.txt");
        matExpOperation.readFilesOneByOneAndEvaluateIt("/home/snowtoslow/Documents/one_expression2.txt");








    }
}
