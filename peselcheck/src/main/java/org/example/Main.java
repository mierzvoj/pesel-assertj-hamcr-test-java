package org.example;

public class Main {
    public static void main(String[] args) {


        Pesel pesel1 = new Pesel("65071209862");
        Pesel pesel2 = new Pesel("02271409867");
        Pesel pesel3 = new Pesel("02271409862");

        System.out.println(pesel3.peseLlAsList());

        System.out.println("PESEL 1: " + pesel1.getPesel());
        System.out.println(pesel1.isPeselValid());
        System.out.println(pesel1.maleOrFemale());
        pesel1.dayOfBirth();
        pesel1.monthOfBirth();
        pesel1.yearOfBirth();
        System.out.println("---------------------------------");
        System.out.println("PESEL 2: " + pesel2.getPesel());
        System.out.println(pesel2.isPeselValid());
        System.out.println(pesel2.maleOrFemale());
        pesel2.dayOfBirth();
        pesel2.monthOfBirth();
        pesel2.yearOfBirth();
        System.out.println("---------------------------------");
        System.out.println("PESEL 3: " + pesel3.getPesel());
        System.out.println(pesel3.isPeselValid());
        System.out.println(pesel3.maleOrFemale());
        pesel3.dayOfBirth();
        pesel3.monthOfBirth();
        pesel3.yearOfBirth();

    }
}