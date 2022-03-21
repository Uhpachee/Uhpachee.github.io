import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;

public class Queue {

    public static void chal1() {
        System.out.println("Challenge 1");
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
            System.out.println("Edited List: " + list);
        }
        System.out.println("Original list: " + list);

        for (int i = -8; i <= list.size(); i++) {
            list.removeFirst();
            System.out.println("Edited list: " + list);
        }
    }

    public static void chal2() {
        System.out.println("\nChallenge 2");
        ArrayList<Integer> finalqueue = new ArrayList<>();
        int[][] queues = {{1,4,5,8},{2,3,6,7}};
        System.out.println("Initial queues: " + Arrays.deepToString(queues));

        for (int i = 0; i < 4; i++) {
            if (queues[0][i] < queues[1][i]) {
                finalqueue.add(queues[0][i]);
                finalqueue.add(queues[1][i]);
            } else {
                finalqueue.add(queues[1][i]);
                finalqueue.add(queues[0][i]);
            }
        }

        System.out.println("Queue: " + finalqueue);


        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            int a = finalqueue.get(i);
            list.add(String.valueOf(a));
            System.out.println("Edited List: " + list);
        }
        System.out.println("Final list: " + list);
    }

    public static void chal3() {
        System.out.println("\nChallenge 3");
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
            System.out.println("Edited List: " + list);
        }
        System.out.println("Original list: " + list);

        for (int i = -8; i <= list.size(); i++) {
            list.removeLast();
            System.out.println("Edited list: " + list);
        }
    }

    public static void main(String[] args) {
        chal1();
        chal2();
        chal3();
    }
}