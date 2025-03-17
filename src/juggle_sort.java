/*
 * Juggle Sort - Java Version
 * @sayanwala117 / Jaspreet Jawanda
 * Date Modified: 2025-03-17
 * 
 * Backstory:
 * Created this sorting algorithm in class while the professor was teaching merge sort.
 * Although lowkey cooked for Data Structures and Algorithms, I thought I'd gain aura from making
 * a sorting algorithm. That did not happen—I still got no aura.
 * 
 * What does it do?
 * Finds the min and max, removes them, then adds them to a new sorted list, and removes them from 
 * the original list. This can be more efficient by using one list and avoiding the remove function.
 * Calling it Juggle Sort because it "juggles" the min and max over and over again.
 * 
 * This is very inefficient as it currently stands. If you use it and think, 
 * "What was going through this guy’s mind?" be assured the winter semester depression is kicking in.
 * 
 * Notes:
 * - The current implementation still uses `.remove()`, making it inefficient.
 * - The recursive structure remains the same as the original Python version.
 * - It should theoretically work for a linked list as well—if you manage to implement that, let me know.
 */

import java.util.ArrayList;
import java.util.List;

public class JuggleSort {

    // Finds the minimum value in a list
    public static int findMin(List<Integer> lst) {
        int minVal = lst.get(0);
        int size = lst.size();

        for (int i = 0; i <= size / 2; i++) {
            if (lst.get(i) < minVal) {
                minVal = lst.get(i);
            }
            if (lst.get(size - 1 - i) < minVal) {
                minVal = lst.get(size - 1 - i);
            }
        }
        return minVal;
    }

    // Finds the maximum value in a list
    public static int findMax(List<Integer> lst) {
        int maxVal = lst.get(0);
        int size = lst.size();

        for (int i = 0; i <= size / 2; i++) {
            if (lst.get(i) > maxVal) {
                maxVal = lst.get(i);
            }
            if (lst.get(size - 1 - i) > maxVal) {
                maxVal = lst.get(size - 1 - i);
            }
        }
        return maxVal;
    }

    // Sorts the list using Juggle Sort
    private static List<Integer> juggleSort(List<Integer> lst, List<Integer> sortedLst, int index) {
        if (sortedLst == null) {
            sortedLst = new ArrayList<>();
            for (int i = 0; i < lst.size(); i++) {
                sortedLst.add(null);
            }
        }

        if (lst.isEmpty()) {
            return sortedLst;
        }

        int minVal = findMin(lst);
        int maxVal = findMax(lst);

        sortedLst.set(index, minVal);
        sortedLst.set(sortedLst.size() - 1 - index, maxVal);

        lst.remove((Integer) minVal);
        if (minVal != maxVal) {
            lst.remove((Integer) maxVal);
        }

        return juggleSort(lst, sortedLst, index + 1);
    }

    public static List<Integer> juggleSort(List<Integer> lst) {
        return juggleSort(new ArrayList<>(lst), null, 0);
    }
}
