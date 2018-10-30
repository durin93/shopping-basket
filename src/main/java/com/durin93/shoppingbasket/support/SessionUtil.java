package com.durin93.shoppingbasket.support;

import com.durin93.shoppingbasket.domain.Basket;

import javax.servlet.http.HttpSession;

public class SessionUtil {

    private static final String BASKET = "basket";

    public static Basket findBasketFromSession(HttpSession session) {
        if (session.getAttribute(BASKET) == null) {
            Basket basket = new Basket();
            session.setAttribute(BASKET, basket);
            return basket;
        }

        return (Basket) session.getAttribute(BASKET);
    }

}
