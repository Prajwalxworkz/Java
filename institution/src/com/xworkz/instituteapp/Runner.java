package com.xworkz.instituteapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Runner {


        public static void main(String[] args) throws Exception
        {
            File file = new File("C:\\Users\\Legion\\OneDrive\\Documents\\getSet\\text.txt");
            BufferedReader br= new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        }
    }
