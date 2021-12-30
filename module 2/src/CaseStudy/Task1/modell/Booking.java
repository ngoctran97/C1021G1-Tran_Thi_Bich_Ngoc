package CaseStudy.Task1.modell;

public class Booking {
    private String bookingId;a
    private String startDate;
    private String endDate;
    private String customerId;
    private String facilityName;
    private String typeOfService;

    public Booking() {
    }

    public Booking(String bookingId, String startDate, String endDate, String customerId, String facilityName, String typeOfService) {
        this.bookingId = bookingId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.facilityName = facilityName;
        this.typeOfService = typeOfService;
    }

    public String getBookingId() {
        return bookingId;
    }

//    public void setBookingId(String bookingId) {
//        this.bookingId = bookingId;
//    }

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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerId='" + customerId + '\'' +
                ", facilityName='" + facilityName + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
