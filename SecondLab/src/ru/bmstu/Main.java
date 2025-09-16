package ru.bmstu;

import ru.bmstu.domain.Person;
import ru.bmstu.domain.Student;
import ru.bmstu.service.PersonDemo;

public class Main {
    public static void main(String[] args) {
        // Создаем человека
        Person person = new Person("Иван", "Иванов", 25, "+79991234567");
        PersonDemo demo1 = new PersonDemo(person);
        demo1.demo();

        // Создаем студента
        Student student = new Student("Петр", "Петров", 20, "+79998765432", "ИВБО-01-21", 2);
        PersonDemo demo2 = new PersonDemo(student);
        demo2.demo();
        demo2.demoDismiss();
    }
}