package ru.larik1.springcorehw2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@Component
public class SpringConfig { //надеюсь сюда я сделал компот правильно

    @Bean
public Student student1() { //создаем нашего студнета по параметрам класса Student и так же БИН
    Student student = new Student(); //новый объект
    student.setId(1);
    student.setName ("Mаксим");
    student.setUsername ("Иванов");
    return student;
    }



  @Bean
public Student student2() {
    Student student = new Student();
    student.setId(2);
    student.setName ("Иван");
    student.setUsername("Кундровцев ");
    return student;
    }

@Bean
public Student student3() {
    Student student = new Student();
    student.setId(3);
    student.setName("Анна ");
    student.setUsername("Сидорова");
    return student;
    }

@Bean
public Student student4() {
    Student student = new Student();
    student.setId(4);
    student.setName("Алена");
    student.setUsername("Лошкарева");
    return student;
    }

@Bean
public Student student5() {
    Student student = new Student();
    student.setId(5);
    student.setName("Никита");
    student.setUsername("Эйсмонт");
    return student;
    }

@Bean
public School school(Student student1) { //созаем класс школа и принимаем в параметрах Студента
    School school = new School();
    school.setName("Spring School");
    school.setAddress("123 Spring St");
    school(student1); // Внедрение студента в школу
    return school;
}
}