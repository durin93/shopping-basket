package com.durin93.shoppingbasket.service;

import com.durin93.shoppingbasket.Repository.GoodRepository;
import com.durin93.shoppingbasket.domain.Good;
import org.springframework.stereotype.Service;

@Service
public class GoodService {

    private GoodRepository goodRepository;

    public GoodService(GoodRepository goodRepository) {
        this.goodRepository = goodRepository;
    }

    public Good findGoodById(Long id){
        return goodRepository.findById(id).orElseThrow(NullPointerException::new);
    }

}
