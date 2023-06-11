package com.example.mobilele2023.domain.entity;


import com.example.mobilele2023.domain.entity.Enums.EngineEnum;
import com.example.mobilele2023.domain.entity.Enums.TransmissionEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity{

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column
    @Enumerated(EnumType.STRING)
    private EngineEnum engine;

    @Column(columnDefinition = "TEXT")
    private String imageUrl;

    @Column
    private Integer mileage;

    @Column
    private BigDecimal price;

    @Column
    @Enumerated(EnumType.STRING)
    private TransmissionEnum transmission;

    @Column
    private Integer year;

    @Column
    private LocalDateTime created;

    @Column
    private LocalDateTime modified;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private ModelEntity model;

   @ManyToOne
   @JoinColumn(name = "seller_id")
   private UserEntity seller;

    public OfferEntity() {
    }

    public String getDescription() {
        return description;
    }

    public OfferEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public OfferEntity setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OfferEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public OfferEntity setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OfferEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public OfferEntity setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public OfferEntity setYear(Integer year) {
        this.year = year;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public OfferEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public OfferEntity setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public ModelEntity getModel() {
        return model;
    }

    public OfferEntity setModel(ModelEntity model) {
        this.model = model;
        return this;
    }

    public UserEntity getSeller() {
        return seller;
    }

    public OfferEntity setSeller(UserEntity seller) {
        this.seller = seller;
        return this;
    }
}

//•	description – some text.
//•	engine – enumerated value (GASOLINE, DIESEL, ELECTRIC, HYBRID).
//•	imageUrl – the url of image.
//•	mileage – a number.
//•	price – the price of the offer.
//•	transmission – enumerated value (MANUAL, AUTOMATIC).
//•	year – the year of offered car.
//•	created – a date and time.
//•	modified – a date and time.
//•	model – the model of a car.
//•	seller – a user that sells the car.