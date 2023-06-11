package com.example.mobilele2023.domain.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "brands")
public class BrandEntity extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String name;
    @Column
    private LocalDateTime created;
    @Column
    private LocalDateTime modified;

    @OneToMany(mappedBy = "brand", fetch = FetchType.EAGER)
    private Set<ModelEntity> models;

    public BrandEntity() {
    }

    public String getName() {
        return name;
    }

    public BrandEntity setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public BrandEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public BrandEntity setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public Set<ModelEntity> getModels() {
        return models;
    }

    public BrandEntity setModels(Set<ModelEntity> models) {
        this.models = models;
        return this;
    }


}

//· name – a name of brand.
//
//· created – a date and time.
//
//· modified – a date and time.