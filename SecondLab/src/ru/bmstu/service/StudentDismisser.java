package ru.bmstu.service;

import ru.bmstu.domain.Person;
import ru.bmstu.domain.Student;

public class StudentDismisser implements Dismissable {
    @Override
    public void dismiss(Person p) {
        if (p instanceof Student) {
            Student s = (Student) p;
            System.out.println("=== Отчисление студента ===");
            System.out.println("ФИО: " + s.getFirstName() + " " + s.getSecondName());
            System.out.println("Возраст: " + s.getAge());
            System.out.println("Телефон: " + s.getPhone());
            System.out.println("Группа: " + s.getGroup());
            System.out.println("Курс: " + s.getCourse());
            System.out.println("===========================");
        } else {
            System.out.println("Не студент: " + p.getFirstName() + " " + p.getSecondName());
        }
    }
}