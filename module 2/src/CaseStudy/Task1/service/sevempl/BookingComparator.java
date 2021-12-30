package CaseStudy.Task1.service.sevempl;

import CaseStudy.Task1.modell.Booking;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDate starDate1 = LocalDate.parse(o1.getStartDate(), formatter);
        LocalDate starDate2 = LocalDate.parse(o2.getStartDate(), formatter);
        LocalDate enDate1 = LocalDate.parse(o1.getBookingId(), formatter);
        LocalDate enDate2 = LocalDate.parse(o2.getEndDate(), formatter);

        if(starDate1.compareTo(starDate2) > 0){
            return 1;
        }else if(starDate1.compareTo(starDate2) < 0){
            return -1;
        } else {
            if(enDate1.compareTo(enDate2) > 0){
                return 1;
            }else if (enDate1.compareTo(enDate2) < 0){
                return -1;
            } else {
                return 0;
            }
        }
    }
}