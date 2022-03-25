import java.util.*;
import java.util.stream.Collectors;

public class randomOrder {
    private static Integer tries = 0;
    private static Double input;
    public void test1() {
        List<Map<Integer, String>> items = new ArrayList<>();

        items.add(new HashMap<Integer, String>());
    }

    public static void test2() {
        Scanner scan = new Scanner(System.in);
        if (tries == 0) {
            System.out.println("Budget:");
            input = Double.parseDouble(scan.nextLine());
        }
        tries += 1;
        Map<String, Map<String, Double>> items1 = new HashMap<>();
        Map<String, Double> CFA = new HashMap<>();
        Map<String, Double> McD = new HashMap<>();
        Map<String, Double> Wdy = new HashMap<>();
        CFA.put("One Chicken Nugget",3.50);
        McD.put("McOne Chicken Nugget",0.01);
        McD.put("McTwo Chicken Nugget",0.51);
        McD.put("McThree Chicken Nugget",1.01);
        McD.put("McMilk Shake",2.50);
        McD.put("McYummy",1.00);
        CFA.put("Two Chicken Nugget",7.00);
        CFA.put("Three Chicken Nugget",10.50);
        CFA.put("Milk Shake",4.00);
        CFA.put("Yummy",5.50);
        Wdy.put("Wendy's Special Sauce",12092103454986.00);
        items1.put("Chick Fil A", CFA);
        items1.put("McDonald's", McD);
        items1.put("Wendy's", Wdy);
        Random rand = new Random();

        List<String> restaurants = new ArrayList<>(items1.keySet());
        //num = restaurant pick
        int num = rand.nextInt(restaurants.size());
        String restaurant = restaurants.get(num);
        List<String> menu = new ArrayList<>(items1.get(restaurant).keySet());
        //num1 = item pick
        int num1 = rand.nextInt(menu.size());


                //put key values into array, pick randomly from array to input in get
        if (items1.get(restaurant).get(menu.get(num1)) > input) {
            System.out.println("sorry");
            randomOrder.main(null);
        } else {
            System.out.println("The selected item is the " + menu.get(num1) + " from " + restaurant + " and it costs $" + items1.get(restaurant).get(menu.get(num1)) + ".");

        }
        }


    public static void main(String[] args) {
        test2();
    }
}
