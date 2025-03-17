/*
 * Testing for Juggle Sort - Java Version
 * @sayanwala117 / Jaspreet Jawanda
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import juggle_sort;

public class JuggleSortTest {

    // Creates a random list of given size with values between 0 and 100
    public static List<Integer> createRandom(int size) {
        List<Integer> result = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            result.add(rand.nextInt(101)); // Random number between 0 and 100
        }

        return result;
    }

    public static void main(String[] args) {
        // Test 1
        System.out.println(juggle_sort.juggleSort(List.of(3, 5, 1, 8, 2, 7)));

        // Test 2
        System.out.println(juggle_sort.juggleSort(createRandom(9)));

        // Test 3
        System.out.println(juggle_sort.juggleSort(List.of(3, 5, 1, 1, 2, 7)));

        // Test 4 
        System.out.println(juggle_sort.juggleSort(createRandom(10)));
    }
}
