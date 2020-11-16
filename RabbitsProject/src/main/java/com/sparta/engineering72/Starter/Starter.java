package com.sparta.engineering72.Starter;

import com.sparta.engineering72.Input.InputCollector;
import com.sparta.engineering72.Simulation.Simulator;
import com.sparta.engineering72.SimulatorGUI;
import com.sparta.engineering72.View.Display;

public class Starter {
    public static void start() {
        chooseApplicationStart(InputCollector.getApplicationChoice());
    }

    private static void chooseApplicationStart(int input) {
        Display.displayStartMessage();
        if (input == 1) {
            int constantChoice =  InputCollector.getConstantsChoice();
            if (constantChoice != 1) {
                InputCollector.getConstantsInput();
            }
            Simulator.runSimulation(InputCollector.getUserInput(), InputCollector.getReportChoice());
        } else if (input == 2) {
            new SimulatorGUI("Rabbit Simulator");
        }
    }
}
