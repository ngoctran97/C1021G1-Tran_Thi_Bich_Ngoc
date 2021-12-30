package CaseStudy.Task1.modell.Facility.Villa;

import CaseStudy.Task1.modell.Facility.Facility;

public class Villa extends Facility {
    public String roomStandard; //tieu chuan phong
    public int poolArea ; // dien tich ho boi
    public int numberfloors; // so tang

//    public Villa(String roomStandard, int poolArea, int numberfloors) {
//        this.roomStandard = roomStandard;
//        this.poolArea = poolArea;
//        this.numberfloors = numberfloors;
//    }

    public Villa() {
    }

    public Villa(String id, String serviceName, int usableArea, int rentalCosts, int maxPeople, String rentalType, String roomStandard, int poolArea, int numberfloors) {
        super(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberfloors = numberfloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberfloors() {
        return numberfloors;
    }

    public void setNumberfloors(int numberfloors) {
        this.numberfloors = numberfloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maxPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberfloors=" + numberfloors +
                '}';
    }
}
