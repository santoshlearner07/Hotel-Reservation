package com.company;

public class HotelReservation extends addHotel {

    static HotelReservation hotelList = new HotelReservation();
    public String hotelName;

    public String getHotelName() {
        return hotelName;
    }

    public boolean setHotelName(String hotelName, int rate) {
        this.hotelName = hotelName;
        return false;
    }

    public String getRegularRateForCustomer() {
        return regularRateForCustomer;
    }

    public void setRegularRateForCustomer(String regularRateForCustomer) {
        this.regularRateForCustomer = regularRateForCustomer;
    }

    public String regularRateForCustomer;


    public static void main(String[] args) {
        System.out.println("-----Welcome to Hotel Reservation Program-----");
        HotelReservation.addHotel("Sandalwood ",250);
        HotelReservation.addHotel1("Lakewood ",350);
        HotelReservation.addHotel2("Hotel Prince ",500);
    }

}

