package com.store.retail.model;


import javax.persistence.*;

@Entity
@Table(name = "shop_user_category")
public class ShopUserCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cat_id")
    int id;
    @Column(name = "cat_name")
    String typeName;
    @Column(name="discount")
    float discount;
}
