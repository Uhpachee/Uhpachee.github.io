package Week2FRQs;
import java.util.*;
public class FRQ2 {
    public static int hailstoneLength(int n) {
        ArrayList<Integer> hail = new ArrayList<>();
        hail.add(n);
        int temp;
        int num = n;
        while (num != 1) {
            if (num % 2 == 0) {
                temp = num / 2;
            } else {
                temp = 3 * num + 1;
            }
            hail.add(temp);
            num = temp;
        }
        return hail.size();
    }

    public static boolean isLongSeq(int n) {
        int len = hailstoneLength(n);
        boolean yes = false;
        if (len > n) {
            yes = true;
        }
        return yes;
    }

    public static double prepLong(int n) {
        double longCount = 0.0;
        for (int i = 1; i <= n; i++) {
            if (isLongSeq(i)) {
                longCount += 1;
            }

        }
        return longCount / n;
    }

    public static void main(String[] args) {
        FRQ2 a = new FRQ2();
        System.out.println(a.prepLong(6));
    }
}
