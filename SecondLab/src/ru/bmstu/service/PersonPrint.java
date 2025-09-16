package ru.bmstu.service;

import  ru.bmstu.domain.Person;

public class PersonPrint {
    // Вывод имени и фамилии Челикса
    public static void printFI(Person p) {
        System.out.println(p.getFirstName() + " " + p.getSecondName());
    }

    // Вывод инфы
    public static void printInfo(Person p) {
        System.out.println("Имя: " + p.getFirstName());
        System.out.println("Фамилия: " + p.getSecondName());
        System.out.println("Возраст: " + p.getAge());
        System.out.println("Телефон: " + (p.getPhone() != null ? p.getPhone() : "не указан"));
    }
}
