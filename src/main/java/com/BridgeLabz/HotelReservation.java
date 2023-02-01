package com.BridgeLabz;

import java.util.ArrayList;

public class HotelReservation {

    ArrayList<Hotel> hotel;

    HotelReservation(){
        hotel = new ArrayList<>();
        hotel.add(new Hotel("LakeWood","Regular", 90,110));
        hotel.add(new Hotel("LakeWood","Rewards", 80,80));
        hotel.add(new Hotel("BridgeWood","Regular", 60,160));
        hotel.add(new Hotel("BridgeWood","Rewards", 50,110));
        hotel.add(new Hotel("RidgeWood","Regular", 150,220));
        hotel.add(new Hotel("RidgeWood","Rewards", 40,100));
    }

    public static void main(String[] args) {
        HotelReservation hot = new HotelReservation();



    }

}
