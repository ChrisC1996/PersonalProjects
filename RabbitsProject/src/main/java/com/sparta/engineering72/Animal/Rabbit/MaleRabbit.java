package com.sparta.engineering72.Animal.Rabbit;

import com.sparta.engineering72.Animal.Animal;

import java.math.BigInteger;

public class MaleRabbit extends Rabbit {
    private BigInteger count;

    public MaleRabbit() {
        super(Animal.Gender.MALE);
        this.gender= Animal.Gender.MALE;
        age = 0;
        count = BigInteger.valueOf(1);
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
    }
}