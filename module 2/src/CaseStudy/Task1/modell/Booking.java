package CaseStudy.Task1.modell;

import CaseStudy.Task1.modell.Facility.Facility;
import CaseStudy.Task1.modell.Person.Customer.Customer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Booking  implements Comparable<Booking>{
    private int bookingId;
    private String startDate;
    private String endDate;
    private int customer;
    private String facility;


    public Booking(int bookingId, String startDate, String endDate, int customer, String facility) {
        this.bookingId = bookingId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.facility = facility;
    }

    public Booking(int id, String starDate, String endDate, Customer customer, Facility facility) {
    }


    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customer='" + customer + '\'' +
                ", facility='" + facility + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate starDate1 = LocalDate.parse(this.getStartDate(), formatter);
        LocalDate starDate2 = LocalDate.parse(o.getStartDate(), formatter);
        LocalDate endDate1 = LocalDate.parse(this.getEndDate(), formatter);
        LocalDate endDate2 = LocalDate.parse(o.getEndDate(), formatter);

        if(starDate1.compareTo(starDate2) > 0){
            return 1;
        }else if(starDate1.compareTo(starDate2) < 0){
            return -1;
        } else {
            if(endDate1.compareTo(endDate2) > 0){
                return 1;
            }else if (endDate1.compareTo(endDate2) < 0){
                return -1;
            } else {
                return 0;
            }
        }
    }
}
