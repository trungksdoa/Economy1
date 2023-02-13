package com.FPT.Economy.jdbcResponsitory;

import com.FPT.Economy.model.availableProduct;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface productResponsitory extends CrudRepository<availableProduct, Long> {

    @Override
    Optional<availableProduct> findById(Long id);

    //    @Query("SELECT * FROM table_name WHERE column = :param") // param này đặt tên gì cũng được nhưng phải hợp lý
    //    List<availableProduct> findAll(@Param("param") String name);
    @Query("SELECT * FROM table_name")
    List<availableProduct> findAll();
}