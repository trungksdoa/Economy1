package com.FPT.Economy.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("attribute")
@Data
public class productAttriubute {
    @Id
    @Column("id_Attribute")
    private int id;

    @Column("product_id")
    private int productId;

    @Column("screen_resolution")
    private int screenResolution;

    @Column("refresh_rate")
    private int refreshRate;

    @Column("storage_capacity")
    private int storageCapacity;

    @Column("memory_capacity")
    private int memoryCapacity;

    @Column("processor_type")
    private String processorType;

    @Column("graphics_card_type")
    private String graphicsCardType;

    @Column("color")
    private String color;

    @Column("weight")
    private int weight;

    @Column("dimensions")
    private int dimensions;

    @Column("battery_life")
    private int batteryLife;

    @Column("camera_resolution")
    private int cameraResolution;

    // Tạo hàm khởi tạo ở đây//
}
