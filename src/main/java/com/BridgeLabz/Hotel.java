package com.BridgeLabz;

public class Hotel {

    private String name;
    private String customerType;
    private int weekEndRate;
    private int weekDayRate;

    Hotel(String name,String customerType,int weekEndRate,int weekDayRate){
        this.name = name;
        this.customerType = customerType;
        this.weekEndRate = weekEndRate;
        this.weekDayRate = weekDayRate;
    }

    String getName(){
        return this.name;
    }
    String getCustomerType(){
        return this.customerType;
    }
    int getWeekEndRate(){
        return  this.weekEndRate;
    }
    int getWeekDayRate(){
        return  this.weekDayRate;
    }
    void setName(String name){
        this.name = name;
    }
    void setCustomerType(String customerType){
        this.customerType = customerType;
    }
    void setWeekEndRate(int weekEndRate){
        this.weekEndRate = weekEndRate;
    }
    void setWeekDayRate(int weekDayRate){
        this.weekDayRate = weekDayRate;
    }
}
