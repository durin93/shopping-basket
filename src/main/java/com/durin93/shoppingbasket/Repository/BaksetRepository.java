package com.durin93.shoppingbasket.Repository;

import com.durin93.shoppingbasket.domain.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaksetRepository extends JpaRepository<Basket, Long> {

}
