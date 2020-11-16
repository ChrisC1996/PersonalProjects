package com.sparta.chris;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    private static Logger logger = LogManager.getLogger(Starter.class);

    public static void fullUserInput() {
        int[] inputArray = userInputArray();
//        int chosenSort = userInputSortMethod();
        runDefaultSort(inputArray);
//        executeChosenSort(inputArray, chosenSort);
    }

    private static int[] userInputArray() {
        Scanner scanner = new Scanner(System.in);

        Printer.print("Please enter how many integers you want to sort");

        while(!scanner.hasNextInt()) {
            Printer.print("That's not an integer");
            scanner.next();
        }

        int count = scanner.nextInt();

        while(count < 2) {
            Printer.print("Please enter an integer of 2 or more.");
            count = scanner.nextInt();
        }

        int[] array = new int[count];
        int i=0;

        while(i < count) {
            Printer.print("Element " + (i+1) + ": ");
            try {
                array[i] = scanner.nextInt();
                i++;
            } catch(InputMismatchException e) {
                Printer.print("Incorrect input. Please enter an integer");
                logger.error("Incorrect input when adding an integer to an array.");
                scanner.nextLine();
            }
        }

        Printer.print(Arrays.toString(array));

        return array;
    }

    private static int userInputSortMethod() {
        Scanner scanner = new Scanner(System.in);

        Printer.print("What sort method would you like to use? 1) Bubble Sort  2) Merge sort  3) Tree sort ASC 4) Tree sort DESC");

        try {
            int chosenSort = scanner.nextInt();

            while(chosenSort != 1 && chosenSort != 2 && chosenSort != 3 && chosenSort != 4) {
                Printer.print("Please enter a valid integer (1, 2, 3 or 4)");
                Printer.print(chosenSort);
                scanner.nextLine();
                chosenSort = scanner.nextInt();
            }
            return chosenSort;

        } catch(InputMismatchException e) {
            Printer.print("Incorrect input. Please enter an integer (1, 2, 3 or 4)");
            scanner.nextLine();
        }

        return 1;
    }

    private static void executeChosenSort(int[] array, int sort) {
        if(sort == 1) {
            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.print(bubbleSort.sort(array));
            logger.info("BubbleSort completed");
        }
        else if(sort == 2) {
            MergeSort mergeSort = new MergeSort();
            Printer.print(Arrays.toString(mergeSort.sort(array)));
            logger.info("MergeSort completed");
        }
        else if(sort == 3) {
            BinaryTreeClass binaryTreeClass = new BinaryTreeClass();
            binaryTreeClass.addElements(array);
            binaryTreeClass.sortTree(true);
            logger.info("BinaryTreeSort ASC completed");
        }
        else if(sort == 4) {
            BinaryTreeClass binaryTreeClass = new BinaryTreeClass();
            binaryTreeClass.addElements(array);
            binaryTreeClass.sortTree(false);
            logger.info("BinaryTreeSort DESC completed");
        }
    }

    private static void runDefaultSort(int[] array) {
        Weld weld = new Weld();
        WeldContainer weldContainer = weld.initialize();
        Sorter sorter = weldContainer.select(Sorter.class).get();
        sorter.sort(array);
        weldContainer.close();
    }

}
