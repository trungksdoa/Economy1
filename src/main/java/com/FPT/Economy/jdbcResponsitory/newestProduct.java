package com.FPT.Economy.jdbcResponsitory;

import com.FPT.Economy.model.availableProduct;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface newestProduct extends CrudRepository<availableProduct, Long> {

    @Override
    Optional<availableProduct> findById(Long id);

    // truy xuất sản phẩm theo thứ tự từ mới đến cũ
    @Query("SELECT * available_product ORDER BY data_Created DESC")
    List<availableProduct> findAll();
}