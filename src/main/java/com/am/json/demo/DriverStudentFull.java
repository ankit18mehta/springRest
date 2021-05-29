package com.am.json.demo;

import java.io.File;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverStudentFull {

    public static void main(String[] args) {

        try {

            //create object mapper
            ObjectMapper obm = new ObjectMapper();
            //read Json file: sample-lite.json and convert it to java pojo
            StudentFull myStudent = obm.readValue(new File("data/sample-full.json"), StudentFull.class);

            //print out the converted data

            System.out.println("Student Last Name :: " + myStudent.getLastName());
            System.out.println("Student Address :: " + myStudent.getAddress().toString());
            System.out.println("Student Languages :: " + Arrays.toString(myStudent.getLanguages()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
