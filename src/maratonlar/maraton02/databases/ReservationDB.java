package maratonlar.maraton02.databases;

import maratonlar.maraton02.entities.Reservation;
import maratonlar.maraton02.utility.DatabaseManager;
import maratonlar.maraton02.utility.enums.EReservationStatus;

import java.util.ArrayList;
import java.util.List;

public class ReservationDB extends DatabaseManager<Reservation> {

    public List<Reservation> findPendingByCustomerId(int customerId){
        List<Reservation> reservationList = new ArrayList<>();
        for (Reservation reservation : veriListesi){
            if (reservation.getReservationStatus().equals(EReservationStatus.PENDING)&&reservation.getCustomerId()==customerId){
                reservationList.add(reservation);
            }
        }
        return reservationList;
    }
}
