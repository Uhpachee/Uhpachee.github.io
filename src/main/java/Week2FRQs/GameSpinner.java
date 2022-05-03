package Week2FRQs;

import java.util.ArrayList;

public class GameSpinner {
    private static ArrayList<Integer> spins = new ArrayList<>();
    private static int sectors;
    public GameSpinner(int n) {
        sectors = n;
    }

    public static int currentRun(){
        return spins.size();
    }

    public static int spin() {
        int num = (int) (Math.random() * sectors) + 1;
        if (spins.size() >= 1) {
            if (num == spins.get(0)) {
                spins.add(num);
            } else {
                spins.clear();
                spins.add(num);
            }
        } else {
            spins.add(num);
        }
        return num;
    }

    public static void main(String[] args) {
        GameSpinner game = new GameSpinner(4);
        System.out.println(spin());
        System.out.println(spin());
        System.out.println(spin());
        System.out.println(spin());
        System.out.println(currentRun());
    }
}
