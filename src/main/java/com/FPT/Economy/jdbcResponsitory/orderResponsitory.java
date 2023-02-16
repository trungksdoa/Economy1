package com.FPT.Economy.jdbcResponsitory;

import com.FPT.Economy.model.availableProduct;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface orderResponsitory extends CrudRepository<availableProduct, Long> {

    @Override
    Optional<availableProduct> findById(Long id);

    // truy xuất theo thứ tự mặc định (10 sản phẩm mới nhất)
    @Query("SELECT * available_product ORDER BY data_Created DESC LIMIT 10")
    List<availableProduct> findAll();
}   