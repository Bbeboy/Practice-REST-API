package com.application.repository;

import com.application.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
}
