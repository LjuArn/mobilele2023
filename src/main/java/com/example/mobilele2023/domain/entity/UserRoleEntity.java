package com.example.mobilele2023.domain.entity;


import com.example.mobilele2023.domain.entity.Enums.RoleEnum;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "roles")
public class UserRoleEntity extends BaseEntity {

    @Column(name = "roleName")
    @Enumerated(EnumType.STRING)
    private RoleEnum roleEnum;

    @OneToMany(mappedBy = "userRole", fetch = FetchType.EAGER)
    private Set<UserEntity> users;

    public UserRoleEntity() {
    }

    public RoleEnum getRoleEnum() {
        return roleEnum;
    }

    public UserRoleEntity setRoleEnum(RoleEnum roleEnum) {
        this.roleEnum = roleEnum;
        return this;
    }

    public Set<UserEntity> getUsers() {
        return users;
    }

    public UserRoleEntity setUsers(Set<UserEntity> users) {
        this.users = users;
        return this;
    }
}
//•	role –  enumerated value.