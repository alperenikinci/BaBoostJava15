package maratonlar.maraton02.entities;

import maratonlar.maraton02.databases.CustomerDB;

public class Customer extends Person {

    private static int customerCount;
    private String phoneNo;
    private String email;

    public Customer(CustomerDB customerDB) {
        super(++customerCount);
        customerDB.save(this);
    }
    public Customer(CustomerDB customerDB,String name,String surname,String email,String phoneNo) {
        super(++customerCount);
        setName(name);
        setSurname(surname);
        this.email = email;
        this.phoneNo = phoneNo;
        customerDB.save(this);
    }

    public static int getCustomerCount() {
        return customerCount;
    }

    public static void setCustomerCount(int customerCount) {
        Customer.customerCount = customerCount;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

