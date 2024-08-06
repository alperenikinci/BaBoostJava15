package maratonlar.maraton02.databases;

import maratonlar.maraton02.entities.Restaurant;
import maratonlar.maraton02.utility.DatabaseManager;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDB extends DatabaseManager<Restaurant> {
    public Restaurant findByRestaurantName(String name) {

        for (Restaurant restaurant : veriListesi) {
            if (restaurant.getName().equals(name)) {
                return restaurant;
            }
        }
        System.out.println("There is no restaurant found by the name : " + name);
        return null;
    }

    public List<Restaurant> findWithCurrentCapacity(int personCount) {
        List<Restaurant> restaurantsWithCapacity = new ArrayList<>();
        for (Restaurant restaurant : veriListesi) {
            if (restaurant.getCurrentCapacity()>=personCount) {
                restaurantsWithCapacity.add(restaurant);
            }
        }
        return restaurantsWithCapacity;
    }
}
