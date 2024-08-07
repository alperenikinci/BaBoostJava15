package maratonlar.maraton02.entities;

import maratonlar.maraton02.databases.RestaurantDB;
import maratonlar.maraton02.utility.enums.EStatus;

public class Restaurant extends BaseEntity {
    private static int restaurantCount = 0;
    private String name;
    private String address;
    private String phoneNo;
    private int maximumCapacity;
    private int currentCapacity;
    private EStatus status;

    public Restaurant(RestaurantDB restaurantDB,int maximumCapacity) {
        super(++restaurantCount);
        this.maximumCapacity = maximumCapacity;
        this.currentCapacity = maximumCapacity;
        this.status = EStatus.OPEN;
        restaurantDB.save(this);
    }
    public Restaurant(RestaurantDB restaurantDB,String name,int maximumCapacity) {
        super(++restaurantCount);
        this.name = name;
        this.maximumCapacity = maximumCapacity;
        this.currentCapacity = maximumCapacity;
        this.status = EStatus.OPEN;
        restaurantDB.save(this);
    }
    public Restaurant(int maximumCapacity) {
        super(++restaurantCount);
        this.maximumCapacity = maximumCapacity;
        this.currentCapacity = maximumCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id ="+getId()+
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", maximumCapacity=" + maximumCapacity +
                ", currentCapacity=" + currentCapacity +
                ", status=" + status +
                '}';
    }
}
