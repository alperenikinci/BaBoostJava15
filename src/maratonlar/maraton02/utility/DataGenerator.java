package maratonlar.maraton02.utility;

import maratonlar.maraton02.databases.CustomerDB;
import maratonlar.maraton02.databases.RestaurantDB;
import maratonlar.maraton02.entities.Customer;
import maratonlar.maraton02.entities.Restaurant;

import java.util.*;

public class DataGenerator {

    private static final String[] NAMES = {"John", "Jane", "Paul", "Anna", "Mike", "Emily"};
    private static final String[] SURNAMES = {"Smith", "Doe", "Brown", "Johnson", "Williams", "Jones"};
    private static final String[] RESTAURANT_NAMES = {"Cafe Central", "The Bistro", "Sushi World", "Pasta Place", "Burger Haven"};
    private static final Random RANDOM = new Random();

    public static List<Customer> generateCustomers(int count, CustomerDB customerDB) {
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String name = NAMES[RANDOM.nextInt(NAMES.length)];
            String surname = SURNAMES[RANDOM.nextInt(SURNAMES.length)];
            String email = name.toLowerCase() + "." + surname.toLowerCase() + "@example.com";
            String phoneNo = "555-" + (1000 + RANDOM.nextInt(9000));
            customers.add(new Customer(customerDB,name, surname, email, phoneNo));
        }
        return customers;
    }

    public static List<Restaurant> generateRestaurants(int count, RestaurantDB restaurantDB) {
        List<Restaurant> restaurants = new ArrayList<>();
        Set<String> usedNames = new HashSet<>();

        // Ensure we have enough unique names
        if (count > RESTAURANT_NAMES.length) {
            throw new IllegalArgumentException("Cannot generate more unique restaurant names than available.");
        }

        while (restaurants.size() < count) {
            String name = RESTAURANT_NAMES[RANDOM.nextInt(RESTAURANT_NAMES.length)];
            if (!usedNames.contains(name)) {
                usedNames.add(name);
                int capacity = 10 + RANDOM.nextInt(90); // Capacity between 10 and 100
                restaurants.add(new Restaurant(restaurantDB, name, capacity));
            }
        }
        return restaurants;
    }
}
