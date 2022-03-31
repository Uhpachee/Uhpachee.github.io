import java.util.*;
import java.util.stream.Collectors;

public class randomOrder {
    private static Integer tries = 0;
    private static Double budget;
    public void test1() {
        List<Map<Integer, String>> items = new ArrayList<>();

        items.add(new HashMap<Integer, String>());
    }

    public static void test2() {
        Scanner scan = new Scanner(System.in);
        //makes sure it only asks for budget once so that when it iterates it doesn't ask for it again
        if (tries == 0) {
            System.out.println("Budget:");
            budget = Double.parseDouble(scan.nextLine());
        }
        tries += 1;
        //creates overarching hashmap that includes restaurants
        Map<String, Map<String, Double>> items1 = new HashMap<>();
        //creates each restaurant
        Map<String, Double> CFA = new HashMap<>();
        Map<String, Double> McD = new HashMap<>();
        Map<String, Double> Wdy = new HashMap<>();
        //adds items to each of the restaurants
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
        //adds restaurants to main hashmap
        items1.put("Chick Fil A", CFA);
        items1.put("McDonald's", McD);
        items1.put("Wendy's", Wdy);
        Random rand = new Random();
        //gets keys from main hashmap containing all restaurants
        List<String> restaurants = new ArrayList<>(items1.keySet());
        //sets random restaurant
        String restaurant = restaurants.get(rand.nextInt(restaurants.size()));
        //grabs the keyset from the correct restaurant and puts it in a menu list
        List<String> menu = new ArrayList<>(items1.get(restaurant).keySet());


        //checks if selected item is overbudget, if it is it reruns and says sorry
        //this gets the restaurant from the items1 hashmap and then gets the menu items from the restaurant
        double item = items1.get(restaurant).get(menu.get(rand.nextInt(menu.size())));
        if (item > budget) {
            System.out.println("sorry");
            randomOrder.main(null);
        } else {
            System.out.println("The selected item is the " + menu.get(rand.nextInt(menu.size())) + " from " + restaurant + " and it costs $" + item + ".");
            //allows program to loop if they want to go again
            System.out.println("Would you like to pick again? (y/n)");
            String input = scan.nextLine();
            if (input.equals("y")) {
                //sets tries to 0 in order to let them pick budget again
                tries = 0;
                randomOrder.main(null);
            } else {
                System.out.println("Have a good day!");
            }
        }

        }


    public static void main(String[] args) {
        test2();
    }
}
