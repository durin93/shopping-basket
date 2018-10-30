package com.durin93.shoppingbasket.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Goods {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String provider;

    private int price;

    @Embedded
    private Options options;

    @Embedded
    private Shipping shipping;

}
