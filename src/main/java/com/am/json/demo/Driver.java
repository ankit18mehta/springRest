package com.am.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

    public static void main(String[] args) {

        try {

            //create object mapper
            ObjectMapper obm = new ObjectMapper();
            //read Json file: sample-lite.json and convert it to java pojo
            Student myStudent = obm.readValue(new File("data/sample-lite.json"), Student.class);

            //print out the converted data

            System.out.println("Student Name :: " + myStudent.getFirstName());
            System.out.println("Student Name :: " + myStudent.getLastName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
