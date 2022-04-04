package Sorts;
import java.util.*;

public class InsertionSort {
    public static void insertionSort(List<Integer> list) {
        int n = list.size();

        for (int i = 1; i < n; ++i) {
            int num = list.get(i);
            int j = i - 1;


            while (j >= 0 && list.get(j) > num) {
                list.set(j + 1,list.get(j));
                j = j - 1;
            }

            list.set(j + 1,num);
        }
    }
}
