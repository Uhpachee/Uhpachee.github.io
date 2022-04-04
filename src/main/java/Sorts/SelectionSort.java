package Sorts;
import java.util.*;
public class SelectionSort {
    public static void selectionSort(List<Integer> list) {
        int n = list.size();
        
        for (int i = 0; i < n-1; i++) {
            int num = i;

            for (int j = i+1; j < n; j++)
                if (list.get(j) < list.get(num))
                    num = j;

            int temp = list.get(num);
            list.set(num,list.get(i));
            list.set(i,temp);
        }
    }
}
