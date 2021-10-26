package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class addHotel {
    Scanner sc = new Scanner(System.in);
    ArrayList<addHotel> hotelName = new ArrayList<>();

    public static void addHotel(String name, int rate) {
        HotelReservation hotelReservation = new HotelReservation();


        hotelReservation.setHotelName("Sandalwood", 250);
        System.out.println(hotelReservation.getHotelName()+ " " + rate);

    }
    public static void addHotel1(String name, int rate) {
        HotelReservation hotelReservation = new HotelReservation();


        hotelReservation.setHotelName("Lakewood", 350);
        System.out.println(hotelReservation.getHotelName()+ " " + rate);

    }
    public static void addHotel2(String name, int rate) {
        HotelReservation hotelReservation = new HotelReservation();


        hotelReservation.setHotelName("Hotel Prince", 500);
        System.out.println(hotelReservation.getHotelName()+ " " + rate);

    }


}

