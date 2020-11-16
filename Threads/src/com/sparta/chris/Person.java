package com.sparta.chris;

import java.util.concurrent.ThreadLocalRandom;

class Person implements Runnable {
    private static int NHSid = 1;

    public synchronized void run() {
        int id1 = this.NHSid;
        int id2 = id1 + 1;
        int id3 = id1 + 2;
        Printer.print(Thread.currentThread().getName() + " NHSId: " + id1 + ", Id2: " + id2 + ", Id3: " + id3);
        setNHSid(id1 + 3);
    }

    public static void setNHSid(int NHSid) {
        Person.NHSid = NHSid;
    }
}
