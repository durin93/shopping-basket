package com.durin93.shoppingbasket.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embeddable;

@Embeddable
public class Options {

    @JsonProperty("id")
    private Long optionId;

    private String color;

    private String size;

    private int stock;

}
