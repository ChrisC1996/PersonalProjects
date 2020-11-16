package com.sparta.chris;

public class Starter {

    public static void start() {
        Dog dog = new Dog();
        dog.sound();
        dog.move();
        dog.setColour("White");
        Printer.print(dog.getNumberOfEars());
        Printer.print(dog.getColour());

        Bird bird = new Bird();
        bird.move();
        bird.sound();
        Printer.print(bird.getNumberOfEars());
        Printer.print(bird.getColour());
    }

}
