package maratonlar.maraton02.entities;

import maratonlar.maraton02.databases.ReservationDB;
import maratonlar.maraton02.utility.enums.EReservationStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservation extends BaseEntity {

    private static int reservationCount;
    private int customerId;
    private int restaurantId;
    private LocalDateTime reservationDateTime;
    private int personCount;
    private EReservationStatus reservationStatus;

    //Init block
    {
        this.reservationStatus = EReservationStatus.PENDING;
    }

    public Reservation(ReservationDB reservationDB) {
        super(++reservationCount);
        reservationDB.save(this);
    }

    public static int getReservationCount() {
        return reservationCount;
    }

    public static void setReservationCount(int reservationCount) {
        Reservation.reservationCount = reservationCount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public LocalDateTime getReservationDateTime() {
        return reservationDateTime;
    }

    public void setReservationDateTime(LocalDateTime reservationDateTime) {
        this.reservationDateTime = reservationDateTime;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public EReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(EReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", restaurantId=" + restaurantId +
                ", reservationDateTime=" + reservationDateTime +
                ", personCount=" + personCount +
                ", reservationStatus=" + reservationStatus +
                ", id=" + id +
                '}';
    }
}
