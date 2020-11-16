package com.sparta.engineering72;

import com.sparta.engineering72.Animal.Fox.FoxSkulk;
import com.sparta.engineering72.Simulation.FoxLifeCycle;
import com.sparta.engineering72.Simulation.Simulator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FoxBreedingTests {
    @Test
    public void NoBirthsIn12Months(){
        Simulator.runSimulation(12,1);
        Assertions.assertEquals(0, FoxLifeCycle.foxPregnancies);

    }
    @Test
    public void OneMaleFoxForOneFemaleFox(){
        FoxSkulk foxSkulk = new FoxSkulk();
        Simulator.runSimulation(46,1);
        Assertions.assertEquals(true, foxSkulk.getMaleFoxPopulation().compareTo(FoxLifeCycle.foxPregnancies) >= 0);
    }

}
