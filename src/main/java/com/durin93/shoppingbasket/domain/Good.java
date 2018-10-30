package com.durin93.shoppingbasket.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Good {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String provider;

    private int price;

    @Embedded
    private Option option;

    @Embedded
    private Shipping shipping;


    public int getPrice() {
        return price;
    }
}
