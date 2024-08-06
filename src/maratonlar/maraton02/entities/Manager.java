package maratonlar.maraton02.entities;

import maratonlar.maraton02.databases.CustomerDB;
import maratonlar.maraton02.databases.ManagerDB;
import maratonlar.maraton02.databases.ReservationDB;
import maratonlar.maraton02.databases.RestaurantDB;
import maratonlar.maraton02.utility.enums.EReservationStatus;

import java.time.LocalDateTime;
import java.util.List;

public class Manager extends Person {

    private static int managerCount;
    private final RestaurantDB restaurantDB;
    private final CustomerDB customerDB;
    private final ReservationDB reservationDB;
    private final String USERNAME;
    private String password;

    {
        this.USERNAME = "ADMIN";
        this.password = "12345678";
    }

    public Manager(ManagerDB managerDB, RestaurantDB restaurantDB, CustomerDB customerDB, ReservationDB reservationDB) {
        super(++managerCount);
        managerDB.save(this);
        this.restaurantDB = restaurantDB;
        this.customerDB = customerDB;
        this.reservationDB = reservationDB;
    }

    // RESERVATION METHODS
    public Reservation makeReservation(Customer customer, Restaurant restaurant, int personCount, LocalDateTime reservationDateTime) {
        if (restaurant.getCurrentCapacity() > personCount) {
            Reservation reservation = new Reservation(reservationDB);
            reservation.setCustomerId(customer.getId());
            reservation.setPersonCount(personCount);
            reservation.setRestaurantId(restaurant.getId());
            reservation.setReservationDateTime(reservationDateTime);
            restaurant.setCurrentCapacity(restaurant.getCurrentCapacity() - personCount);
            return reservation;
        } else {
            System.out.println("Restaurant capacity is not able for table for " + personCount);
            return null;
        }
    }
    public Reservation cancelReservation(Reservation reservation) {
        reservation.setReservationStatus(EReservationStatus.CANCELED);
        Restaurant restaurant = restaurantDB.findByID(reservation.getRestaurantId());
        restaurant.setCurrentCapacity(restaurant.getCurrentCapacity() + reservation.getPersonCount());
        return reservation;
    }

    public List<Reservation> listReservations() {
        return reservationDB.findAll();
    }

    // RESTAURANT METHODS
    public Restaurant addRestaurant(String name, String address, String phoneNo, int maximumCapacity) {
        Restaurant restaurant = new Restaurant(restaurantDB, maximumCapacity);
        restaurant.setAddress(address);
        restaurant.setName(name);
        restaurant.setPhoneNo(phoneNo);
        return restaurant;
    }

    public void deleteRestaurant(int id) {
        restaurantDB.deleteByID(id);
    }

    public Restaurant findRestaurantById(int id) {
        return restaurantDB.findByID(id);
    }

    public Restaurant findRestaurantByName(String name) {
        return restaurantDB.findByRestaurantName(name);
    }

    public List<Restaurant> findRestaurantWithCapacity(int personCount) {
        List<Restaurant> restaurantsWithCapacity = restaurantDB.findWithCurrentCapacity(personCount);
        System.out.println("Restaurants With Capacity ");
        restaurantsWithCapacity.forEach(System.out::println);
        return restaurantsWithCapacity;
    }

    public List<Restaurant> findAllRestaurant() {
        List<Restaurant> restaurantList = restaurantDB.findAll();
        System.out.println("Restaurants : ");
        restaurantList.forEach(System.out::println);
        return restaurantList;
    }

    // CUSTOMER METHODS
    public Customer addCustomer(String name, String surname, String phoneNo, String email) {
        if (customerDB.existsByEmailAndPhoneNo(email, phoneNo)) {
            System.out.println("There is a customer related with following informations : " +
                    "\nemail : " + email +
                    "\nphoneNo : " + phoneNo);
            return null;
        } else {
            Customer customer = new Customer(customerDB);
            customer.setName(name);
            customer.setSurname(surname);
            customer.setEmail(email);
            customer.setPhoneNo(phoneNo);
            return customer;
        }
    }

    public void deleteCustomer(int id) {
        customerDB.deleteByID(id);
    }

    public Customer findByNameAndSurname(String name, String surname) {
        List<Customer> customerList = customerDB.findByNameAndSurname(name, surname);
        if (customerList.isEmpty()) {
            System.out.println("There is no customer found by name and surname : " + name + " " + surname);
            return null;
        } else if (customerList.size() == 1) {
            return customerList.get(0);
        } else {
            System.out.println("There are more than one customer by the name and surname : " + name + " " + surname
                    + "\nPlease provide your email and phoneNo : ");
            return null;
        }
    }

    public Customer findByEmailAndPhoneNo(String email, String phoneNo) {
        Customer customer = customerDB.findByEmailAndPhoneNo(email, phoneNo);
        if (customer != null) {
            return customer;
        } else {
            System.out.println("There is no customer found with provided informations...");
            return null;
        }
    }

    public List<Customer> findAllCustomers(){
        List<Customer> customerList = customerDB.findAll();
        customerList.forEach(System.out::println);
        return customerList;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", restaurantDB=" + restaurantDB +
                ", customerDB=" + customerDB +
                ", reservationDB=" + reservationDB +
                '}';
    }
}
