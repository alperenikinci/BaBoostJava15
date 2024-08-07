package maratonlar.maraton02.modules;

import maratonlar.maraton02.databases.ManagerDB;
import maratonlar.maraton02.databases.RestaurantDB;
import maratonlar.maraton02.entities.BaseEntity;
import maratonlar.maraton02.entities.Customer;
import maratonlar.maraton02.entities.Manager;
import maratonlar.maraton02.entities.Restaurant;

import java.util.List;
import java.util.Scanner;

public class ManagerModule {
    private static Scanner scanner = new Scanner(System.in);
    private static Manager manager;
    private static ManagerDB managerDatabase;
    private static RestaurantDB restaurantDatabase;


    public static int managerModule(ManagerDB managerDB, RestaurantDB restaurantDB){
        managerDatabase = managerDB;
        restaurantDatabase = restaurantDB;
        int opt;
        opt = managerWelcomeMenuOptions(managerWelcomeMenu());
        return opt;
    }

    private static int managerWelcomeMenu() {
        System.out.println("### MANAGER MENU ###");
        System.out.println("1-Login");
        System.out.println("0-Back To Main Menu");
        System.out.print("Please choose an option : ");
        int opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }
    private static int managerWelcomeMenuOptions(int opt) {
        switch (opt){
            case 1 : {
                Manager manager1 = login();
                if(manager1!=null){
                    manager = manager1;
                    do {
                       opt = managerLoginMenuOptions(managerLoginMenu());
                    } while(opt !=0);
                }
                return opt;
            }
            case 0: {
                System.out.println("Returning to Main Menu");
                return opt;
            }
            default:{
                System.out.println("Plese choose a valid option.");
                return 0;
            }
        }
    }

    private static int managerLoginMenu() {
        System.out.println("1- Restaurant Operations");
        System.out.println("2- Customer Operations");
        System.out.println("3- Reservation Options");
        System.out.println("0- Logout");
        System.out.print("Please choose an option : ");
        int opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }
    private static int managerLoginMenuOptions(int opt) {
        switch (opt){
            case 1 : {
                managerRestaurantMenuOptions(managerRestaurantMenu());
                break;
            }
            case 2 : {
                managerCustomerMenuOptions(managerCustomerMenu());
                break;
            }
            case 3 :{
                managerReseravationMenuOptions(managerReservationMenu());
                break;
            }
            case 0 : {
                System.out.println("You are logged out, returning to main menu");
                break;
            }
            default: {
                System.out.println("Please choose a valid option...");
                managerLoginMenuOptions(managerLoginMenu());
                break;
            }
        }
        return opt;
    }

    private static int managerRestaurantMenu(){
        System.out.println("1- Add Restaurant");
        System.out.println("2- Delete Restaurant");
        System.out.println("0- Back to Main Menu");
        System.out.print("Please choose an option : ");
        int opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }
    private static int managerRestaurantMenuOptions(int opt){
        switch (opt){
            case 1 : {
                addRestaurant();
                break;
            }
            case 2 : {
                deleteRestaurant();
                break;
            }
            case 0 : {
                System.out.println("Returning to Manager Main Menu...");
                break;
            }
            default: {
                System.out.println("Please choose a valid option...");
                managerRestaurantMenuOptions(managerRestaurantMenu());
                break;
            }
        }
        return opt;
    }

    private static int managerCustomerMenu() {
        System.out.println("1- Add Customer");
        System.out.println("2- Delete Customer");
        System.out.println("3- Search Customer");
        System.out.println("4- List Customers");
        System.out.println("0- Back To Main Menu");
        System.out.print("Please choose an option : ");
        int opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }

    private static int managerCustomerMenuOptions(int opt){
        switch (opt){
            case 1 : {
                addCustomer();
                break;
            }
            case 2 : {
                deleteCustomer();
                break;
            }
            case 3 : {
                searchCustomer();
                break;
            }
            case 4: {
                listCustomers();
            }
            case 0 : {
                System.out.println("Returning to Manager Main Menu...");
                break;
            }
            default: {
                System.out.println("Please choose a valid option...");
                managerRestaurantMenuOptions(managerRestaurantMenu());
                break;
            }
        }
        return opt;
    }


    private static int managerReservationMenu(){
        System.out.println("1- List all Reservations");
        System.out.println("0- Back To Main Menu");
        System.out.print("Please choose an option : ");
        int opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }

    private static int managerReseravationMenuOptions(int opt){
        switch (opt){
            case 1: {
                manager.listReservations();
                break;
            }
            case 0: {
                System.out.println("Returning to Manager Main Menu...");
                break;
            }
            default:{
                System.out.println("Please choose a valid option...");
                break;
            }
        }
        return opt;
    }
    private static void addCustomer() {
        System.out.print("Please enter a name : ");
        String name = scanner.nextLine();
        System.out.print("Please enter a surname : ");
        String surname = scanner.nextLine();
        System.out.print("Please enter phone number : ");
        String phoneNo = scanner.nextLine();
        System.out.print("Please enter email : ");
        String email = scanner.nextLine();
        manager.addCustomer(name,surname,phoneNo,email);
    }

    private static void deleteCustomer(){
        manager.findAllCustomers();
        System.out.print("Please enter id of the customer you want to delete : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        manager.deleteCustomer(id);
    }

    private static void searchCustomer(){
        System.out.println("1- Search by name and surname");
        System.out.println("2- Search by email and phone number");
        System.out.print("Please choose an option : ");
        int opt = scanner.nextInt();
        scanner.nextLine();
        switch (opt) {
            case 1: {
                System.out.print("Please enter the name : ");
                String name = scanner.nextLine();
                System.out.print("Please enter the surname : ");
                String surname = scanner.nextLine();
                manager.findByNameAndSurname(name,surname);
                break;
            }
            case 2: {
                System.out.print("Please enter the email : ");
                String email = scanner.nextLine();
                System.out.print("Please enter the phone number : ");
                String phoneNo = scanner.nextLine();
                manager.findByEmailAndPhoneNo(email,phoneNo);
                break;
            }
            default: {
                System.out.println("Please choose a valid option. Returning to Manager Menu");
                break;
            }
        }
    }
    private static void listCustomers(){
        manager.findAllCustomers();
    }


    private static Restaurant addRestaurant() {
        System.out.println("### ADD RESTAURANT ###");
        System.out.print("Please enter a capacity : ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter a name for the new Restaurant : ");
        String name = scanner.nextLine();
        System.out.print("Please enter an address for the new Restaurant : ");
        String address  = scanner.nextLine();
        System.out.print("Please enter a phone number for the new Restaurant : ");
        String phoneNo = scanner.nextLine();
        return manager.addRestaurant(name,address,phoneNo,capacity);
    }

    private static void deleteRestaurant() {
        manager.findAllRestaurant();
        System.out.print("Please enter the id of the Restaurant you want to delete : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        restaurantDatabase.deleteByID(id);
    }


    private static Manager login() {
        System.out.print("Please enter your username : ");
        String userName = scanner.nextLine();
        System.out.print("Please enter your password : ");
        String password = scanner.nextLine();
        return managerDatabase.findByUsernameAndPassword(userName,password);
    }
}
