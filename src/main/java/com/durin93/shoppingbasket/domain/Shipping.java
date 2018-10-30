package com.durin93.shoppingbasket.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embeddable;

@Embeddable
public class Shipping {

    private String method;

    @JsonProperty("price")
    private int shippingPrice;

    private Boolean canBundle;

}
