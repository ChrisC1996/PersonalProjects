package com.sparta.chris;

public class StringCheck {
    public boolean alphabetCheck(String str) {
        str = str.toLowerCase();

        for(char letter = 'a'; letter <= 'z'; ++letter) {
            if(!str.contains(String.valueOf(letter))) {
                return false;
            }
        }
        return true;
    }
}
