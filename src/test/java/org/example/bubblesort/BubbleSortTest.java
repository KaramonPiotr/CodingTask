package org.example.bubblesort;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void basicIntegerInput() {
        List<Comparable> input = Arrays.asList(1,4,5,6,8,3,8);
        List<Comparable> expectedResult = Arrays.asList(1,3,4,5,6,8,8);
        List<Comparable> actualReult = new ArrayList<>();

        BubbleSort bubbleSort = new BubbleSort();
        actualReult = bubbleSort.sort(input);

        printInfo(input,expectedResult,actualReult);
        assertEquals(expectedResult,actualReult);
    }
    @Test
    void mixedIntegerDoubleInput() {
        List<Comparable> input = Arrays.asList(-9.3,0.2,4,0.1,5,9);
        List<Comparable> expectedResult = Arrays.asList(-9.3,0.1,0.2,4,5,9);
        List<Comparable> actualReult = new ArrayList<>();

        BubbleSort bubbleSort = new BubbleSort();
        actualReult = bubbleSort.sort(input);

        printInfo(input,expectedResult,actualReult);
        assertEquals(expectedResult,actualReult);
    }
    @Test
    void emptyListInput() {
        List<Comparable> input = Arrays.asList();
        List<Comparable> expectedResult = Arrays.asList();
        List<Comparable> actualReult = new ArrayList<>();

        BubbleSort bubbleSort = new BubbleSort();
        actualReult = bubbleSort.sort(input);

        printInfo(input,expectedResult,actualReult);
        assertEquals(expectedResult,actualReult);
    }
    @Test
    void listWithNullValue() {
        List<Comparable> input = Arrays.asList(null,5.0001);
        List<Comparable> expectedResult = Arrays.asList(5.0001);
        List<Comparable> actualResult = new ArrayList<>();

        BubbleSort bubbleSort = new BubbleSort();
        actualResult = bubbleSort.sort(input);

        printInfo(input,expectedResult,actualResult);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void nullInput() {
        BubbleSort bubbleSort = new BubbleSort();
        assertThrows(RuntimeException.class, () ->{bubbleSort.sort(null);});
    }
    //Aditional methods
    private <T extends Comparable> void printInfo(List<T> input,List<T> expectedOutput,List<T> output){
        System.out.println("-------------------------------------");
        System.out.println("Input:");
        System.out.println(input);
        System.out.println("Expected output:");
        System.out.println(expectedOutput);
        System.out.println("Output:");
        System.out.println(output);
    }
    public <T extends Comparable> List<T> generateExpected(List<T> input){

        List<Comparable> expectedOutput = new ArrayList<>();
        expectedOutput.addAll(input);
        Collections.sort(expectedOutput);
        return (List<T>) expectedOutput;
    }
}