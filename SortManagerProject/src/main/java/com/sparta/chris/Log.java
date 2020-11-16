package com.sparta.chris;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    private static Logger logger = LogManager.getLogger(Starter.class);

    public void runLogger() {
        logger.trace("This is a trace message");
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }

    public void runExceptions() {
        int dividend = 5;
        int divisor = 0;

        try {
            int quotient = dividend/divisor;
        }
        catch(Exception e) {
            Printer.print(e.getMessage());
            logger.error(e.getMessage());
        }
    }
}
