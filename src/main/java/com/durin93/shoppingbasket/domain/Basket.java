package com.durin93.shoppingbasket.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Basket {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "id")
    private List<Good> goods;

    public Basket() {
        goods = new ArrayList<>();
    }

    public Basket addGood(Good good){
        return this;
    }

    public Basket deleteGoods(Good good){
        goods.remove(good);
        return this;
    }

    public int finalPrice() {
        int price = 0;
        for (Good good : goods) {
            price += good.getPrice();
        }
        return price;
    }

    public void removeGoods(Long id) {


    }

    public boolean hasGoods(Good product) {
        return goods.contains(product);
    }
}
