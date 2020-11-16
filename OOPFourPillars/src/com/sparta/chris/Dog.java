package com.sparta.chris;

public class Dog extends AnimalClass implements AnimalInterface  {
    public void move() {
        Printer.print("Runs");
    }
    public void sound() {
        Printer.print("Bark!");
    }
}
