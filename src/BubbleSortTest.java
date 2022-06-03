import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    private static BubbleSort bubbleSort;


    @BeforeAll
    static void init(){
        bubbleSort = new BubbleSort();
    }
    @Test
    void sort_integers() {
        Comparable[] inputArr = {1,4,5,6,8,3,8};
        Comparable[] expectedArr = {1,3,4,5,6,8,8};
        List<Comparable> input = new ArrayList<>(Arrays.asList(inputArr));
        List<Comparable> expected = new ArrayList<>(Arrays.asList(expectedArr));
        assertEquals(expected,bubbleSort.sort(input));
    }

    @Test
    void sort_doubles()  {
        Comparable[] inputArr = {-9.3,0.2,4.0,0.1,5.0,9.0};
        Comparable[] expectedArr = {-9.3,0.1,0.2,4.0,5.0,9.0};
        List<Comparable> input = new ArrayList<>(Arrays.asList(inputArr));

        List<Comparable> expected = new ArrayList<>(Arrays.asList(expectedArr));
        assertEquals(expected,bubbleSort.sort(input));
    }

    @Test
    void sort_empty() {
        List<Comparable> input = new ArrayList<>();
        List<Comparable> expected = new ArrayList<>();

        assertEquals(expected,bubbleSort.sort(input));
    }
    @Test
    void sort_withNull() {
        Comparable[] inputArr = {null,5.0001};
        Comparable[] expectedArr = {5.0001};
        List<Comparable> input = new ArrayList<>(Arrays.asList(inputArr));
        List<Comparable> expected = new ArrayList<>(Arrays.asList(expectedArr));
        assertEquals(expected,bubbleSort.sort(input));
    }
    @Test
    void sort_null() {
        assertThrows(RuntimeException.class, ()-> bubbleSort.sort(null));

    }



}