package com.FPT.Economy.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("available_product")
@Data
public class availableProduct {

    @Id
    @Column("id_Product")
    private Integer idProduct;
    private String name;
    private String description;
    private Integer price;
//    @Column("data_Created")
//    private String dataCreated;
    //DATE_CREATED formated Y/M/D
    @CreatedDate
    @Column("created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column("updated_at")
    private LocalDateTime updatedAt;

    // Tạo hàm khởi tạo ở đây//
}