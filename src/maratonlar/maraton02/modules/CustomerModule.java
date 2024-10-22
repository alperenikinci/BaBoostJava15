package maratonlar.maraton02.modules;

import maratonlar.maraton02.databases.CustomerDB;
import maratonlar.maraton02.databases.ManagerDB;
import maratonlar.maraton02.databases.ReservationDB;
import maratonlar.maraton02.databases.RestaurantDB;
import maratonlar.maraton02.entities.Customer;
import maratonlar.maraton02.entities.Manager;
import maratonlar.maraton02.entities.Reservation;
import maratonlar.maraton02.entities.Restaurant;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerModule {

    private static RestaurantDB restaurantDatabase;
    private static ReservationDB reservationDatabase;
    private static CustomerDB customerDatabase;
    private static Manager manager;
    private static Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


    public static int customerModule(Manager mainManager, RestaurantDB restaurantDB, ReservationDB reservationDB,CustomerDB customerDB) {
        manager = mainManager;
        restaurantDatabase = restaurantDB;
        reservationDatabase = reservationDB;
        customerDatabase = customerDB;
        int opt = 0;
        customerWelcomeMenuOptions(customerWelcomeMenu());
        return opt;
    }


    private static int customerWelcomeMenu() {
        System.out.println("### CUSTOMER MENU ###");
        System.out.println("1- Reservation Operations");
        System.out.println("2- Restaurant Operations");
        System.out.println("0- Return to main menu");
        System.out.print("Please choose an option : ");
        int opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }

    private static int customerWelcomeMenuOptions(int opt) {
        switch (opt) {
            case 1: {
                    reservationMenuOptions(reservationMenu());
                break;
            }
            case 2: {
                    restaurantMenuOptions(restaurantMenu());
                break;
            }
            case 0: {
                System.out.println("Returning to Main Menu...");
                break;
            }
        }
        return opt;
    }
    private static int reservationMenu() {
        System.out.println("1- Make Reservation");
        System.out.println("2- Cancel Reservation");
        System.out.println("0- Back to Customer Menu");
        System.out.print("Please choose an option : ");
        int opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }

    private static int reservationMenuOptions(int opt) {
        switch (opt) {
            case 1: {
                makeReservation();
                break;
            }
            case 2: {
                cancelReservation();
                break;
            }
            case 0: {
                System.out.println("Returning to Customer Menu");
                customerWelcomeMenuOptions(customerWelcomeMenu());
            }
        }
        return opt;
    }

    private static int restaurantMenu() {
        System.out.println("1- Search for a restaurant");
        System.out.println("2- List all the restaurants");
        System.out.println("0- Back to Customer Menu");
        System.out.print("Please select an option : ");
        int opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }

    private static int restaurantMenuOptions(int opt){
        switch (opt){
            case 1: {
                searchARestaurant();
                customerWelcomeMenuOptions(customerWelcomeMenu());
                break;
            }
            case 2: {
                manager.findAllRestaurant();
                customerWelcomeMenuOptions(customerWelcomeMenu());
                break;
            }
            case 0: {
                System.out.println("Returning to Customer Menu");
                customerWelcomeMenuOptions(customerWelcomeMenu());
                break;
            }
            default:{
                System.out.println("Please choose a valid option...");
            }
        }
        return opt;
    }



    private static void searchARestaurant() {
        System.out.print("Please enter the name of the restaurant : ");
        String restaurantName = scanner.nextLine();
        Restaurant restaurant = manager.findRestaurantByName(restaurantName);
        if(restaurant != null){
            System.out.println(restaurant);
        } else {
            System.out.println("There is no restaurant found by the name : " + restaurantName);
        }
    }

    private static void cancelReservation() {
        List<Reservation> reservationList = new ArrayList<>();
        System.out.print("Please enter your email : ");
        String email = scanner.nextLine();
        System.out.print("Please enter your phone number : ");
        String phoneNo = scanner.nextLine();
        if(customerDatabase.existsByEmailAndPhoneNo(email,phoneNo)){
            int customerId = manager.findByEmailAndPhoneNo(email,phoneNo).getId();
            reservationList = reservationDatabase.findPendingByCustomerId(customerId);
            if(!reservationList.isEmpty()){
                reservationList.forEach(System.out::println);
                System.out.print("Enter the id of the reservation you wish to cancel : ");
                int reservationId = scanner.nextInt();
                scanner.nextLine();
                Reservation reservation = reservationDatabase.findByID(reservationId);
                if (reservation!=null){
                    manager.cancelReservation(reservation);
                    System.out.println("Your reservation is cancelled.");
                } else {
                    System.out.println("There is no reservation found by the id : " + reservationId);
                }
            } else {
                System.out.println("There are no reservation found by your name... ");
            }
        } else {
            System.out.println("There is no customer found by your credentials...");
        }
    }

    private static void makeReservation() {
        System.out.print("Are you an old customer? (Y/N) : ");
        String input = scanner.nextLine();
        switch (input) {
            case "Y": {
                System.out.print("Please enter your registered email : ");
                String email = scanner.nextLine();
                System.out.print("Please enter your registered phone number : ");
                String phoneNo = scanner.nextLine();
                Customer customer = manager.findByEmailAndPhoneNo(email, phoneNo);
                if(customer == null){
                    System.out.println("There is no customer found by email and phone number : " + email + " " + phoneNo);
                } else {
                    makeReservationForACustomer(customer);
                }

                break;
            }
            case "N": {
                Customer customer = addCustomer();
                if(customer == null){
                    System.out.println("You are directed to main menu... ");
                }else{
                    makeReservationForACustomer(customer);
                }
                break;
            }
            default:{
                System.out.println("Please choose a valid option... ");
                break;
            }
        }
    }

    private static Reservation makeReservationForACustomer(Customer customer){
            manager.findAllRestaurant();
            System.out.print("Please select a restaurant id : ");
            int restaurantId = scanner.nextInt();
            if (restaurantDatabase.existsById(restaurantId)) {

                System.out.print("How many people ? : ");
                int personCount = scanner.nextInt();
                scanner.nextLine();
                System.out.print("When ? dd/MM/yyyy HH:mm : "); //"07/07/2024 21:15";
                String date = scanner.nextLine();
                LocalDateTime reservationDateTime = LocalDateTime.parse(date, formatter);
                if (reservationDateTime.isBefore(LocalDateTime.now())) {
                    System.out.println("You can't make reservations back to the past...");
                    System.out.println("Your reservation is not registered...");
                    return null;
                } else {
                   return manager.makeReservation(customer, restaurantDatabase.findByID(restaurantId), personCount, reservationDateTime);
                }
            } else {
                return null;
            }
    }
    private static Customer addCustomer() {
        System.out.print("Please enter a name : ");
        String name = scanner.nextLine();
        System.out.print("Please enter a surname : ");
        String surname = scanner.nextLine();
        System.out.print("Please enter phone number : ");
        String phoneNo = scanner.nextLine();
        System.out.print("Please enter email : ");
        String email = scanner.nextLine();
        return manager.addCustomer(name, surname, phoneNo, email);
    }


}
