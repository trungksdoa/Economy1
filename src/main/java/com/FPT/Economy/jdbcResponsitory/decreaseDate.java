package com.FPT.Economy.jdbcResponsitory;

import com.FPT.Economy.model.availableProduct;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface decreaseDate extends CrudRepository<availableProduct, Long> {

    @Override
    Optional<availableProduct> findById(Long id);

    // truy xuất các sản phẩm theo thứ tự cũ đến mới 
    @Query("SELECT * available_product ORDER BY data_Created ASC")
    List<availableProduct> findAll();
}