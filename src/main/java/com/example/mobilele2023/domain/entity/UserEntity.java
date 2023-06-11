package com.example.mobilele2023.domain.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true)
    private String password;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private boolean isActive;

    @Column(columnDefinition = "TEXT")
    private String imageUrl;

    @Column
    private LocalDateTime created;

    @Column
    private LocalDateTime modified;

    @ManyToOne
    @JoinColumn(name = "user_role_id")
    private UserRoleEntity userRole;

    @OneToMany(mappedBy = "seller", fetch = FetchType.EAGER)
    private Set<OfferEntity> offers;

    public UserEntity() {
    }

    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public boolean isActive() {
        return isActive;
    }

    public UserEntity setActive(boolean active) {
        isActive = active;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public UserEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public UserEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public UserEntity setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public UserRoleEntity getUserRole() {
        return userRole;
    }

    public UserEntity setUserRole(UserRoleEntity userRole) {
        this.userRole = userRole;
        return this;
    }

    public Set<OfferEntity> getOffers() {
        return offers;
    }

    public UserEntity setOffers(Set<OfferEntity> offers) {
        this.offers = offers;
        return this;
    }
}
//•	username – username of the user.
//•	password – password of the user.
//•	firstName –  first name of the user.
//•	lastName –  last name of the user.
//•	isActive – true OR false.
//•	role –  user's role (User or Admin).
//•	imageUrl – a url of user's picture.
//•	created – a date and time.
//•	modified – a date and time.