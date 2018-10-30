package com.durin93.shoppingbasket.web;

import com.durin93.shoppingbasket.domain.Basket;
import com.durin93.shoppingbasket.domain.Good;
import com.durin93.shoppingbasket.domain.Option;
import com.durin93.shoppingbasket.service.GoodService;
import com.durin93.shoppingbasket.support.SessionUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/api/carts")
public class ApiBasketController {

    private GoodService goodService;

    public ApiBasketController(GoodService goodService) {
        this.goodService = goodService;
    }

    @PostMapping("{id}")
    public ResponseEntity<Basket> addBasket(@PathVariable Long id, @RequestBody Option option, HttpSession session) {
        Good good = goodService.findGoodById(id);
        Basket basket = SessionUtil.findBasketFromSession(session);
        return ResponseEntity.ok().body(basket.addGood(good));
    }
}
