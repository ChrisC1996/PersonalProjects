package com.sparta.chris.controllers;

import com.sparta.chris.controllers.MyFileReader;

public class Starter {
    public static void start() {
        MyFileReader myFileReader = new MyFileReader();
        myFileReader.readFile();
    }
}
