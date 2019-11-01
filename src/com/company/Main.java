package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        String [] values = {"Bat","Ball","Stamp"};

        BufferedWriter wr = null;
        try {
            wr = new BufferedWriter(new FileWriter("output.txt"));
            for (String var : values) {
                wr.write(var);
                wr.newLine();
            }
            wr.close();

        } catch (Exception e) {
            //TODO: handle exception
        }


        }



}

