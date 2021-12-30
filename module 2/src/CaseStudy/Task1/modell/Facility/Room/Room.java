package CaseStudy.Task1.modell.Facility.Room;

import CaseStudy.Task1.modell.Facility.Facility;

public class Room extends Facility {
    public String freeServiceIncluded;

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String id, String serviceName, int usableArea, int rentalCosts, int maxPeople, String rentalType, String freeServiceIncluded) {
        super(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room() {
    }


    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maxPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'' +
                ", freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
