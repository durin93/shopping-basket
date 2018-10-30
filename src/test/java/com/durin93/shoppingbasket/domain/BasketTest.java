package com.durin93.shoppingbasket.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BasketTest {

    private Basket basket;

    private Good product1;

    @Before
    public void setUp() {
        basket = new Basket();
        product1 = new Good();
    }

    @Test
    public void addGoods(){
        assertThat(basket.addGood(product1), is(basket));
    }

    @Test
    public void finalPrice() {
        assertThat(basket.finalPrice(),is(0));
    }

}
