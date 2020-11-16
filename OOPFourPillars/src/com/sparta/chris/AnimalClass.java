package com.sparta.chris;

public class AnimalClass {

    private int NumberOfEars = 2; //Inheritance
    private String colour = "Brown";

    public void sound() { //Polymorphism
        Printer.print("Unknown sound");
    }

    public int getNumberOfEars() { //Encapsulation
        return NumberOfEars;
    }

    public void setNumberOfEars(int numberOfEars) { //Encapsulation
        NumberOfEars = numberOfEars;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
