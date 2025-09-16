package ru.bmstu.service;

import ru.bmstu.domain.Person;
import ru.bmstu.domain.Student;

public class PersonDemo {
    private Person person;

    public PersonDemo(Person person) {
        this.person = person;
    }

    public void demo() {
        System.out.println("=== Демонстрация PersonPrinter ===");
        PersonPrint.printFI(person);
        PersonPrint.printInfo(person);
    }

    public void demoDismiss() {
        System.out.println("\n=== Демонстрация отчисления ===");
        Dismissable dismisser = new StudentDismisser();
        dismisser.dismiss(person);
    }
}