package com.sparta.engineering72.Animal.Fox;

import com.sparta.engineering72.Animal.Animal;

import java.math.BigInteger;

public class MaleFox extends Fox{
    private BigInteger count;

    public MaleFox() {
        super(Animal.Gender.MALE);
        this.age = 0;
        this.count = BigInteger.valueOf(1);
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
    }
}