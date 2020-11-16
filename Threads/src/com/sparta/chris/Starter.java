package com.sparta.chris;

public class Starter {

    public static void start() {
        Person task = new Person();

        for(int i=1; i<=10; i++) {
            Thread person = new Thread(task);
            person.setName("person" + i);
            person.start();
        }

    }

    public static void start2() {
        StringCheck stringCheck = new StringCheck();
        String str = "aBcdeufghijklmnFpqr  stvwOjuwqke11xyz";
        if(stringCheck.alphabetCheck(str))
            Printer.print("String contains all the letters of the alphabet");
        else
            Printer.print("String doesn't contain all the letters of the alphabet");
    }
}
