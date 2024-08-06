package maratonlar.maraton02.databases;

import maratonlar.maraton02.entities.Customer;
import maratonlar.maraton02.utility.DatabaseManager;

import java.util.ArrayList;
import java.util.List;

public class CustomerDB extends DatabaseManager<Customer> {

    public boolean existsByEmailAndPhoneNo(String email, String phoneNo){
        for(Customer customer : veriListesi){
            if(customer.getPhoneNo().equals(phoneNo) && customer.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    public List<Customer> findByNameAndSurname(String name, String surname) {
        List<Customer> customerList = new ArrayList<>();
        for(Customer customer: veriListesi){
            if(customer.getName().equals(name)&& customer.getSurname().equals(surname)){
                customerList.add(customer);
            }
        }
        return customerList;
    }

    public Customer findByEmailAndPhoneNo(String email, String phoneNo) {
        for (Customer customer: veriListesi){
            if (customer.getEmail().equals(email) && customer.getPhoneNo().equals(phoneNo)){
                return customer;
            }
        }
        return null;
    }
}
