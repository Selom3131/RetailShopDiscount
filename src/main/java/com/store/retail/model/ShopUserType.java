package com.store.retail.model;


import javax.persistence.*;

@Entity
@Table(name = "shop_user_type")
public class ShopUserType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userTypeId")
    int id;
    @Column(name="discount")
    float discount;
}
