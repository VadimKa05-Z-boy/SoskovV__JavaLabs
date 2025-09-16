package ru.bmstu.service;

import ru.bmstu.domain.Person;
import ru.bmstu.domain.Student;

public interface Dismissable {
    default void dismiss(Person p) {
        if (p instanceof Student) {
            Student s = (Student) p;
            System.out.println(s.getFirstName() + " " + s.getSecondName() + " из группы " + s.getGroup());
        } else {
            System.out.println(p.getFirstName() + " " + p.getSecondName());
        }
    }
}
