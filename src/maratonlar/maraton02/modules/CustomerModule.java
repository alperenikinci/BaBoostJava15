package maratonlar.maraton02.modules;

import maratonlar.maraton02.databases.ManagerDB;
import maratonlar.maraton02.databases.RestaurantDB;
import maratonlar.maraton02.entities.Manager;

public class CustomerModule {

    private static Manager manager;


    public static int customerModule(Manager mainManager){
        manager = mainManager;

    }
}
