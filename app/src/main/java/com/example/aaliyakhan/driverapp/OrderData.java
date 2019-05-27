package com.example.aaliyakhan.driverapp;

/**
 * Created by AaliyaKhan on 27-05-2019.
 */

public class OrderData {
   private String customername,from,to;

    public String getCustomername() {
        return customername;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public OrderData(String customername, String from, String to) {
        this.customername = customername;
        this.from = from;
        this.to = to;
    }

}
