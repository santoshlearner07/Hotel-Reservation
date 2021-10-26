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


}

