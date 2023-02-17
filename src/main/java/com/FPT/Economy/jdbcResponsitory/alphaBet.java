package com.FPT.Economy.jdbcResponsitory;

import com.FPT.Economy.model.availableProduct;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface alphaBet extends CrudRepository<availableProduct, Long> {

    @Override
    Optional<availableProduct> findById(Long id);

    // truy xuất sản phẩm theo thứ tự A->Z của tên sản phẩm
    @Query("SELECT * available_product ORDER BY name ASC")
    List<availableProduct> findAll();
}