package com.durin93.shoppingbasket.Repository;

import com.durin93.shoppingbasket.domain.Good;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodRepository extends JpaRepository<Good, Long> {
    
}
