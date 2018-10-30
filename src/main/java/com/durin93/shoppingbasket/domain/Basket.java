package com.durin93.shoppingbasket.domain;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Goods> goods;

    public Basket() {
        goods = new ArrayList<>();
    }

    public Basket addGoods(Goods good){
        goods.add(good);
        return this;
    }

    public int finalPrice() {
        int price = 0;
        for (Goods good : goods) {
            price += good.getPrice();
        }
        return price;
    }
}
