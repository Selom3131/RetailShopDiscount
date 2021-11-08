package com.store.retail.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "shop_user")
@Data
public class ShopUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    int id;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "address")
    String address;
}
