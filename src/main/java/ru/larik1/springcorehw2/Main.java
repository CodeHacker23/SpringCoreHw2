package ru.larik1.springcorehw2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        School school = new School(); //создаем обхект нашей школы
        System.out.println("School Name: " + school.getName()); //логично
        System.out.println("School Address: " + school.getAddress());


    }
}
