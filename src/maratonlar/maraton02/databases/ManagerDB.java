package maratonlar.maraton02.databases;

import maratonlar.maraton02.entities.Manager;
import maratonlar.maraton02.utility.DatabaseManager;

public class ManagerDB extends DatabaseManager<Manager> {
    public Manager findByUsernameAndPassword(String userName, String password) {

        for(Manager manager : veriListesi){
            if(manager.getUSERNAME().equals(userName)&& manager.getPassword().equals(password)){
                return manager;
            }
        }
        System.out.println("Credentiels does not match");
        return null;
    }
}
