package com.durin93.shoppingbasket.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BasketTest {

    private Basket basket;

    @Before
    public void setUp() {
        basket = new Basket();
    }

    @Test
    public void finalPrice() {
        assertThat(basket.finalPrice(),is(0));
    }

}
